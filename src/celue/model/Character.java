package celue.model;

import celue.jiekou.WeaponBehaviorAble;

/**
 * 角色父类
 * <h5></h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public abstract class Character {
	
	protected WeaponBehaviorAble weaponBehavior;
	
	public void setWeaponBehavior(WeaponBehaviorAble weaponBehavior){
		this.weaponBehavior=weaponBehavior;
	}
	/**
	 * 
	 * <h5>角色有一个战斗的方法</h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>这里是默认的fight方法，如果子类调用的话，需要复写这个方法，如果直接使用，回抛出异常，提示先使用setWeaponBehavior(...)方法来选择策略
	 * <ul>
	 * @throws Exception 
	 */
	public void fight() throws Exception{
		if(weaponBehavior!=null){
			weaponBehavior.userWeapon();
		}else throw new RuntimeException("error,please user the method setWeaponBehavior(...) to make weaponBehavior.");
	};
	
	public static void main(String[] args) {
		float a = 2.1f;
		float b = 1.1f;
		System.out.println(a+b);
	}
}
