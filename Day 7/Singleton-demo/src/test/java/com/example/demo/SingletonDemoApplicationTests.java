package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class SingletonDemoApplicationTests {

	@Autowired
	private Printer printer1;

	@Autowired
	private Printer printer2;

	@Test
	void contextLoads() {
	}

	@Test
	void printerBeanIsSingleton() {
		assertSame(printer1, printer2);
	}

}
