package zhuangshizhe.model;

import zhuangshizhe.baseType.Beverage;

/**
 * 
 * <h5>具体组件</h5>
 * <ul>
 * 	<li>让Espresso扩展自Beverage,因为Espresso是一种饮料
 * </ul>
 * @author wrg
 *
 */
public class Espresso extends Beverage {
	public Espresso() {
		/**
		 * description继承至Beverage
		 */
		description = "浓缩咖啡";
	}

	@Override
	public double cost() {
		return 20;
	}

}
