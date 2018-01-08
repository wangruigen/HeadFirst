package mingling.jiekou;
/**
 * 1
 * 首先，让所有的命令对象实现相同的包含一个方法的接口。
 * 这就是命令接口
 * @author wrg
 *
 */
public interface Command {
	public void execute();
}
