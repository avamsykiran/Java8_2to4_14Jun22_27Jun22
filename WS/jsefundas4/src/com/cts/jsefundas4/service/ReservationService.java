package com.cts.jsefundas4.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.jsefundas4.model.Bus;

public class ReservationService extends Thread {

	private Bus bus;
	private int seatsNeeded;
	private List<Integer> seatsReserved;
	
	public ReservationService(Bus bus,int seatsNeeded,String name) {
		super(name);
		this.bus=bus;
		this.seatsNeeded=seatsNeeded;
		this.seatsReserved=new ArrayList<Integer>();
	}
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		synchronized (bus) {
			while(getSeatsLeft()>=seatsNeeded && seatsNeeded>0) {
				int seatNumber = bus.getCurrentSeat()+1;
				seatsReserved.add(seatNumber);			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bus.setCurrentSeat(seatNumber);
				seatsNeeded--;
			}	
		}
		
		System.out.println("Sets Reserved for "+t.getName()+" are "+seatsReserved);
	}
	
	private int getSeatsLeft() {
		return bus.getMaxSeats() - bus.getCurrentSeat()+1;
	}
}
