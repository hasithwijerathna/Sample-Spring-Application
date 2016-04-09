package com.hasith.spring.service;

import java.util.List;

import com.hasith.spring.model.Employee;
import com.hasith.spring.repository.EmployeeRepo;
import com.hasith.spring.repository.HibernateEmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepo employeeRepo;;


	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}



	/* (non-Javadoc)
	 * @see com.hasith.spring.service.EmployeeService#getAllCustomer()
	 */
	@Override
	public List<Employee> getAllCustomer() {
		return employeeRepo.getAllCustomers();
	}
}
