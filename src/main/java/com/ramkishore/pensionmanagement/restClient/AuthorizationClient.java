package com.ramkishore.pensionmanagement.restClient;

import com.ramkishore.pensionmanagement.model.AuthRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "authorization-service", url = "http://host.docker.internal:8001")
public interface AuthorizationClient {

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception;

	@GetMapping("/authorize")
	public Boolean authorization(@RequestHeader("Authorization") String token);

}
