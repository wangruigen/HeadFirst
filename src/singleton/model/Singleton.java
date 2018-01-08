package singleton.model;
/**
 * double-checked locking 双重检查加锁，在getInstance()中减少使用同步
 * 如果性能是你关心的重点，这个做法可以大大减少getInstance()的时间消耗
 * <br>
 * <h1>双重检查枷锁不适用与java 5 以下的版本</h1>
 * @author wrg
 *
 */
public class Singleton {
	
	private volatile static Singleton singleton;
	
	private Singleton(){};
	
	public static Singleton getInstance(){
		//首先检查实例是否存在
		if(singleton == null){
			//不存在进入同步区块(只有第一次执行的时候会进入)
			synchronized (Singleton.class) {
				//在检测一次实例是否创建，若仍然是没有则创建
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
