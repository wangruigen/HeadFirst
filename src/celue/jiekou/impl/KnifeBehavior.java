package celue.jiekou.impl;

import celue.jiekou.WeaponBehaviorAble;

/**
 * 
 * <h5>用匕首刺杀的行为</h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class KnifeBehavior implements WeaponBehaviorAble {
	/**
	 * 
	 * <h5>使用匕首刺杀的实现</h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>
	 * <ul>
	 * @throws Exception
	 */
	public void userWeapon() throws Exception{
		System.out.println("用匕首攻击！！！");
	};
}
