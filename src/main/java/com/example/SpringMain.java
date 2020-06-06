package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		DayOfWeekCalculator calculator = context.getBean(DayOfWeekCalculator.class);
		System.out.println(calculator.today());
		System.out.println(calculator.dayOffset(7));
	}
}
