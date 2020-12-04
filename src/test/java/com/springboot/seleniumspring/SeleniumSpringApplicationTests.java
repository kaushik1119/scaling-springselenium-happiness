package com.springboot.seleniumspring;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SeleniumSpringApplicationTests {
	@Autowired
	private User user;

	//create a configuration class and add bean for faker
	@Autowired
	private Faker faker;

	@Value("${family}")
	private String family;

	@Value("${inta}")
	private int integer1;

	@Value("${intb}")
	private int integer2;

	@Value("${fruitlist}")
	private List<String> fruitList;

	//default value for value injection
	@Value("${myname:Kaushik}")
	private String name;


	@Test
	void contextLoads() {
		user.printDetails();
		System.out.println(family);
		System.out.println("The sum is: " + (integer1 + integer2));
		System.out.println("Number of fruits: " + fruitList.size());
		System.out.println("My name is " + name);

	}

	@Test
	void externalClassTest(){
		System.out.println(faker.name().firstName());
	}

}
