package guanchazhe.model;

import guanchazhe.jiekou.DisplayElement;
import guanchazhe.jiekou.Observer;

public class TestImplObservers implements Observer , DisplayElement {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("Test Test Test");
	}

}
