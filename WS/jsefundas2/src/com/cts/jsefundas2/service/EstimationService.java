package com.cts.jsefundas2.service;

import com.cts.jsefundas2.model.AdBoard;

public class EstimationService {

	private double paintRate;
	private double borderRate;
	
	public EstimationService(double paintRate, double borderRate) {
		super();
		this.paintRate = paintRate;
		this.borderRate = borderRate;
	}

	public double estimatePaintingCost(AdBoard adboard) {
		return adboard.getArea()*paintRate;
	}
	
	public double estimateBorderingCost(AdBoard adboard) {
		return adboard.getPerimeter()*borderRate;
	}
}
