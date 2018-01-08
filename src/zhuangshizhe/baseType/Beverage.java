package zhuangshizhe.baseType;

/**
 * 
 * <h5>Beverage（饮料），抽象组件</h5>
 * <ul>
 * 	<li>是一个基类，也是一个抽象类（事物和不是行为）
 * </ul>
 * @author wrg
 *
 */
public abstract class Beverage {
	protected String description = "未知的饮料";
	
	/**
	 * 
	 * <h5></h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>getDescription()已经在此实现了
	 * <ul>
	 * @return
	 */
	public String getDescription(){
		return description;
	}
	/**
	 * 
	 * <h5></h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>cost()必须在子类实现
	 * <ul>
	 * @return
	 */
	public abstract double cost();
}
