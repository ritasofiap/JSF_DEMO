package io.altar.upacademy.model;

//import java.util.ArrayList;

import io.altar.upacademy.model.Entity;
import io.altar.upacademy.model.Product;


public class Product extends Entity{

	private double val;
	private double IVA;
	private double PVP;
	private String name;
	
	
	public Product(){
		
	}
	
	public Product (String name, double val, double IVA, double PVP){
		this.name = name;
		this.val = val;
		this.IVA = IVA;
		this.PVP = PVP;
	}

		
	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(double iVA) {
		IVA = iVA;
	}

	public double getPVP() {
		return PVP;
	}

	public void setPVP(double pVP) {
		PVP = pVP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
/*	public ArrayList<Product> getProductShelves() {   //static???
		return productShelves;
	}

	
	public void setProductShelf(ArrayList<Product> productShelves) {
		this.productShelves = productShelves;
	}
	*/


	/*@Override
	public String toString(){
		return "Product ID: "+ getEntityId() + " | Name: " + getProductName() + " | Val: " + productVal + " | IVA: " + productIVA  + " | PVP: " + productPVP + " | Shelves: " + productShelves;
	}*/
}
