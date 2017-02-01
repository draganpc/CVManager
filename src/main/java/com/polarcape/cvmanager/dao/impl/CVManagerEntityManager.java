package com.polarcape.cvmanager.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.polarcape.cvmanager.model.*;

public interface CVManagerEntityManager {

    EntityManager getEntityManager();
    
    Employee createEmployee(Employee entity);
}