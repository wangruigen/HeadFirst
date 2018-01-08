package mingling.model;

import mingling.jiekou.Command;

/**
 * 3 命令对象的使用者（当做是一个遥控器）
 * @author wrg
 *
 */
public class RemoteControl {
	/**
	 * 既然使用命令对象，所以命令对象作为成员变量
	 * 命令对象有多个，使用接口的多态性
	 */
	Command command;
	
	/**
	 * 通过构造方法来构建命令对象
	 */
	public RemoteControl() {}
	public RemoteControl(Command command) {
		super();
		this.command = command;
	}
	/**
	 * 或者通过setCommand()方法来设置命令对象
	 * 如果客户需要频繁改变遥控器的行为，可以多次
	 * 调用此方法来改变命令行为
	 */
	public void setCommand(Command command){
		this.command = command;
	}
		
	public void buttonWasPressed(){
		command.execute();
	}
}
