package com.polarcape.cvmanager.controller;


import com.polarcape.cvmanager.model.Employee;
import com.polarcape.cvmanager.service.BaseService;
import com.polarcape.cvmanager.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    
    @Autowired
BaseService baseService;
    
    @RequestMapping(method = RequestMethod.GET, path = "/save")
    public Employee save() {
        Employee e = new Employee();
        e.setEmail("sdadsadas");
        e.setName("dsdasa");
        
        baseService.save(e);
        return e;
    }

}
