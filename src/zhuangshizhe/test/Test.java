package zhuangshizhe.test;

import zhuangshizhe.decorate.Mocha;
import zhuangshizhe.model.Espresso;

public class Test {

	public static void main(String[] args) {
		Mocha mocha = new Mocha(new Espresso());
		double cost = mocha.cost();
		System.out.println(mocha.getDescription()+"cost "+cost);
	}
}
