package com.polarcape.cvmanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee extends DAOEntity{

  
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
