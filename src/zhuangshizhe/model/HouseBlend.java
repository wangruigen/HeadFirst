package zhuangshizhe.model;

import zhuangshizhe.baseType.Beverage;
/**
 * 
 * <h5>具体组件</h5>
 * <ul>
 * 	<li>
 * </ul>
 * @author wrg
 *
 */
public class HouseBlend  extends Beverage {
	public HouseBlend() {
		/**
		 * description继承至Beverage
		 */
		description = "综合咖啡";
	}

	@Override
	public double cost() {
		return 30;
	}
}
