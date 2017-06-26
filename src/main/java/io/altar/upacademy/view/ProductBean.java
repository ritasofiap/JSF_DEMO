package io.altar.upacademy.view;

import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.bean.RequestScoped;

@Named("ProductBean")
@RequestScoped

public class ProductBean {

	private String randomId;
	private String randomName;
	private double randomVal;
	private double randomIVA;
	private double randomPVP;
	private ArrayList<ProductBean> productShelves = new ArrayList<>();

	public ProductBean(String randomId, String randomName, double randomVal, Double randomIVA, double randomPVP) {
		
	}
	
	
	
	
	
	
	public String getRandomId() {
		return randomId;
	}

	public void setRandomId(String randomId) {
		this.randomId = randomId;
	}

	public String getRandomName() {
		return randomName;
	}

	public void setRandomName(String randomName) {
		this.randomName = randomName;
	}

	public double getRandomVal() {
		return randomVal;
	}

	public void setRandomVal(double randomVal) {
		this.randomVal = randomVal;
	}

	public double getRandomIVA() {
		return randomIVA;
	}

	public void setRandomIVA(double randomIVA) {
		this.randomIVA = randomIVA;
	}
	
	public double getRandomPVP() {
		return randomPVP;
	}

	public void setRandomPVP(double randomPVP) {
		this.randomPVP = randomPVP;
	}
	
	
	
	
	

	public ArrayList<ProductBean> getProductShelves() {   //static???
		return productShelves;
	}

	public void setProductShelf(ArrayList<ProductBean> productShelves) {
		this.productShelves = productShelves;
	}
	
	
	
}

