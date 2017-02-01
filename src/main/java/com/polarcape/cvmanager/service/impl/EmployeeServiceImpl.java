package com.polarcape.cvmanager.service.impl;

import com.polarcape.cvmanager.dao.impl.CVManagerEntityManager;
import com.polarcape.cvmanager.model.Employee;
import org.springframework.transaction.annotation.Transactional;
import com.polarcape.cvmanager.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    CVManagerEntityManager cVManagerEntityManager;

    @Override
    public Employee save(Employee entity) {
        return cVManagerEntityManager.createEmployee(entity);
    }

    @Override
    public boolean delete(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> findAll(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee edit(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
