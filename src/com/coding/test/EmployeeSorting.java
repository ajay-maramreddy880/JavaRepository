package com.coding.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1,"John",25,"Male",25000.00));
		employeeList.add(new Employee(2,"David",32,"Male",52000.00));
		employeeList.add(new Employee(3,"Julie",18,"Female",30000.00));
		employeeList.add(new Employee(4,"Mark",35,"Male",35000.00));
		employeeList.add(new Employee(5,"Martin",50,"Male",67000.00));
		employeeList.add(new Employee(6,"Sofia",45,"Female",45000.00));
		employeeList.add(new Employee(7,"Joseph",35,"Male",45000.00));
		employeeList.add(new Employee(8,"Lucia",32,"Female",30000.00));
		
		List<Employee> sortedEmployeeByName = employeeList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		
		System.out.println("----Sorting Employees Based on Name----");
		System.out.println(sortedEmployeeByName);
		
		List<Employee> sortedEmployeeByAge = employeeList.stream().sorted(Comparator.comparing(Employee::getAge))
				.collect(Collectors.toList());
		
		System.out.println("----Sorting Employees Based on Age----");
		System.out.println(sortedEmployeeByAge);
		
		List<Employee> sortedEmployeeBySalary = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		
		System.out.println("----Sorting Employees Based on Salary----");
		System.out.println(sortedEmployeeBySalary);
		
		List<Employee> sortedEmployeeByNameAndAge = employeeList.stream().sorted(Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getAge)).collect(Collectors.toList());
		
		System.out.println("----Sorting Employees Based on Name and Age----");
		System.out.println(sortedEmployeeByNameAndAge);
		
		List<Employee> sortedEmployeeByNameAndAgeAndSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getAge).thenComparing(Employee::getSalary)).collect(Collectors.toList());
		
		System.out.println("----Sorting Employees Based on Name, Age and Salary----");
		System.out.println(sortedEmployeeByNameAndAgeAndSalary);
	}

}
