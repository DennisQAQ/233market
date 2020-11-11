package com.roc.market.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MarketWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketWareApplication.class, args);
	}

}
