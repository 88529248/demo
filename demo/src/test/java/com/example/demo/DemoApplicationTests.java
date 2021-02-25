package com.example.demo;

import com.example.demo.boot.MyConfigurationProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	MyConfigurationProperties myConfigurationProperties;

	@Test
	void contextLoads() {

		System.out.println(myConfigurationProperties.getAge());
		System.out.println(myConfigurationProperties.getName());
	}

}
