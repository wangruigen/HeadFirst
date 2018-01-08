package celue.jiekou.impl;

import celue.jiekou.WeaponBehaviorAble;

/**
 * 
 * <h5>用斧头的行为</h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class AxeBehavior implements WeaponBehaviorAble {
	
	@Override
	public void userWeapon() throws Exception {
		System.out.println("用斧头攻击！！！");
	}
}
