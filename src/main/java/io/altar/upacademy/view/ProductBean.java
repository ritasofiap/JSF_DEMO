package io.altar.upacademy.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.service.ProductService;

@Named("ProductBean")
// @ManagedBean(name="productBean")
@RequestScoped

public class ProductBean {

	private Product newProduct = new Product();

	public Product getNewProduct() {
		return newProduct;
	}

	public void setNewProduct(Product newProduct) {
		this.newProduct = newProduct;
	}

	public ProductBean() {
	}

	@Inject
	private ProductService productService;

	public void addNewProduct() {
		productService.addToRep(newProduct);
	}

	public List<Product> getProducts() {
		return new ArrayList<Product>((Collection<Product>) productService.getProducts());
	}

	public void removeProduct(Integer entityId) {
		productService.removeFromRep(entityId);
	}

	public void clearTable() {
		productService.clearTable();
	}

	public void editProductName(Integer entityId, String name) {
		productService.editProductName(entityId, name);
	}

	public void editProductVal(Integer entityId, Double val) {
		productService.editProductVal(entityId, val);
	}

	public void editProductIVA(Integer entityId, Double IVA) {
		productService.editProductIVA(entityId, IVA);
	}

	public void editProductPVP(Integer entityId, Double PVP) {
		productService.editProductPVP(entityId, PVP);
	}

}

/*
 * public void getProduct(Integer entityId){
 * productService.getProduct(entityId); }
 */

/*
 * public ProductService getProductService() { return productService; }
 * 
 * public void setProductService(ProductService productService) {
 * this.productService = productService; }
 */

// --cars-----//

/*
 * private List<Product> products;
 * 
 * @ManagedProperty("#{productService}") private ProductService service;
 * 
 * @PostConstruct public void init() { products = service.createProducts(10); }
 * 
 * public List<Product> getProducts() { return products; }
 * 
 * public void setService(ProductService service) { this.service = service; }
 */
