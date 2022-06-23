package com.cts.jsefundas4.ui;

import com.cts.jsefundas4.service.NumberSeriesService;

public class ThreadDemoApp01 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());
		
		NumberSeriesService nss1 = new NumberSeriesService(1, 15, "NSS1");
		NumberSeriesService nss2 = new NumberSeriesService(100, 115, "NSS2");
		
		nss1.start();
		nss2.start();
	}

}
