package io.altar.model;

import java.util.ArrayList;

public class Shelf extends Entity{

	private int shelfLocal;
	private int shelfCapacity;
	private double shelfDailyCost;
	
	private ArrayList<Shelf> shelfProduct = new ArrayList<>();  
	
	public Shelf (int shelfLocal, int shelfCapacity, double shelfDailyCost){
		this.shelfLocal = shelfLocal;
		this.shelfCapacity = shelfCapacity;
		this.shelfDailyCost = shelfDailyCost;
	}

	public void getShelfProduct(ArrayList<Shelf> shelfProduct) {
		this.shelfProduct = shelfProduct;
	}	

	public int getShelfLocal() {
		return shelfLocal;
	}
	
	public int getShelfCapacity() {
		return shelfCapacity;
	}
	
	public double getShelfDailyCost() {
		return shelfDailyCost;
	}

	public void setShelfLocal(int shelfLocal) {
		this.shelfLocal = shelfLocal;
	}
	public void setShelfCapacity(int shelfCapacity) {
		this.shelfCapacity = shelfCapacity;
	}
	public void setShelfDailyCost(double shelfDailyCost) {
		this.shelfDailyCost = shelfDailyCost;
	}
	
	public void setShelfProduct(ArrayList<Shelf> shelfProduct) {
		this.shelfProduct = shelfProduct;
	}

	/*@Override
	public String toString(){
		return "Shelf ID: "+ getEntityId() + " | Localization: " + shelfLocal + " | Capacity: " + shelfCapacity  + " | Daily Cost: " + shelfDailyCost + " | Product on display: " + shelfProduct.toString();
	}*/
	
}