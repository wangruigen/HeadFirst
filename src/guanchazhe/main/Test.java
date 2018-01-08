package guanchazhe.main;

import guanchazhe.model.CurrentConditionDisplay;
import guanchazhe.model.WeatherData;

public class Test {
	public static void main(String[] args) {
		//首先建立一个天气对象
		WeatherData wd = new WeatherData();
		//建立布告板，并建天气对象作为参数传入
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(wd);
		currentDisplay.update(20, 30, 40);
	}
}
