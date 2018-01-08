package mingling.test;

import mingling.impl.LightOnCommand;
import mingling.model.Light;
import mingling.model.RemoteControl;

/**
 * 测试类(相当于客户)
 * @author wrg
 *
 */
public class Test {
	public static void main(String[] args) {
		/**
		 * 首先需要一个调用者，遥控器就是调用者，
		 * 会传入一个命令对象，可以用来发出请求(开灯)
		 */
		RemoteControl remoteControl = new RemoteControl();
	
		/**
		 * 现在创建一个灯对象，点灯对象也是请求的接受者
		 */
		Light light = new Light();
		/**
		 * 创建一个开灯的命令,并将这个灯对象传入
		 */
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		/**
		 * 把命令传入调用者
		 * 调用者接收命令对象并执行相关操作
		 */
		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonWasPressed();
	}
}
