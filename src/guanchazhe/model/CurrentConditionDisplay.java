package guanchazhe.model;

import guanchazhe.jiekou.DisplayElement;
import guanchazhe.jiekou.Observer;
import guanchazhe.jiekou.Subject;
/**
 * 
 * 
 * <h5>当前状况布告板</h5>
 * <ul>
 * 	<li>实现了{@link Observer}接口，所以可以从WeatherData对象中获取改变
 * 	<li>实现了{@link DisplayElement}接口，所有布告板模板都需要实现此接口
 * </ul>
 * @author wrg
 *
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserve(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("温度："+temperature);
		System.out.println("湿度："+humidity);
		System.out.println("气压："+pressure);
	}
}
