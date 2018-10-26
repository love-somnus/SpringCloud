package com.somnus.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *java -jar /app/SpringCloud-01-Server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer0
 */
@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
