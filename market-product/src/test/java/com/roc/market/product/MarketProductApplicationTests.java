package com.roc.market.product;

import com.roc.market.product.entity.BrandEntity;
import com.roc.market.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MarketProductApplicationTests {
	@Autowired
	BrandService BrandService ;
	@Test
	void contextLoads() {
		BrandEntity BrandEntity = new BrandEntity();
		BrandEntity.setName("intel");
		BrandService.save(BrandEntity);
		System.out.println("保存成功！！！！");
	}

}
