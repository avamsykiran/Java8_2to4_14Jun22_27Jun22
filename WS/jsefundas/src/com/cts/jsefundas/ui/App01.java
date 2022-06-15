package com.cts.jsefundas.ui;

import com.cts.jsefundas.model.Cuboid;
import com.cts.jsefundas.model.Rectangle;

public class App01 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10,5);
		Rectangle r3 = r2;
		
		Cuboid c1 = new Cuboid(10,5,12);
		
		System.out.println(r1);
		System.out.println(r1.hashCode());
		System.out.println(r2);
		System.out.println(r2.hashCode());
		System.out.println(r3);
		System.out.println(r3.hashCode());
		System.out.println(c1);
	}

}
