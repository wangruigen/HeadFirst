package guanchazhe.model;

import guanchazhe.jiekou.Observer;
import guanchazhe.jiekou.Subject;

import java.util.ArrayList;

/**
 * 
 * <h5>天气数据对象</h5>
 * <ul>
 * 	<li>需实现{@link Subject}接口
 * </ul>
 * @author wrg
 *
 */
public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;//记录观察者的数组，在构造方法中建立
	
	/**
	 * 通知给观察者的数据
	 */
	private float temperature;//温度
	private float humidity;//湿度
	private float pressure;//气压
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserve(Observer o) {
		//注册观察者（订阅）
		observers.add(o);
	}

	@Override
	public void removeObserve(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}

	}
	/**
	 * 通知观察者各数据状态值，业务观察者Observer都是现在了update()方法，我
	 * 们知道如何通知他们
	 */
	@Override
	public void notifyObservers() {
		for(int i = 0;i < observers.size(); i++){
			Observer observer = observers.get(i);
			/**
			 * 对每一位已经注册的观察者发布订阅
			 */
			observer.update(temperature, humidity, pressure);//这里很关键，观察者实现了
		}
	}
	/**
	 * 
	 * <h5>当从气象站得到更新观测值是，我们通知观察者</h5>
	 * <p>说明：</p>
	 * <ul>
	 *  <li>
	 * <ul>
	 */
	public void measurementsChanged(){
		notifyObservers();
	}
	
	/**
	 * 更新天气数据方法（数据实时从气象站得来）
	 */
	public void setWeatherDataMessage(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
