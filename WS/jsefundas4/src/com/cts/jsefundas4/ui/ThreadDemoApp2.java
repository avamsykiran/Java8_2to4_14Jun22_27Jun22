package com.cts.jsefundas4.ui;

import com.cts.jsefundas4.model.Bus;
import com.cts.jsefundas4.service.NumberSeriesService;
import com.cts.jsefundas4.service.ReservationService;

public class ThreadDemoApp2 {

	public static void main(String[] args) {
		Bus bus = new Bus(25);
		
		ReservationService rs1 = new ReservationService(bus, 10, "Vamsy");
		ReservationService rs2 = new ReservationService(bus, 10, "Srinu");
		ReservationService rs3 = new ReservationService(bus, 10, "Sagar");
		
		rs1.start();
		rs2.start();
		rs3.start();
		
		System.out.println("Reservation process initiated...!");
		
		
	}

}
