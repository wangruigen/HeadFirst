package gongchang.factory2;

import gongchang.father.Pizza;

public class NYStylePizzaStore extends PizzaStore2{
	
	NyStylePizzaFactory factory;

	public NYStylePizzaStore(){}
	public NYStylePizzaStore(NyStylePizzaFactory factory) {
		this.factory = factory;
	}
	@Override
	protected Pizza createPizza(String type) {
		return factory.createPizza(type);
	}
	public static void main(String[] args) {
		NyStylePizzaFactory factory =new NyStylePizzaFactory();
		NYStylePizzaStore store = new NYStylePizzaStore(factory);
		Pizza createPizza = store.createPizza("C");
		System.out.println(createPizza.getClass());
	}
}
