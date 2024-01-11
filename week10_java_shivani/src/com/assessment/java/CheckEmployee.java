package com.assessment.java;

import java.util.List;
import java.util.Optional;

public class CheckEmployee {

	public static void main(String[] args) {
		
		List<Employee> employeeList=EmployeeList.listOfEmployees();
		
		Optional<Employee> optional= employeeList.stream().filter(employees->employees.getName().equalsIgnoreCase("Preethi")).findAny();

		if(optional.isEmpty()) {
			System.out.println(optional.get());
		}else
			System.out.println(optional.orElseThrow());
	}

}
