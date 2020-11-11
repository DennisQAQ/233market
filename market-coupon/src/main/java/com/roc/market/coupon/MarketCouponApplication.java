package com.roc.market.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient //开启nacos注册中心注解
@SpringBootApplication
public class MarketCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketCouponApplication.class, args);
	}

}
