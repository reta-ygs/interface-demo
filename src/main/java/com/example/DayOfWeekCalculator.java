package com.example;

import java.time.DayOfWeek;

public interface DayOfWeekCalculator {
	DayOfWeek today();
	DayOfWeek dayOffset(int dayOffset);
	boolean isHolidayToday();
}
