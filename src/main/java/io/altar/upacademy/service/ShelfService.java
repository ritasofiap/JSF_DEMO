package io.altar.upacademy.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


import io.altar.upacademy.repositories.ShelfRepository;
import io.altar.upacademy.model.Shelf;
 
@Named("shelfService")
@RequestScoped

public class ShelfService {

	//@Inject
	//private ProductRepository productList;
	private ShelfRepository shelvesList = ShelfRepository.getInstance();
	
    public ShelfRepository getProductList() {
		return shelvesList;
	}

	public void setProductList(ShelfRepository productList) {
		this.shelvesList = productList;
	}

	public Collection<Shelf> getShelf(){
		return shelvesList.getEntities();
	}
	
	
	
	public Shelf getShelf(Integer entityId){
		return shelvesList.findByEntityId(entityId);
	}
	
	
	
	public ShelfService() {
    }
		
	
//ADD
	public void addToRep(Shelf shelf) {
		shelvesList.addEntityId(shelf);
	}

	
//REMOVE	
	public void removeFromRep(Integer entityId) {
		shelvesList.removeEntityFromTable(getShelf(entityId));
	}
	
	public void clearTable(){
		shelvesList.clearTable();
	}
	
	
//EDIT
	
	public void   editShelfLocal(Integer entityId, String shelfLocal){
		  shelvesList.editShelfLocal(entityId, shelfLocal);
	    }
	    
	public void  editShelfCapacity(Integer entityId, Integer shelfCapacity){
	    	shelvesList.editShelfCapacity(entityId, shelfCapacity);
	     }
	    
	public void  editShelfDailyCost(Integer entityId, Double shelfDailyCost){
	    	shelvesList.editShelfDailyCost(entityId, shelfDailyCost);
	     }
	}	
