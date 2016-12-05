package com.polarcape.cvmanager.time.service.impl;

import com.polarcape.cvmanager.model.Employee;
import com.polarcape.cvmanager.time.service.BaseService;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public abstract class BaseServiceImpl implements BaseService {

    @Override
    public Employee save(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findAll(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee edit(Employee entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
