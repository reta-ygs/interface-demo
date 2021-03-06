package com.example;

import java.time.Clock;

public class Main {
	public static void main(String[] args) {
		DayOfWeekCalculator calculator = new CalculatorImpl(Clock.systemDefaultZone());
		System.out.println(calculator.today());
		System.out.println(calculator.dayOffset(7));
	}

	static String holiday(DayOfWeekCalculator calculator) {
		if (calculator.isHolidayToday()) {
			return "Holiday!";
		} else {
			return "はたらけ";
		}
	}
}
