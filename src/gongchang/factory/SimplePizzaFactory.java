package gongchang.factory;

import gongchang.father.Pizza;
import gongchang.model.PizzaA;
import gongchang.model.PizzaB;
import gongchang.model.PizzaC;

public class SimplePizzaFactory {
	public Pizza createPizza(String type){
		Pizza pizza = null;
		if(type.equals("A")){
			pizza = new PizzaA();
		}
		else if(type.equals("B")){
			pizza = new PizzaB();
		}
		else if(type.equals("C")){
			pizza = new PizzaC();
		}
		return pizza;
	}
}
