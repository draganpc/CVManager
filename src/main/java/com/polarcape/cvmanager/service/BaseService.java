package com.polarcape.cvmanager.service;

import com.polarcape.cvmanager.model.Employee;
import java.util.List;


public interface BaseService {

	public Employee save(Employee entity);

	public boolean delete(Employee entity);

	public List<Employee> findAll(Employee entity);	

	public Employee edit(Employee entity);
	
}
