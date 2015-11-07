package org.bihe.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * 
 * @author Arash Zamani Farahani objects of this class will be used in Producer
 *         Class this class holds the number of cars which it will be produce
 *         this class holds the time to produce each car
 */
public class ProductLine extends Thread {
	private ArrayList<Car> productions;
	private int producedTime;

	private String model;

	public ProductLine(int producedTime, String model) {
		super();
		this.producedTime = producedTime;
		this.model = model;
		this.productions = new ArrayList<Car>();
	}

	// ---------------------------------------------------------
	/**
	 * 
	 * @param model
	 *            - the new given car added to productions list
	 */
	public void addNewModelToProductions(Car model) {
		this.productions.add(model);
	}

	// --------------------------------------------------------
	// Accessors
	// We define only getters for instance fields of this class
	public ArrayList<Car> getProductions() {
		return productions;
	}

	public int getProducedTime() {
		return producedTime;
	}

	public String getModel() {
		return model;
	}

	public String toString() {
		String result = "\n------------------------";
		result = result + "\nproduction time = " + this.producedTime;
		for (int i = 0; i < this.productions.size(); i++)
			result = result + "\n" + this.productions.get(i).toString();
		result = result + "\n------------------------";
		return result;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Car generatedCar = produceRandomCar();
				// Calendar calendar = new
				// GregorianCalendar(TimeZone.getTimeZone("Tehran"));
				Date date = new Date();
				System.out.println(date + " " + generatedCar.toString());
				Thread.sleep(this.producedTime * 1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Car produceRandomCar() {
		int max = this.productions.size();
		int rand = (int) Math.floor((Math.random() * max));

		return this.productions.get(rand);
	}
}
