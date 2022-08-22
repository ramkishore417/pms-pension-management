package com.ramkishore.pensionmanagement.restClient;

import com.ramkishore.pensionmanagement.model.PensionTransactionDetail;
import com.ramkishore.pensionmanagement.model.PensionerDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "pensioner-detail", url = "${PENSIONER_DETAIL_URI : http://localhost:8002}")
public interface PensionerDetailClient {

	@GetMapping("/api/pensionerdetail/allPensionerDetails")
	public List<PensionerDetail> getAllPensionerDetails();

	@GetMapping("/api/pensionerdetail/allTransactionDetails")
	public List<PensionTransactionDetail> getAllPensionTransactionDetails();

}
