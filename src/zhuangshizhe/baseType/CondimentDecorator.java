package zhuangshizhe.baseType;

/**
 * 
 * <h5>Condiment(调料)，代表抽象装饰者</h5>
 * <ul>
 * 	<li>首先必须让CondimentDecorator能够取代{@link Beverage},所以讲CondimentDecorator扩展自{@link Beverage}
 * </ul>
 * @author wrg
 *
 */
public abstract class CondimentDecorator extends Beverage{
	/**
	 * 所有的调料装饰者都必须重新实现getDescription方法。
	 */
	public abstract String getDescription();
	
}
