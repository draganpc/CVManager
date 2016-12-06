package com.polarcape.cvmanager.service;

import com.polarcape.cvmanager.model.*;
import java.util.List;


public interface EmployeeService {

        public Employee save(Employee entity);

	public boolean delete(Employee entity);

	public List<Employee> findAll(Employee entity);	

	public Employee edit(Employee entity);	
}
