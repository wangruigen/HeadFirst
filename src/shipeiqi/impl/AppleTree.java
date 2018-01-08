package shipeiqi.impl;

import shipeiqi.jiekou.Plant;

public class AppleTree implements Plant {

	@Override
	public void makeYq() {
		System.out.println("苹果树制造氧气");
	}

	@Override
	public void needWater() {
		System.out.println("苹果树需要水");
	}

}
