package com.assessment.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfMaleFemaleInSalesAndMarketing {

	public static void main(String[] args) {
		
		List<Employee> employeeList=EmployeeList.listOfEmployees();
		
		Map<String, List<Employee>> map = 
				employeeList.stream().filter(employees-> employees.getDepartment().equalsIgnoreCase("sales") || employees.getDepartment().equalsIgnoreCase("marketing"))
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
		map.entrySet().forEach(groupByDepartment->{
			System.out.println("Department : "+groupByDepartment.getKey());
			groupByDepartment.getValue().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
			.entrySet().forEach(groupByGender->{
				System.out.println(groupByGender.getKey()+" = "+groupByGender.getValue());
				System.out.println("--------------------");
			});
		});

	}

}
