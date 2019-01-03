package com.somnus.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-zookeeper-discovery")
public interface AdminService {

	@GetMapping("hi")
	public String sayHi(@RequestParam(value = "message") String message);
}
