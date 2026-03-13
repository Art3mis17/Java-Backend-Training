package com.DateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class WorkYear {
    public static void main (String[] args) {
		LocalDate today = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		LocalDate joiningDate = LocalDate.of(2024, 5,10);
		Period workDuration = Period.between(joiningDate, today);

		System.out.println("Today's date: " +today);
		System.out.println("Today's date and Time : " +dateTime);
		System.out.println("Joining date: " +joiningDate);
		System.out.println("Work duration: "
				+ workDuration.getYears() + " years, "
				+ workDuration.getMonths() + " months, "
				+ workDuration.getDays() + " days");
	}

}
