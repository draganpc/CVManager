package com.company.cvmanager_hibernate.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SKILL")
public class Skill {

    @Id
    @GeneratedValue
    @Column(name = "SKILL_ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    
    public Skill(){}

    public Skill(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmploye(Employee e) {
        this.employee = e;
    }

    public Employee getEmployees() {
        return this.employee;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 83 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Skill other = (Skill) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Skill: ").append(this.name);

        return sb.toString();
    }

}
