package com.cts.jsefundas3.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTiemApiDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		ZonedDateTime currentNewYork = ZonedDateTime.now(ZoneId.of("GMT-4"));
		System.out.println(currentNewYork);
		
		LocalDate indainIndependence = LocalDate.of(1947, Month.AUGUST,15);
		System.out.println(Period.between(indainIndependence, today));
	}

}
