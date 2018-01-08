package guanchazhe.jiekou;
/**
 * 
 * <h5>主题接口</h5>
 * <ul>
 * 	<li>对象使用此接口注册为观察者
 * <li>对象使用此接口吧自己从接口中移除
 * </ul>
 * @author wrg
 *
 */
public interface Subject {
	/**
	 * 
	 * <h5>注册成为观察者</h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>
	 * <ul>
	 * @param o
	 */
	void registerObserve(Observer o);
	/**
	 * 
	 * <h5>注销观察者</h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>
	 * <ul>
	 * @param o
	 */
	void removeObserve(Observer o);
	/**
	 * 
	 * <h5>当主体状态改变是，这个方法会被调用，以通知所有的观察者</h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>
	 * <ul>
	 */
	void notifyObservers();
}
