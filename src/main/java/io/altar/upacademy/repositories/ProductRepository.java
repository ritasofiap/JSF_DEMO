package io.altar.upacademy.repositories;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

import io.altar.upacademy.model.Product;


@Named("productRepository")
@ApplicationScoped

public class ProductRepository extends EntityRepository<Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();
  
	public static ProductRepository getInstance(){
		return INSTANCE;
	}
	
	
	
	
    	private ProductRepository(){		
	}
	
	
	
	//  private static ProductRepository instance;	
	/*public static ProductRepository getInstance(){
		 if (instance == null) {
	            instance = new ProductRepository();
	        }
	        return instance;
	}*/
	
	
	
	
	
	
	
	public void addProduct(){
		addEntityId(new Product());
	}
	
/*	public void editEntity(Integer entityId, String name, Double val, Double IVA, Double PVP, ArrayList<Product> productShelves){
	

	}*/
	
}
