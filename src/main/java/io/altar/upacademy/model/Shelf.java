package io.altar.upacademy.model;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="shelf")
public class Shelf extends Entity {

	@Column
	private String shelfLocal; // top, middle, bottom
	private int shelfCapacity; // ex 0 a 50?
	private double shelfDailyCost; // €
	//private ArrayList<Shelf> shelfProduct = new ArrayList<>();

	public Shelf() {

	}

	/*
	 * public Shelf (String shelfLocal, int shelfCapacity, double
	 * shelfDailyCost){ this.shelfLocal = shelfLocal; this.shelfCapacity =
	 * shelfCapacity; this.shelfDailyCost = shelfDailyCost; }
	 */

	public String getShelfLocal() {
		return shelfLocal;
	}

	public void setShelfLocal(String shelfLocal) {
		this.shelfLocal = shelfLocal;
	}

	public void setShelfCapacity(int shelfCapacity) {
		this.shelfCapacity = shelfCapacity;
	}

	public int getShelfCapacity() {
		return shelfCapacity;
	}

	public void setShelfDailyCost(double shelfDailyCost) {
		this.shelfDailyCost = shelfDailyCost;
	}

	public double getShelfDailyCost() {
		return shelfDailyCost;
	}

	/*public void setShelfProduct(ArrayList<Shelf> shelfProduct) {
		this.shelfProduct = shelfProduct;
	}

	public void getShelfProduct(ArrayList<Shelf> shelfProduct) {
		this.shelfProduct = shelfProduct;
	}/*

	/*
	 * @Override public String toString(){ return "Shelf ID: "+ getEntityId() +
	 * " | Localization: " + shelfLocal + " | Capacity: " + shelfCapacity +
	 * " | Daily Cost: " + shelfDailyCost + " | Product on display: " +
	 * shelfProduct.toString(); }
	 */

}