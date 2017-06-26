package io.altar.upacademy.repositories;

import io.altar.upacademy.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf>{

private static final ShelfRepository INSTANCE = new ShelfRepository();
	
	private ShelfRepository(){	
	}
	
	public static ShelfRepository getInstance(){
		
		return INSTANCE; 
	}
	

}
