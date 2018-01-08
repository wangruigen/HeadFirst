package gongchang.model;

import gongchang.factory.SimplePizzaFactory;
import gongchang.father.Pizza;

public class Test {
	public static void main(String[] args) {
		Pizza pizza = getPizzaForFactory("C");
		System.out.println(pizza.getClass());
	}
	public static Pizza getPizza(String type){
		Pizza pizza = null;
		if(type.equals("A")){
			pizza = new PizzaA();
		}
		if(type.equals("B")){
			pizza = new PizzaB();
		}
		if(type.equals("C")){
			pizza = new PizzaC();
		}
		return pizza;
	}
	public static Pizza getPizzaForFactory(String type){
		Pizza pizza = null;
		SimplePizzaFactory factory = new SimplePizzaFactory();
		pizza = factory.createPizza(type);
		return pizza;
	}
}
