package io.altar.upacademy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("param")
@RequestScoped
public class Param {
    private String i;

      
	public String getI() {
		return i;
	}



	public void setName(String i) {
		this.i = i;
	}


	//Getters and Setters for “name” and “disabled” …>
}
