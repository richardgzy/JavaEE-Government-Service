/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fit5042.repository;

import fit5042.repository.entities.Service;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Stateless
public class JPAServicePRepositoryImpl implements ServiceRepository{
   
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Service> getAllServices()
    {
         return entityManager.createNamedQuery(Service.GET_ALL_QUERY_NAME).getResultList();
    }

    @Override
    public Service searchServiceByName(String name)
    {   
        Service s = entityManager.find(Service.class, name);
        return s;
    }

    @Override
    public Service searchServiceByNo(int no)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Service searchServiceByType(String type)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
