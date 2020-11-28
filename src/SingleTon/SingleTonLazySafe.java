package SingleTon;

/**
 * @ClassName SingleTon.SingleTon.SingleTonLazySafe
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/9/15 14:59
 * @Description SingleTon.SingleTon.SingleTonLazySafe
 * @Version 1.0
 */
public class SingleTonLazySafe {

    private static SingleTonLazySafe instance = null;

    private SingleTonLazySafe() {

    }
    //方式一 效率太低
//    public static synchronized SingleTon.SingleTon.SingleTonLazySafe getInstance() {
//
//        if (instance == null) {
//            instance = new SingleTon.SingleTon.SingleTonLazySafe();
//        }
//        return instance;
//    }
    // 方拾贰 单重锁 不安全
//    public static  SingleTon.SingleTon.SingleTonLazySafe getInstance(){
//            if (instance == null) {
//                synchronized (SingleTon.SingleTon.SingleTonLazySafe.class) {
//                    instance = new SingleTon.SingleTon.SingleTonLazySafe();
//                }
//            }
//            return instance;
//    }


}
