package celue1.inteface.impl;

import celue1.inteface.Flyable;

/**
 * 
 * <h5>实现Flyable接口，实现飞行飞行动作，飞行很低的动物的具体实现</h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class FlyWithLow implements Flyable {

	@Override
	public void fly() throws Exception {
		System.out.println("I can fly with low");
	}
}
