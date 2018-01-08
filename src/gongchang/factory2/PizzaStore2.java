package gongchang.factory2;

import gongchang.father.Pizza;

public abstract class PizzaStore2 {
	public Pizza oederPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.check();
		pizza.cut();
		return pizza;
	}
	/**
	 * 
	 * <h5>创建pizza实例</h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>实例化pizza的责任被移到一个方法中，这个方法如同是一个工厂
	 *  <li>工厂方法用来处理对象的创建，并将这样的行为封装在子类中，这样，
	 *  客户程序中关于超类的代码就和子类对象创建代码解耦了
	 * <ul>
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
}
