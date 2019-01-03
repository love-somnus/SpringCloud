package com.somnus.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Somnus
 * @brief
 * @details
 * @date 2019/1/3 14:21
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ZookeeperConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperConsumerApplication.class, args);
    }
}
