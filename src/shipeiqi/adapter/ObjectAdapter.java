package shipeiqi.adapter;

import shipeiqi.jiekou.Animal;
import shipeiqi.jiekou.Plant;

/**
 * 一般来说适配器模式分为对象适配器和类适配器，对象适配器通过对象间组合完成适配器接口，类适配器
 * 通过多继承方式来形式适配器（java不支持多继承，做起来比较麻烦。
 * 所以一般使用对象适配器模式
 * @author wrg
 *
 */
public class ObjectAdapter implements Animal{
	
	Plant plant;
	
	public ObjectAdapter() {}
	
	public ObjectAdapter(Plant plant){
		this.plant = plant;
	}

	@Override
	public void eat() {
		plant.makeYq();
	}

	@Override
	public void sleep() {
		
	}
	
}
