package com.polarcape.cvmanager.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.polarcape.cvmanager.model.*;


@Repository
public class CVManagerDaoImpl{

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    @Transactional
    public Employee createEmployee(Employee entity){
        entityManager.persist(entity);
        entityManager.flush();
        
        return entityManager.find(Employee.class, entity);
    }
    
    @Transactional
    public List<Employee> getEmployees(){
        Query query = getEntityManager().createQuery("select * from Employee");
        List<Employee> employees = query.getResultList();
        return employees;
    }
    

    @Transactional
    public Employee getEmployeeById(long id){
        return getEntityManager().find(Employee.class, id);
    }
    
    @Transactional
    public Employee updateEmployee(Employee entity){
        entityManager.merge(entity);
        return entityManager.find(Employee.class, entity);
    }
    
    @Transactional
    public boolean deleteEmployeeById(long id){
        Employee e = entityManager.find(Employee.class, id);
        entityManager.remove(e);
        
        return true;
    }
    
    @Transactional
    public List<Skill> getSkills(){
        Query query = getEntityManager().createQuery("select * from Skill");
        List<Skill> skills = query.getResultList();
        return skills;
    }
    
    @Transactional
    public Skill getSkill(long id){
        return getEntityManager().find(Skill.class, id);
    }
    
    
}
