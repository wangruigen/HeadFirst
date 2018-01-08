package shipeiqi.impl;

import shipeiqi.jiekou.Animal;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
		
	}

	@Override
	public void sleep() {
		System.out.println("猫睡觉");
	}
	
}
