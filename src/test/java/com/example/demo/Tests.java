package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class Tests {

	@Test
	void my_simple_unit_test() {
		Assert.isTrue(true);
		System.out.println("This is a unit test!");
	}

}
