package com.assessment.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleAndFemaleEmployeesCount {

	public static void main(String[] args) {
		
		List<Employee> employeeList=EmployeeList.listOfEmployees();
		
		Map<String,Long> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		map.entrySet().forEach(e->System.out.println("Number of "+e.getKey()+" = "+e.getValue()));

	}

}
