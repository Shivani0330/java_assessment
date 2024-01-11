package com.assessment.java;

import java.util.List;

public class EmployeeNamesJoinedAfter2015 {

	public static void main(String[] args) {

		List<Employee> employeeList=EmployeeList.listOfEmployees();
		
		employeeList.stream().filter(employee->employee.getYearOfJoining()>2015)
		.map(Employee::getName).forEach(System.out::println);
		

	}

}
