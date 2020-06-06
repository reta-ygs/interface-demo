package com.example;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalculatorImpl implements DayOfWeekCalculator {

	final Clock clock;

	public CalculatorImpl(Clock clock) {
		this.clock = clock;
	}

	@Override
	public DayOfWeek today() {
		return LocalDate.now(clock)
				.getDayOfWeek();
	}

	@Override
	public DayOfWeek dayOffset(int dayOffset) {
		return LocalDate.now(clock)
				.plusDays(dayOffset)
				.getDayOfWeek();
	}
}
