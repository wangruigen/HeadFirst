package mingling.impl;

import mingling.jiekou.Command;
import mingling.model.Light;
/**
 * 2
 * 建立一个开灯的命令对象,改对象只有一个命令，就是开灯。
 * 所以需要在execute()里实现开灯的方法。
 * 
 * @author wrg
 *
 */
public class LightOnCommand implements Command{
	/**
	 * 首先，我们需要灯，灯的类型有很多，我们不需要管
	 * 开灯的方法有厂商提供，我们只需在命令里调用灯的开灯方法就行
	 */
	Light light;

	public LightOnCommand() {}
	/**
	 * 通过构造方法来构造灯对象
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		/**
		 * 调用开灯的方法
		 */
		light.on();
	}

}
