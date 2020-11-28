package SingleTon;

/**
 * @ClassName SingleTon.SingleTonDCL
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/9/15 15:03
 * @Description SingleTon.SingleTonDCL
 * @Version 1.0
 */
//DCL 模式
public class SingleTonDCL {

    private static volatile SingleTonDCL instance;

    private SingleTonDCL() {

    }

    private static SingleTonDCL getInstance() {

        if (instance == null) {
            synchronized (SingleTonDCL.class) {

                if (instance == null) {

                }

            }
        }
        return instance;
    }
}
