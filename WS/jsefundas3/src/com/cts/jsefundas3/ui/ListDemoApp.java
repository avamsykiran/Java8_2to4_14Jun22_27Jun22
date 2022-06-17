package com.cts.jsefundas3.ui;

import java.util.ArrayList;
import java.util.List;

import com.cts.jsefundas3.model.Employee;

public class ListDemoApp {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(101, "Vamsy", 455667.90));
		emps.add(new Employee(110, "Vinay", 55667.90));
		emps.add(new Employee(111, "Vasu", 755667.90));
		emps.add(new Employee(121, "Vani", 458667.90));
		emps.add(new Employee(103, "Vanitha", 255667.90));
		emps.add(new Employee(107, "Vimala", 155667.90));
		emps.add(new Employee(105, "Vijay", 255667.90));
		emps.add(new Employee(104, "Vasavi", 955667.90));
		emps.add(new Employee(106, "Veena", 405667.90));
		emps.add(new Employee(109, "Vikram", 355667.90));
		emps.add(new Employee(101, "Vamsy", 455667.90));

		for(int i=0;i<emps.size();i++)
			System.out.println(emps.get(i));
		
		System.out.println("--------------------------------------------");
		
		for(Employee e : emps)
			System.out.println(e);
	}

}
