package com.cts.jsefundas3.ui;

import java.util.Set;
import java.util.TreeSet;

import com.cts.jsefundas3.model.Employee;

public class SetDemoApp {

	public static void main(String[] args) {
		//Set<Employee> emps = new HashSet<>();
		//Set<Employee> emps = new LinkedHashSet<>();
		Set<Employee> emps = new TreeSet<>();
		
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
		
		for(Employee e : emps)
			System.out.println(e);
	}

}
