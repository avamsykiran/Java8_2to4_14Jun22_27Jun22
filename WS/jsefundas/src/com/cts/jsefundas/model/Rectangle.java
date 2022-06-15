package com.cts.jsefundas.model;

public class Rectangle {

	private int length;
	private int breadth;
	
	public Rectangle() {
		
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public static Rectangle add(Rectangle r1,Rectangle r2) {
		return new Rectangle(r1.length+r2.length, r1.breadth+r2.breadth);
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	
}
