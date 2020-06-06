package com.example;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	@Test
	void holiday() {
		MockCalculator mockCalculator = new MockCalculator(true);
		assertEquals(Main.holiday(mockCalculator), "Holiday!");
	}

	@Test
	void notHoliday() {
		MockCalculator mockCalculator = new MockCalculator(false);
		assertEquals(Main.holiday(mockCalculator), "はたらけ");
	}

	class MockCalculator implements DayOfWeekCalculator {

		final boolean holiday;

		MockCalculator(boolean holiday) {
			this.holiday = holiday;
		}

		@Override
		public DayOfWeek today() {
			return null;
		}

		@Override
		public DayOfWeek dayOffset(int dayOffset) {
			return null;
		}

		@Override
		public boolean isHolidayToday() {
			return holiday;
		}
	}
}