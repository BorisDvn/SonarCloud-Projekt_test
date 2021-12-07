package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ItTest {

	@Test
	void my_simple_integration_test() {
		Assert.isTrue(true);
		System.out.println("This is a integration test!");
	}

}
