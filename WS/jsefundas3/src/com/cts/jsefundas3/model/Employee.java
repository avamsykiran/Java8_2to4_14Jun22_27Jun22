package com.cts.jsefundas3.model;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String name;
	private double basicPay;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, double basicPay) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicPay = basicPay;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicPay=" + basicPay + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId<o.empId?-1:(this.empId>o.empId?1:0);
	}
	
	
}
