package celue1.model;

import celue1.inteface.impl.FlyWithFast;

/**
 * 创建一个cat类
 * <h5></h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class Cat {
	public void iCan() throws Exception{
		Animal animal=new Animal();
		/**
		 * 通过动态的构造委托类，拿到不同的代理实现的方法，在这里可以看到，通过动态的代理扩展，猫咪既然会飞啦。
		 */
		animal.setFlyable(new FlyWithFast());
		animal.fly();
	}
	public static void main(String[] args) throws Exception {
		Cat cat=new Cat();
		cat.iCan();
	}
}
