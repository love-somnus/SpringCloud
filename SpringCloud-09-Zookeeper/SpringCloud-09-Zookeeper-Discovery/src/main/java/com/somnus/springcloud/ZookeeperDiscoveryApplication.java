package com.somnus.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Somnus
 * @brief
 * @details
 * @date 2019/1/3 13:50
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZookeeperDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperDiscoveryApplication.class, args);
    }
}
