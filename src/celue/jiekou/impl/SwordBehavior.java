package celue.jiekou.impl;

import celue.jiekou.WeaponBehaviorAble;

/**
 * 
 * <h5>使用刀剑的行为</h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class SwordBehavior implements WeaponBehaviorAble{

	
	@Override
	public void userWeapon() throws Exception {
		System.out.println("使用刀剑攻击！！！");
	}
}
