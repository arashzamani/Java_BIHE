package org.bihe.entity;

/**
 * 
 * @author Arash Zamani Farahani
 * 11.7.2015
 *
 */
public class Car {
	// instance fields
	private String model;
	private String color;
	// ----------------------------------------------------------------
	// Constructors
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString(){
		return "#"+this.model + " - "+this.color+"#";
	}
}
