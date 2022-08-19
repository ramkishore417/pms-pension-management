package com.ramkishore.pensionmanagement.restClient;

import com.ramkishore.pensionmanagement.model.PensionTransactionDetail;
import com.ramkishore.pensionmanagement.model.PensionerDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "pensioner-detail", url = "http://localhost:8002")
public interface PensionerDetailClient {

	@GetMapping("/allPensionerDetails")
	public List<PensionerDetail> getAllPensionerDetails();

	@GetMapping("/allTransactionDetails")
	public List<PensionTransactionDetail> getAllPensionTransactionDetails();

}
