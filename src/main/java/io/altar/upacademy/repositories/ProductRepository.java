package io.altar.upacademy.repositories;


import io.altar.upacademy.model.Product;


//@Named("productRepository")
//@ApplicationScoped

public class ProductRepository extends EntityRepository<Product> {
	
	private static final ProductRepository INSTANCE = new ProductRepository();
  
	public static ProductRepository getInstance(){
		return INSTANCE;
	}
	
    private ProductRepository(){		
	}
	
    
    
    
   /* public void addProduct(){
    	addEntityId(new Product());
    }*/
    
    
	/*public void editEntityProduct (int entityId, String name, double val, double IVA, double PVP){
		((Product) findByEntityId(entityId)).setName(name);
		((Product) findByEntityId(entityId)).setVal(val);
		((Product) findByEntityId(entityId)).setIVA(IVA);
		((Product) findByEntityId(entityId)).setPVP(PVP);
	
	}    
    */
    
	//  private static ProductRepository instance;	
	/*public static ProductRepository getInstance(){
		 if (instance == null) {
	            instance = new ProductRepository();
	        }
	        return instance;
	}*/
	
    
	
	
/*	public void editEntity(Integer entityId, String name, Double val, Double IVA, Double PVP, ArrayList<Product> productShelves){
	

	}*/
	
}
