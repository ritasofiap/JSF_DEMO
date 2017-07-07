package io.altar.upacademy.repositories;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import io.altar.upacademy.model.Entity;
import io.altar.upacademy.model.Product;

@PersistenceContext(unitName="database")
public class EntityRepository<E extends Entity> {

	private LinkedHashMap<Integer, E> entities = new LinkedHashMap<>();

	public void setEntities(LinkedHashMap<Integer, E> entities) {
		this.entities = entities;
	}

	public Collection<E> getEntities() {
		return entities.values();
	}

	private int index = 0; 

	public int getNextEntityId() { 
		return ++index;
	}

	
	//DB-------------------------------------------
	
	private EntityManager em;
	
	//find(entityClass, primaryKey)
	public Product findEProductInDB(Integer entityId){
		return (Product) em.find(Entity.class, entityId);
	}
	
	public void addEntityToDB(Entity entity){
		em.persist(entity);
	}
	
	public void removeEntityFromDB(Integer entityId) {
		em.remove(findEProductInDB(entityId));
	}
	
	public void editEntityDB(){ //no product ou shelf repo
	}
			
	// read------------------------------------------------
	public E findByEntityId(Integer entityId) {
		return entities.get(entityId);
	}
	

	public int getEntityIndex(E entity) {
		return index;
	}

	// add------------------------------------------------
	public void addEntityId(E entity) {
		int newEntityId = getNextEntityId();
		entity.setEntityId(newEntityId);
		entities.put(entity.getEntityId(), entity);
	}
	
	

	// remove------------------------------------------------
	public void removeEntity(Integer entityId) {
		System.out.println(1);
		entities.remove(entityId);
	}
	
	public void clearTable() {
		entities.clear();
	}

	public void removeEntityFromTable(E entity) {

		entities.remove(entity.getEntityId(), entity);
	}

	// edit------------------------------------------------

	// check if empty------------------------------------------------
	public boolean isEmpty() {
		return entities.isEmpty();
	}

	// entity key
	public Set<Integer> keySet() {
		return entities.keySet();
	}

	// hashmap contains entity
	public boolean containsKey(Integer key) {
		return entities.containsKey(key);
	}

	// show------------------------------------------------
	/*
	 * public void displayEntity(Integer key){
	 * System.out.println(entities.get(key).toString()); }
	 */

	/*
	 * public void editEntity(Integer entityId, String name, Double val, Double
	 * IVA, Double PVP) {
	 * 
	 * ((Product)ProductRepository.getInstance().findByEntityId(entityId)).
	 * setName(name);
	 * ((Product)ProductRepository.getInstance().findByEntityId(entityId)).
	 * setVal(val);
	 * ((Product)ProductRepository.getInstance().findByEntityId(entityId)).
	 * setIVA(IVA);
	 * ((Product)ProductRepository.getInstance().findByEntityId(entityId)).
	 * setPVP(PVP); }
	 */

	/*
	 * public static void editEntity(Integer entityId, Integer shelfLocal,
	 * Integer shelfCapacity, Double shelfDailyCost) {
	 * 
	 * ((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).
	 * setShelfLocal(shelfLocal);
	 * ((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).
	 * setShelfCapacity(shelfCapacity);
	 * ((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).
	 * setShelfDailyCost(shelfDailyCost); }
	 */

}
