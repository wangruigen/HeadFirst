package celue1.model;

import celue1.inteface.impl.FlyWithFast;
/**
 * dog类实现animal类
 * <h5></h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class Dog extends Animal{
	/**
	 * 覆盖父类的方法，利用委托类的多态，得到代理类FlyWithFast中的快速飞行的方法
	 */
	@Override
	public void fly() throws Exception {
		/**
		 * 这里没有使用setter来实例化委托类，所以这是一个静态的代理类（直接就写死的）
		 */
		flyable=new FlyWithFast();
		flyable.fly();
	}
	public static void main(String[] args) throws Exception {
		Dog d=new Dog();
		d.fly();
	}
}
