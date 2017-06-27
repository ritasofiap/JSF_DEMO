package io.altar.upacademy.repositories;


import java.util.LinkedHashMap;
import java.util.Set;

import io.altar.upacademy.model.Entity;
import io.altar.upacademy.model.Product;

import java.util.Collection;


public class EntityRepository<E extends Entity> {
	
	private LinkedHashMap<Integer, E> entities = new LinkedHashMap<>();  //long ou integer
	

	public void setEntities(LinkedHashMap<Integer, E> entities) {
		this.entities = entities;
	}

	public Collection<E> getEntities(){
		return entities.values();
	}
	
	private int entityId = 0; //tava static
	
	public int getNextEntityId(){  //long ou int  //tava static
		return ++entityId;
	}
	
	
	
	//add
	public void addEntityId(E entity){
			int newEntityId = getNextEntityId();
			entity.setEntityId(newEntityId);
			entities.put(entity.getEntityId(), entity);		
		}
		
	public int getEntityIndex(E entity){
			return entityId;  
		}
	
	
		
	
	//remove
	public void removeEntity(Integer entityId){
		entities.remove(entityId);
	}
		
		
	//edit
	public void editEntity(){
		//entities.put(index, entity);  //getId() //vazio	
	}
	
	
	
	
	
	//read
		public E findByEntityId(Integer entityId){
			return entities.get(entityId);
		}
	
	//show
	/*public void displayEntity(Integer key){
		System.out.println(entities.get(key).toString());
	}*/
		
	
	
	//check if empty
		public boolean isEmpty(){
			return entities.isEmpty();
		}
		
		//entity key
		public Set<Integer> keySet(){
			return entities.keySet();
		}
				
		//hashmap contains entity
		public boolean containsKey(Integer key){
			return entities.containsKey(key);
		}
	
	
	public void editEntity(Integer entityId, String name, Integer val, Double IVA, Double PVP) {
		
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setName(name);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setVal(val);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setIVA(IVA);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setPVP(PVP);
	}
	
		
	/*public static void editEntity(Integer entityId, Integer shelfLocal, Integer shelfCapacity, Double shelfDailyCost) {
		
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfLocal(shelfLocal);
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfCapacity(shelfCapacity);
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfDailyCost(shelfDailyCost);
	}*/

}

