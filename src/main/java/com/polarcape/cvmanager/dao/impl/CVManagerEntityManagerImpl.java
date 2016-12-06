package com.polarcape.cvmanager.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.polarcape.cvmanager.model.*;

@Repository
public class CVManagerEntityManagerImpl implements CVManagerEntityManager {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Transactional
    public Employee createEmployee(Employee entity) {
        getEntityManager().merge(entity);
        return entity;
    }
//    
//    @Transactional
//    public List<Employee> getEmployees(){
//        Query query = getEntityManager().createQuery("select * from Employee");
//        List<Employee> employees = query.getResultList();
//        return employees;
//    }
//    
//
//    @Transactional
//    public Employee getEmployeeById(long id){
//        return getEntityManager().find(Employee.class, id);
//    }
//    
//    @Transactional
//    public Employee updateEmployee(Employee entity){
//        entityManager.merge(entity);
//        return entityManager.find(Employee.class, entity);
//    }
//    
//    @Transactional
//    public boolean deleteEmployeeById(long id){
//        Employee e = entityManager.find(Employee.class, id);
//        entityManager.remove(e);
//        
//        return true;
//    }
//    
////    @Transactional
////    public List<Skill> getSkills(){
////        Query query = getEntityManager().createQuery("select * from Skill");
////        List<Skill> skills = query.getResultList();
////        return skills;
////    }
////    
////    @Transactional
////    public Skill getSkill(long id){
////        return getEntityManager().find(Skill.class, id);
////    }
//    

}
