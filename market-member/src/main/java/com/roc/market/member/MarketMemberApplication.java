package com.roc.market.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MarketMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketMemberApplication.class, args);
	}

}
