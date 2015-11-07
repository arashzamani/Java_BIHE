package org.bihe.main;

import org.bihe.entity.Car;
import org.bihe.entity.Producer;
import org.bihe.entity.ProductLine;

public class test {

	public static void main(String[] args) {
		// colors
		String black = "black";
		String red = "red";
		String blue = "blue";
		String gun = "gun";
		String white = "white";
		//create some cars
		String model1 = "beetle";
		String model2 = "golf";
		String model3 = "jetta";
		//
		Car beetle1 = new Car(model1, black);
		Car beetle2 = new Car(model1, red);
		//
		Car golf1 = new Car(model2, red);
		Car golf3 = new Car(model2, blue);
		Car golf2 = new Car(model2, black);
		Car golf4 = new Car(model2, gun);
		//
		Car jetta1 = new Car(model3, white);
		Car jetta2 = new Car(model3, black);
		Car jetta3 = new Car(model3, blue);
		
		// define product lines
		ProductLine beetleLine = new ProductLine(10, model1);
		beetleLine.addNewModelToProductions(beetle1);
		beetleLine.addNewModelToProductions(beetle2);
		//
		ProductLine golfLine = new ProductLine(12, model2);
		golfLine.addNewModelToProductions(golf1);
		golfLine.addNewModelToProductions(golf2);
		golfLine.addNewModelToProductions(golf3);
		golfLine.addNewModelToProductions(golf4);
		//
		ProductLine jettaLine = new ProductLine(15, model3);
		jettaLine.addNewModelToProductions(jetta3);
		jettaLine.addNewModelToProductions(jetta2);
		jettaLine.addNewModelToProductions(jetta1);
		
		
		Producer p2= new Producer("arash", "123", "Arash", "Zamani", 25);
		p2.addNewProductionLine(beetleLine);
		p2.addNewProductionLine(golfLine);
		p2.addNewProductionLine(jettaLine);
		
		//System.out.println(p2);
	}

}
