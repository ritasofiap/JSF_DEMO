package io.altar.upacademy.view;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Named;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.service.ProductService;

import javax.faces.bean.RequestScoped;

@Named("ProductBean")
@RequestScoped

public class ProductBean {

	private String randomId;
	private String productName;
	private double productVal;
	private double productIVA;
	private double productPVP;
    private int shelfID;
    
    private Product product = new Product();
 
    
    public ProductBean() {
    	
    }
    
    
    @Inject
    private ProductService productService;
	
    public void addProduct() {
    	productService.addToRep(product);
    }
    
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    
    
    public String getRandomId() {
		return randomId;
	}

	public void setRandomId(String randomId) {
		this.randomId = randomId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductVal() {
		return productVal;
	}

	public void setVal(double productVal) {
		this.productVal = productVal;
	}

	public double getProductIVA() {
		return productIVA;
	}

	public void setProductIVA(double productIVA) {
		this.productIVA = productIVA;
	}

	public double getProductPVP() {
		return productPVP;
	}

	public void setProductPVP(double productPVP) {
		this.productPVP = productPVP;
	}

	public int getShelfID() {
		return shelfID;
	}

	public void setShelfID(int shelfID) {
		this.shelfID = shelfID;
	}

    
    
    
    
    
	
}

