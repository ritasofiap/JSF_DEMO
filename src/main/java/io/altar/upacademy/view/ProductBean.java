package io.altar.upacademy.view;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.service.ProductService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

//@Named("ProductBean")
@ManagedBean(name="ProductBean")
@RequestScoped

public class ProductBean implements Serializable {

	  
    private static final long serialVersionUID = 1L;
    		
    private Product newProduct = new Product();
 
    public ProductBean() {	
    }
    
    public Product getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Product newProduct) {
        this.newProduct = newProduct;
    }
    
    @Inject
    private ProductService productService;
	
    public void addNewProduct() {
    	productService.addToRep(newProduct);
    }
    
 /*  public void  editProduct(){
	   productService.editProduct(newProduct);
   }*/
    

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    //--cars-----//
    
    
    private List<Product> products;
     
    @ManagedProperty("#{productService}")
    private ProductService service;
 
    @PostConstruct
    public void init() {
        products = service.createProducts(10);
    }
     
    public List<Product> getProducts() {
        return products;
    }
 
    public void setService(ProductService service) {
        this.service = service;
    }
    
    
    
	
}

