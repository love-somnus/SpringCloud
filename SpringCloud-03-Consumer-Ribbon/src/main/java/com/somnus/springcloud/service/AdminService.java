package com.somnus.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AdminService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
	public String sayHi(String message) {
		return restTemplate.getForObject("http://spring-cloud-client/hi?message=" + message, String.class);
	}

	public String hiError(String message) {
		return "Hi，your message is :\"" + message + "\" but request error.";
	}
}