package io.altar.upacademy.view;

import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.service.ProductService;

import javax.faces.bean.RequestScoped;

@Named("ProductBean")
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

    
    
    
	
}

