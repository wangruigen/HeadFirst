package guanchazhe.jiekou;
/**
 * 
 * <h5>观察者接口</h5>
 * <ul>
 * 	<li>所有的观察者必须实现update()方法，以实现观察者接口
 * <li>
 * </ul>
 * @author wrg
 *
 */
public interface Observer {
	/**
	 * 
	 * <h5>观察者本身更新自身值的方法</h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>参数说明，当气象观测值改变时，主题会把这些状态值当做方法的参数，传送给观察者
	 *  <li>注意这里是主题传递过来的参数。
	 * <ul>
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	void update(float temp,float humidity,float pressure);
}
