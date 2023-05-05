package com.ramkishore.pensionmanagement.restClient;

import com.ramkishore.pensionmanagement.model.PensionTransactionDetail;
import com.ramkishore.pensionmanagement.model.ProcessPensionInput;
import com.ramkishore.pensionmanagement.model.ProcessPensionResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "process-pension", url = "http://host.docker.internal:8003")
public interface ProcessPensionClient {

	@PostMapping("/ProcessPension")
	public ProcessPensionResponse calculatePensionAmount(@RequestHeader(name = "Authorization") String token,
			@RequestBody ProcessPensionInput processPensionInput);

	@PostMapping("/ProcessPensionTransaction")
	public boolean saveTransactionDetail(@RequestHeader(name = "Authorization") String token,
			@RequestBody PensionTransactionDetail transactionDetail);

}
