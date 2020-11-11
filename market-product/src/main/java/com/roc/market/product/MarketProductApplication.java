package com.roc.market.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.roc.market.product.dao")
@SpringBootApplication
public class MarketProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketProductApplication.class, args);
	}

}
