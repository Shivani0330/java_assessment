package com.assessment.java;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmentWiseYoungestEmployee {

	public static void main(String[] args) {
		
		List<Employee> employeeList=EmployeeList.listOfEmployees();
		
		Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		map.entrySet().forEach(employees->{
			System.out.println("----------------Department Name : "+employees.getKey()+"----------------");
			employees.getValue().stream().min(Comparator.comparing(Employee::getAge)).stream().collect(Collectors.toList()).forEach(System.out::println);
			
		});
		
		System.out.println("================================Using Optional==========================================");

		//Another Way using Optional

		Map<String, List<Employee>> map1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		map1.entrySet().forEach(employees->{
			System.out.println("---------------Department Name : "+employees.getKey()+"----------------");
			
			Optional<Employee> optionalEmployee = employees.getValue().stream().min(Comparator.comparing(Employee::getAge));
			if(optionalEmployee.isPresent()) {
				System.out.println(optionalEmployee.get());
			}else {
				optionalEmployee.orElseThrow(()->new IllegalArgumentException("No Records found"));
			}
		});
	}

}
