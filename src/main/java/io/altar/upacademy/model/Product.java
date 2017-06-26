package io.altar.upacademy.model;

import java.util.ArrayList;

import io.altar.upacademy.model.Entity;
import io.altar.upacademy.model.Product;

public class Product extends Entity{

	private int productVal;
	private double productIVA;
	private double productPVP;
	private String productName;
	
	private ArrayList<Product> productShelves = new ArrayList<>();

	public Product (String productName, int productVal, double productIVA, double productPVP){
		this.productName = productName;
		this.productVal = productVal;
		this.productIVA = productIVA;
		this.productPVP = productPVP;
	}

	public ArrayList<Product> getProductShelves() {   //static???
		return productShelves;
	}

	public String getProductName() {
		return productName;
	}
	
	public double getProductVal() {
		return productVal;
	}
	
	public double getProductIVA() {
		return productIVA;
	}
	
	public double getProductPVP() {
		return productPVP;
	}

	public void setProductShelf(ArrayList<Product> productShelves) {
		this.productShelves = productShelves;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductVal(int productVal) {
		this.productVal = productVal;
	}
	
	public void setProductIVA(double productIVA) {
		this.productIVA = productIVA;
	}
	
	public void setProductPVP(double productPVP) {
		this.productPVP = productPVP;
	}

	/*@Override
	public String toString(){
		return "Product ID: "+ getEntityId() + " | Name: " + getProductName() + " | Val: " + productVal + " | IVA: " + productIVA  + " | PVP: " + productPVP + " | Shelves: " + productShelves;
	}*/
}
