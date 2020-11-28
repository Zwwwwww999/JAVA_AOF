package SingleTon;

/**
 * @ClassName Singleton
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/9/15 14:44
 * @Description Singleton
 * @Version 1.0
 */
// 饿汉式
public class SingletonHungry {

    // 创建本类实例
    private final static SingletonHungry instance = new SingletonHungry();

    // 私有化构造方法
    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return instance;
    }

}
