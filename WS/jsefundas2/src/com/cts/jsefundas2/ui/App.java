package com.cts.jsefundas2.ui;

import com.cts.jsefundas2.model.AdBoard;
import com.cts.jsefundas2.model.CircularAdboard;
import com.cts.jsefundas2.model.RectangularAdboard;
import com.cts.jsefundas2.service.EstimationService;

public class App {

	public static void main(String[] args) {
		EstimationService es = new EstimationService(12, 4);
		
		AdBoard b1 = new RectangularAdboard(10, 20);
		AdBoard b2 = new CircularAdboard(45);
		
		System.out.println(es.estimateBorderingCost(b1));
		System.out.println(es.estimateBorderingCost(b2));
		
		System.out.println(es.estimatePaintingCost(b1));
		System.out.println(es.estimatePaintingCost(b2));
	}

}
