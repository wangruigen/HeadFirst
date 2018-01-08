package zhuangshizhe.decorate;

import zhuangshizhe.baseType.Beverage;
import zhuangshizhe.baseType.CondimentDecorator;
/**
 * 
 * <h5>摩卡是一个装饰者，扩展至CondimentDecorator</h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class Mocha extends CondimentDecorator {
	/**
	 *1.饮料作为被装饰者，作为装饰者的实例变量
	 *2.利用多态，可以拿到饮料的实例
	 *3.可以得到实例的方法 
	 */
	protected Beverage beverage; 
	protected double cost;//摩卡本身的价钱
	
	/**
	 * 通过摩卡的构造方法来创建被饮料实例
	 */
	public Mocha(Beverage beverage){
		this.beverage = beverage;
		this.cost = 10;
	}
	
	@Override
	public String getDescription() {
		return "摩卡"+beverage.getDescription();
	}

	@Override
	public double cost() {
		//花费价钱等于摩卡本身的价钱加上饮料本身花费的价钱
		return cost+beverage.cost();
	}

}
