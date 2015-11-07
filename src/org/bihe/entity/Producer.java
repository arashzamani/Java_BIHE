package org.bihe.entity;

import java.util.ArrayList;
import java.util.HashMap;

import org.bihe.command.Service;

public class Producer extends User {
	private int stockSize;
	private ArrayList<Car> stockCars;
	private ArrayList<ProductLine> lines;

	public Producer(String username, String password, int stockSize) {
		super(username, password);
		init(stockSize);
	}

	public Producer(String username, String password, String firstname,
			String lastname, int stockSize) {
		super(username, password, firstname, lastname);
		init(stockSize);
	}

	/**
	 * this method initialize the primitive variable objects
	 * 
	 * @param stockSize
	 */
	private void init(int stockSize) {
		this.stockSize = stockSize;
		this.stockCars = new ArrayList<Car>();
		lines = new ArrayList<ProductLine>();
	}
	/**
	 * new lines added to whole production line list
	 * @param productionLine - ProductLine
	 */
	public void addNewProductionLine(ProductLine productionLine){
		lines.add(productionLine);
		productionLine.start();
	}
	// accessors 
	// we only define the getter for array of indoor warehouse in factory
	public ArrayList<Car> getStockCars() {
		return stockCars;
	}
	// ----------------------------------------------------------------
	/**
	 * It calls when the internal warehouse capacity is near to full
	 * @return
	 */
	public Service sendAlarm(){
		//TODO
		return null;
	}
	// ----------------------------------------------------------------
	/**
	 * 
	 * @return
	 */
	public Service moveToWarehouse(){
		//TODO gharare poresh konam
		return null;
	}
	/**
	 * 
	 */
	@Override
	public String toString(){
		String result = "\nProducer: "+ super.toString();
		result = result +  "\n++++++++++++++++++++++++";
		for(int i = 0; i  < this.lines.size(); i++){
			result = result + "\nline = "+ new Integer(i+1);
			result = result + this.lines.get(i).toString();
			result = result +  "\n++++++++++++++++++++++++";
		}
			
				
		return result;
	}
}
