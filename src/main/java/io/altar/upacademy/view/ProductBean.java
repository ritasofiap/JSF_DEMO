package io.altar.upacademy.view;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.service.ProductService;

import javax.faces.bean.RequestScoped;

@Named("ProductBean")
//@ManagedBean(name="ProductBean")
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
    
    public Collection<Product> getProducts(){
    	return productService.getProducts();
    }
    
    
 /*  public void  editProduct(){
	   productService.editProduct(newProduct);
   }*/
    

   /* public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }*/


    
    
    //--cars-----//
    
    
  /*  private List<Product> products;
     
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
    }*/
    
    
    
	
}

