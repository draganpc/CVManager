package com.company.cvmanager_hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import com.company.cvmanager_hibernate.model.*;

public class HibernateStandAlone {
    
    public static void main(String[] args){
        
//        Employee employee1 = new Employee("Stefani", "Kostadinovska", "kostadinovska@gmail.com");
//        Employee employee2 = new Employee("Bojan", "Stoikj", "stoikj@gmail.com");
//        Employee employee3 = new Employee("Dejan", "Pacharski", "pacharski@gmail.com");
//        Employee employee4 = new Employee("Dragan", "Miladinovski", "miladinovski@gmail.com");
//        
//        Skill skill1 = new Skill("JAVA");
//        Skill skill2 = new Skill("ANGULARJS");
//        
//        employee1.setSkill(skill1);
//        employee2.setSkill(skill2);
//        employee3.setSkill(skill1);
//        employee4.setSkill(skill2);
//        
//                
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        
//        session.persist(employee1);
//        session.persist(employee2);
//        session.persist(employee3);
//        session.persist(employee4);
//        
//        
//        
//        List<Employee> employees = (List<Employee>)session.createQuery("select * from EMPLOYEE").list();
//        
//        for(Employee e: employees){
//            System.out.println("Employee details: " + e);
//        }
//        
//        List<Skill> skills = (List<Skill>)session.createQuery("select * from SKILL").list();
//        
//        for(Skill s: skills){
//            System.out.println("Skill: " + s.getName()); 
//        }
//        
//        session.getTransaction().commit();
//        session.close();
//        
        
    }
}
