package com.cts.jsefundas.model;

public class Cuboid extends Rectangle {
	
	private int height;
	
	public Cuboid() {
		
	}

	public Cuboid(int length, int breadth,int height) {
		super(length, breadth);
		this.height=height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cuboid [height=" + height + ", Length=" + getLength() + ",Breadth=" + getBreadth() + "]";
	}
	
	
}
