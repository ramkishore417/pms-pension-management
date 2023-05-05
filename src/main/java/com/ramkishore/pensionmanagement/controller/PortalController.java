package com.ramkishore.pensionmanagement.controller;

import com.ramkishore.pensionmanagement.exception.ResourceNotFoundException;
import com.ramkishore.pensionmanagement.model.*;
import com.ramkishore.pensionmanagement.restClient.AuthorizationClient;
import com.ramkishore.pensionmanagement.restClient.PensionerDetailClient;
import com.ramkishore.pensionmanagement.restClient.ProcessPensionClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@Slf4j
@RequiredArgsConstructor
public class PortalController {


	private final AuthorizationClient authorizationClient;
	private final ProcessPensionClient processPensionClient;
	private final PensionerDetailClient pensionerDetailClient;

	@GetMapping("/")
	public String display() {
		return "Welcome to Pension Management Portal";
	}

	// Validating token using authorization-microservice with JWT
	@PostMapping("/token")
	public ResponseEntity<?> loginRequest(@RequestBody AuthRequest authRequest) {
		log.info("START - doLogin");
		String token = null;
		try {
			token = authorizationClient.generateToken(authRequest);
		} catch (Exception e) {
			log.error("EXCEPTION - doLogin");
			throw new ResourceNotFoundException(e.getMessage()+" Token can't be generated.");
		}
		log.debug(token);
		log.info("END - doLogin");
		return ResponseEntity.ok(new Token(token));
	}

	// Getting Pensioner Details from pensioner-detail microservice
	@GetMapping("/pensionerDetails")
	public List<PensionerDetail> getAllPensionerDetail() {
		log.info("START - getAllPensionerDetail");
		List<PensionerDetail> pensionerDetail = null;
		try {
			pensionerDetail = pensionerDetailClient.getAllPensionerDetails();
		} catch (Exception e) {
			log.error("EXCEPTION - getAllPensionerDetail");
			throw new ResourceNotFoundException("Pensioner detail list not found");
		}
		log.info("END - getAllPensionerDetail");
		return pensionerDetail;
	}

	// Getting Processed pension transaction details from pensioner-detail microService */
	@GetMapping("/transactionDetails")
	public List<PensionTransactionDetail> getAllTransactionDetail() {
		log.info("START - getAllTransactionDetail");
		List<PensionTransactionDetail> pensiontransactionDetails = null;
		try {
			pensiontransactionDetails = pensionerDetailClient.getAllPensionTransactionDetails();
		} catch (Exception e) {
			log.error("EXCEPTION - getAllTransactionDetail");
			throw new ResourceNotFoundException("Transaction detail list not found");
		}
		log.info("END - getAllTransactionDetail");
		return pensiontransactionDetails;
	}

	// Calculating Pension of pensioner detail from process-pension microservice
	@PostMapping("/pensionDetail")
	public ResponseEntity<ProcessPensionResponse> getPensionDetail(@RequestHeader(name = "Authorization") String token,
			@RequestBody ProcessPensionInput pensionerInput) {
		log.info("START - getPensionDetail");
		try {
			authorizationClient.authorization(token);
		} catch (Exception e) {
			log.error("EXCEPTION - Getting Pension-Detail");
			throw new ResourceNotFoundException("Enter a valid Token");
		}
		ProcessPensionResponse processPensionResponse = processPensionClient.calculatePensionAmount(token, pensionerInput);
		log.info("END - Getting Pension-Detail");
		return ResponseEntity.ok(processPensionResponse);

	}

	/* Return Success or Failure based on pension Transaction */
	@PostMapping("/processPension")
	public boolean getStatusCode(@RequestHeader(name = "Authorization") String token,
			@RequestBody PensionTransactionDetail transactionDetail) {
		log.info("START - getStatusCode");
		try {
			authorizationClient.authorization(token);
		} catch (Exception e) {
			log.error("EXCEPTION - getStatusCode");
			throw new ResourceNotFoundException("Enter a valid Token");
		}
		log.info("END - getStatusCode");
		return processPensionClient.saveTransactionDetail(token, transactionDetail);
	}

}
