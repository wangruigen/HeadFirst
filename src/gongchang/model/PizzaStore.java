package gongchang.model;

import gongchang.factory.SimplePizzaFactory;
import gongchang.father.Pizza;

public class PizzaStore {
	private SimplePizzaFactory simplePizzaFactory;

	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza = simplePizzaFactory.createPizza(type);
		return pizza;
	}
}
