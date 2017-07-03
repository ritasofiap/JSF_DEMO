package io.altar.upacademy.repositories;

import io.altar.upacademy.model.Product;

//@Named("productRepository")
//@ApplicationScoped

public class ProductRepository extends EntityRepository<Product> {

	private static final ProductRepository INSTANCE = new ProductRepository();

	public static ProductRepository getInstance() {
		return INSTANCE;
	}

	private ProductRepository() {
	}

	// --------EDIT

	public void editProductName(Integer entityId, String name) {
		// entities.put(index, entity); //getId() //vazio
		((Product) ProductRepository.getInstance().findByEntityId(entityId)).setName(name);
	}

	public void editProductVal(Integer entityId, Double val) {
		((Product) ProductRepository.getInstance().findByEntityId(entityId)).setVal(val);
	}

	public void editProductIVA(Integer entityId, Double IVA) {
		((Product) ProductRepository.getInstance().findByEntityId(entityId)).setIVA(IVA);
	}

	public void editProductPVP(Integer entityId, Double PVP) {
		((Product) ProductRepository.getInstance().findByEntityId(entityId)).setPVP(PVP);
	}

	/*
	 * public void
	 * addProduct(){https://open.spotify.com/artist/54Xuca1P5nDqfKYZGDfHxl
	 * addEntityId(new Product()); }
	 */

	// private static ProductRepository instance;
	/*
	 * public static ProductRepository getInstance(){ if (instance == null) {
	 * instance = new ProductRepository(); } return instance; }
	 */

	/*
	 * public void editEntity(Integer entityId, String name, Double val, Double
	 * IVA, Double PVP, ArrayList<Product> productShelves){
	 * 
	 * 
	 * }
	 */

}
