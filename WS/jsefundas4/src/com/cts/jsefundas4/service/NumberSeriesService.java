package com.cts.jsefundas4.service;

public class NumberSeriesService extends Thread {
	
	private int lb;
	private int ub;
	
	public NumberSeriesService(int lb, int ub,String name) {
		super(name);
		this.lb = lb;
		this.ub = ub;
	}
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=lb;i<ub;i++) {
			System.out.println(t.getName()+"\t"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
