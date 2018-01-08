package shipeiqi.impl;

import shipeiqi.jiekou.Animal;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("狗吃骨头");
	}

	@Override
	public void sleep() {
		System.out.println("狗睡觉");
	}

}
