package com.somnus.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.somnus.springcloud.hystrix.AdminServiceHystrix;

@FeignClient(value = "spring-cloud-client", fallback = AdminServiceHystrix.class)
public interface AdminService {

	@GetMapping("hi")
	public String sayHi(@RequestParam(value = "message") String message);
}
