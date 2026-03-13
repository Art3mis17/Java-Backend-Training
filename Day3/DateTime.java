package com.DateandTime;

import java.time.LocalDate;

public class DateTime {
	public static void main (String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate joiningDate = LocalDate.of(2025, 5,10);
		System.out.println("Today's date: " +today);
		System.out.println("Joining date: " +joiningDate);
	}

}
