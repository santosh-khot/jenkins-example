package com.example.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsExampleApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(JenkinsExampleApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case executed");
		assertEquals(true, true);
	}

}
