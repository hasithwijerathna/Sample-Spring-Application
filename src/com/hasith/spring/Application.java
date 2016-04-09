package com.hasith.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hasith.spring.model.Employee;
import com.hasith.spring.service.EmployeeService;

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		for(Employee employee : employeeService.getAllCustomer()){ 
			System.out.println(employee.toString());
		}
	}
}
