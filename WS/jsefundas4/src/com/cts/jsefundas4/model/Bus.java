package com.cts.jsefundas4.model;

public class Bus {
	
	private int maxSeats;
	private int currentSeat;
	
	public Bus(int maxSeats) {
		this.maxSeats=maxSeats;
		this.currentSeat=-1;
	}

	public int getMaxSeats() {
		return maxSeats;
	}

	public void setMaxSeats(int maxSeats) {
		this.maxSeats = maxSeats;
	}

	public int getCurrentSeat() {
		return currentSeat;
	}

	public void setCurrentSeat(int currentSeat) {
		this.currentSeat = currentSeat;
	}

}
