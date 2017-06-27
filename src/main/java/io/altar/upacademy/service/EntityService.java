package io.altar.upacademy.service;

import io.altar.upacademy.model.Entity;
import io.altar.upacademy.repositories.EntityRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EntityService<E extends Entity> {


    public List<E> showEntities(EntityRepository<E> entities){
    	List<E> list = new ArrayList<E>((Collection<E>)entities.getEntities());
    	return list;
    }
    
    public void addEntity(EntityRepository<E> entities, E entity){
    	entities.addEntityId(entity);
    }
 

}
