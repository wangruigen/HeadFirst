package celue1.model;

import celue1.inteface.Flyable;
import celue1.inteface.Quackable;
import celue1.inteface.Swimable;
import celue1.inteface.impl.FlyWithFast;
/**
 * 
 * <h5>一个动物类，属性都是接口，而利用接口的多态性，可以得到我们需要的接口实例。这种动物的行为在别的类（实现行为的接口类）里处理，其实是一种委托处理</h5>
 * <ul>
 * 	<li>这里fly()行为并不是在Animal里处理，而是委托了别人（Flyable 接口处理了，利用Flyable的多态，得到不同的飞行行为）
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class Animal {
	/**
	 * 相当于委托类
	 */
	Flyable flyable;
	/**
	 * 相当于委托类
	 */
	Quackable quackable;
	/**
	 * 相当于委托类
	 */
	Swimable swimable;
	
	/**
	 * 这里可以使用setter来设置委托类的动态变化，从而实现动态的行为（代理）
	 */
	public void setFlyable(Flyable flyable){
		this.flyable=flyable;
	}
	
	public void setQuackable(Quackable quackable){
		this.quackable=quackable;
	}
	
	
	/**
	 * Animal里定义一些方法，方法里可以使用委托类里定义的方法
	 * <h5></h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>
	 * <ul>
	 * @throws Exception
	 */
	public void fly() throws Exception{
		/**
		 * 当然这里都是默认的，具体的可以覆盖，毕竟动物的子类去继承Animal类的时候，也有自己的个性方法
		 */
		flyable=new FlyWithFast();
		/**
		 * 这里fly的实现，其实代理类都已经帮我们做好了，我们不关心Animal的实现方式，只需要关心代理类的实现方式就行了。
		 */
		flyable.fly();
	}
	public void quack() throws Exception{
		//可以自己扩展
	}
}
