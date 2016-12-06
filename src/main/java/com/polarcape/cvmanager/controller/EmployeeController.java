package com.polarcape.cvmanager.controller;

import com.polarcape.cvmanager.model.Employee;
import com.polarcape.cvmanager.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.polarcape.cvmanager.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET, value = "/save")
    public Employee save() {
        Employee e = new Employee();
        e.setEmail("sdadsadas");
        e.setName("dsdasa");

        employeeService.save(e);
        return e;
    }

}
