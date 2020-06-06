package com.example;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorImplTest {

	// mock時間
	Clock mock = Clock.fixed(
			LocalDate.of(2020, 7, 7)	// 2020/7/7に固定
					.atStartOfDay(ZoneId.systemDefault()).toInstant(),
			ZoneId.systemDefault());
	CalculatorImpl calculator = new CalculatorImpl(mock);

	@Test
	void today() {
		assertEquals(calculator.today(), DayOfWeek.TUESDAY);
	}

	@Test
	void dayOffset() {
		assertEquals(calculator.dayOffset(7), DayOfWeek.TUESDAY);
	}
}