package com.polarcape.cvmanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee extends DAOEntity{
    
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

}
