package com.company.cvmanager_hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import com.company.cvmanager_hibernate.model.*;

public class HibernateStandAlone {
    
    public static void main(String[] args){
        
        Employee employee1 = new Employee("Stefani", "Kostadinovska", "kostadinovska@gmail.com");
        Employee employee2 = new Employee("Bojan", "Stoikj", "stoikj@gmail.com");
        Employee employee3 = new Employee("Dejan", "Pacharski", "pacharski@gmail.com");
        Employee employee4 = new Employee("Dragan", "Miladinovski", "miladinovski@gmail.com");
        
        Skill skill1 = new Skill("JAVA");
        Skill skill2 = new Skill("ANGULARJS");
        
        employee1.setSkill(skill1);
        employee2.setSkill(skill2);
        employee3.setSkill(skill1);
        employee4.setSkill(skill2);
        
        List<Employee> emp1 = new ArrayList<Employee>();
        
        emp1.add(employee1);
        emp1.add(employee2);
        emp1.add(employee4);
        
        skill1.setEmployees(emp1);
        
        List<Employee> emp2 = new ArrayList<Employee>();
        
        emp2.add(employee3);
        
        skill2.setEmployees(emp2);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.persist(skill1);
        session.persist(skill2);
        
        List<Employee> empJava = (List<Employee>)session.createQuery("from Employee").list();
        
        for(Employee e: empJava){
            System.out.println("Employee details: " + e);
            System.out.println("Employee skill: " + e.getSkill());
        }
        
        List<Skill> empAngular = (List<Skill>)session.createQuery("from Skill").list();
        
        for(Skill s: empAngular){
            System.out.println("Skill: " + s.getName()); 
        }
        
        session.getTransaction().commit();
        session.close();
        
        
    }
}
