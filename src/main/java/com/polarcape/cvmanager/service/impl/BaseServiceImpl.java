package com.polarcape.cvmanager.service.impl;

import com.polarcape.cvmanager.model.Employee;
import com.polarcape.cvmanager.service.BaseService;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.polarcape.cvmanager.dao.impl.CVManagerDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

@Transactional
public class BaseServiceImpl implements BaseService {
    
    
    CVManagerDaoImpl entityManager = new CVManagerDaoImpl();
    
    @Override
    public Employee save(Employee entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return entityManager.createEmployee(entity);
    }

    @Override
    public boolean delete(Employee entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return entityManager.deleteEmployeeById(entity.getId());
    }

    @Override
    public List findAll(Employee entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return entityManager.getEmployees();
    }

    @Override
    public Employee edit(Employee entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return entityManager.updateEmployee(entity);
    }
    
}
