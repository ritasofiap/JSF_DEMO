package io.altar.upacademy.repositories;

import io.altar.upacademy.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf>{

private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	public static ShelfRepository getInstance(){
		
		return INSTANCE; 
	}
	
	private ShelfRepository(){	
	}
		
	
 //--------EDIT-------------
    
    public void editShelfLocal(Integer entityId, String shelfLocal){
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfLocal(shelfLocal);
	}
	
	public void editShelfCapacity(Integer entityId, Integer shelfCapacity){
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfCapacity(shelfCapacity);
	}
	
	public void editShelfDailyCost(Integer entityId, Double shelfDailyCost){
		((Shelf)ShelfRepository.getInstance().findByEntityId(entityId)).setShelfDailyCost(shelfDailyCost);
	}

}


	