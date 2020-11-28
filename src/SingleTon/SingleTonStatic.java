package SingleTon;

/**
 * @ClassName SingleTon.SingleTonStatic
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/9/15 14:48
 * @Description SingleTon.SingleTonStatic
 * @Version 1.0
 */
// 静态饿汉式
public class SingleTonStatic {

    private static SingleTonStatic instance;

    static {
        instance = new SingleTonStatic();
    }

    private SingleTonStatic() {

    }

    public static SingleTonStatic getInstance() {
        return instance;
    }
}
