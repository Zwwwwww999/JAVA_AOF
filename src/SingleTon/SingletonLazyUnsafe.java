package SingleTon;

/**
 * @ClassName SingletonLazy
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/9/15 14:56
 * @Description SingletonLazy
 * @Version 1.0
 */
// 懒汉式
public class SingletonLazyUnsafe {

    private static SingletonLazyUnsafe instance = null;

    private SingletonLazyUnsafe() {

    }

    public static SingletonLazyUnsafe getInstance() {

        if (instance == null) {
            instance = new SingletonLazyUnsafe();
        }
        return instance;
    }
}
