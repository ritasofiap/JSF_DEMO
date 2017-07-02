package io.altar.upacademy.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.model.Shelf;
import io.altar.upacademy.service.ShelfService;


@Named("ShelfBean")
//@ManagedBean(name="productBean")
@RequestScoped
public class ShelfBean {

	private Shelf newShelf = new Shelf();
	 
    public Shelf getNewShelf() {
        return newShelf;
    }

    public void setNewShelf(Shelf newShelf) {
        this.newShelf = newShelf;
    }
    
    public ShelfBean() {	
    }
    
    @Inject
    private ShelfService shelfService;
   
    public List<Shelf> getShelf(){
    	return new ArrayList<Shelf>((Collection<Shelf>)shelfService.getShelf());
    }
    
//ADD
    public void addNewShelf() {
    	shelfService.addToRep(newShelf);
    }
    
 

//REMOVE
    public void removeShelf(Integer entityId) {
    	shelfService.removeFromRep(entityId);
    }
    
    public void clearTable(){
    	shelfService.clearTable();
    }
    
//EDIT
    public void   editShelfLocal(Integer entityId, String shelfLocal){
    	shelfService.editShelfLocal(entityId, shelfLocal);
	    }
	    
	public void  editShelfCapacity(Integer entityId, Integer shelfCapacity){
		shelfService.editShelfCapacity(entityId, shelfCapacity);
	     }
	    
	public void  editShelfDailyCost(Integer entityId, Double shelfDailyCost){
		shelfService.editShelfDailyCost(entityId, shelfDailyCost);
	     }
  	
	
}
