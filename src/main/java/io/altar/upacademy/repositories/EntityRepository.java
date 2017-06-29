package io.altar.upacademy.repositories;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import io.altar.upacademy.model.Entity;
import io.altar.upacademy.model.Product;

import java.util.ArrayList;
import java.util.Collection;


public class EntityRepository<E extends Entity> {
	
	private LinkedHashMap<Integer, E> entities = new LinkedHashMap<>();  //long ou integer
	
	//private List<E> listView = new ArrayList<>();

	public void setEntities(LinkedHashMap<Integer, E> entities) {
		this.entities = entities;
	}

	public Collection<E> getEntities(){
		return entities.values();
	}
	
	private int index = 0; //tava static
	
	public int getNextEntityId(){  //long ou int  //tava static
		return ++index;
	}
	
	/*public List<E> getListView() {
		return listView;
	}

	public void setListView(List<E> listView) {
		this.listView = listView;
	}*/
	
	//read------------------------------------------------
			public E findByEntityId(Integer entityId){
				return entities.get(entityId);
			}
			
			public int getEntityIndex(E entity){
				return index;  
			}
		
	//add------------------------------------------------
	public void addEntityId(E entity){
			int newEntityId = getNextEntityId();
			entity.setEntityId(newEntityId);
			entities.put(entity.getEntityId(), entity);		
		}
			
	//remove------------------------------------------------
	public void removeEntity(Integer entityId){
		entities.remove(entityId);
	}
		
	//edit------------------------------------------------
	public void editEntity(){
		//entities.put(index, entity);  //getId() //vazio	
	}
	
	
		
	
	
		
		
	//check if empty------------------------------------------------
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
	
	
		
		
		//show------------------------------------------------
		/*public void displayEntity(Integer key){
			System.out.println(entities.get(key).toString());
		}*/
		
		
	/*public void editEntity(Integer entityId, String name, Double val, Double IVA, Double PVP) {
		
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setName(name);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setVal(val);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setIVA(IVA);
		((Product)ProductRepository.getInstance().findByEntityId(entityId)).setPVP(PVP);
	}*/


	/*public static void editEntity(Integer entityId, Integer shelfLocal, Integer shelfCapacity, Double shelfDailyCost) {
		
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfLocal(shelfLocal);
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfCapacity(shelfCapacity);
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfDailyCost(shelfDailyCost);
	}*/

}

