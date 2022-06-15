package com.cts.jsefundas2.model;

public class CircularAdboard implements AdBoard {

	private int radius;

	public CircularAdboard(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	
}
