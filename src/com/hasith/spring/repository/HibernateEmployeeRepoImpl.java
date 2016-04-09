package com.hasith.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.hasith.spring.model.Employee;

public class HibernateEmployeeRepoImpl implements EmployeeRepo {
	
	/* (non-Javadoc)
	 * @see com.hasith.spring.repository.EmployeeRepo#getAllCustomers()
	 */
	@Override
	public List<Employee> getAllCustomers(){
		List<Employee> emplpoyees = new ArrayList<Employee>();
		emplpoyees.add(new Employee("Jhone", "USA"));
		emplpoyees.add(new Employee("Taro", "UK"));
		emplpoyees.add(new Employee("Kamal", "Colombo"));
		emplpoyees.add(new Employee("Sunil", "Kandy"));
		return emplpoyees;		
	}
}
