package com.assessment.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWiseEmployeeNames {

	public static void main(String[] args) {
		
		List<Employee> employeeList=EmployeeList.listOfEmployees();
		
		Map<String, List<Employee>> map= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		map.entrySet().forEach(groupByDepartment->{
			System.out.println("Employee Names of Department : "+groupByDepartment.getKey());
			groupByDepartment.getValue().stream().map(employees->employees.getName()).forEach(System.out::println);
		});

	}

}
