package SingleTon;

/**
 * @ClassName SingleTon.SingleTonStaticInClass
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/9/15 15:07
 * @Description SingleTon.SingleTonStaticInClass
 * @Version 1.0
 */
// 静态内部类方法
public class SingleTonStaticInClass {


    private SingleTonStaticInClass() {

    }

    public static SingleTonStaticInClass getInstance() {
        return SingleTonIntance.instance;
    }

    private static class SingleTonIntance {

        private static final SingleTonStaticInClass instance = new SingleTonStaticInClass();
    }


}
