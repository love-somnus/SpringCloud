package com.somnus.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigServerApplication {

	/**
	 * POST http://121.43.162.28:8888/actuator/bus-refresh
	 * POST http://121.43.162.28:9999/actuator/bus-refresh
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
