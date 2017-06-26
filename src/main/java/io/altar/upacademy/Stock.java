package io.altar.upacademy;

import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;
import javax.faces.bean.RequestScoped;


@Named("Stock")
@RequestScoped
public class Stock {

	private String randomId;
	private String randomBrand; //Nome
	private int randomYear; //Val
	private String randomIVA; //IVA mudar pa int
	private int randomPrice; //PVP
	private boolean randomSoldState; //nada
	
	public Stock(String randomId, String randomBrand, int randomYear, String randomIVA, int randomPrice, boolean randomSoldState) {
		this.randomId = randomId;
		this.randomBrand = randomBrand;
		this.randomYear = randomYear;
		this.randomIVA = randomIVA;
		this.randomPrice = randomPrice;
		this.randomSoldState = randomSoldState;
	}
	
	public String getRandomId() {
		return randomId;
	}

	public void setRandomId(String randomId) {
		this.randomId = randomId;
	}

	public String getRandomBrand() {
		return randomBrand;
	}

	public void setRandomBrand(String randomBrand) {
		this.randomBrand = randomBrand;
	}

	public int getRandomYear() {
		return randomYear;
	}

	public void setRandomYear(int randomYear) {
		this.randomYear = randomYear;
	}

	public String getRandomIVA() {
		return randomIVA;
	}

	public void setRandomIVA(String randomIVA) {
		this.randomIVA = randomIVA;
	}

	public int getRandomPrice() {
		return randomPrice;
	}

	public void setRandomPrice(int randomPrice) {
		this.randomPrice = randomPrice;
	}

	public boolean getRandomSoldState() {
		return randomSoldState;
	}

	public void setRandomSoldState(boolean randomSoldState) {
		this.randomSoldState = randomSoldState;
	}

		
}
