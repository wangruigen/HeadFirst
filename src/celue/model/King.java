package celue.model;

import celue.jiekou.impl.KnifeBehavior;

/**
 * 
 * <h5>角色:国王</h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class King extends Character {
	@Override
	public void fight() throws Exception {
		this.setWeaponBehavior(new KnifeBehavior());
		weaponBehavior.userWeapon();
	}
}
