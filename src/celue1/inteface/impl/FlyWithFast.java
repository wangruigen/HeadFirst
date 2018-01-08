package celue1.inteface.impl;

import celue1.inteface.Flyable;


/**
 * 
 * <h5>这个类实现Flyable接口,实现能快速飞行的这一行为的具体动作，</h5>
 * <ul>
 * 	<li>相当于代理类
 * </ul>
 * @author wrg
 *
 */
public class FlyWithFast implements Flyable {
	@Override
	public void fly() throws Exception {
		System.out.println("I can fly fast");
	}
}
