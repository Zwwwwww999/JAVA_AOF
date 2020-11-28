package SingleTon;

/**
 * @ClassName SingleTon.SingleTon
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/9/15 15:12
 * @Description SingleTon.SingleTon
 * @Version 1.0
 */
// 枚举方法
class test {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.INSTANCE;
        SingleTon s2 = SingleTon.INSTANCE;

        s1.OK();
        System.out.println("s2.name() = " + s2);
    }
}

public enum SingleTon {


    INSTANCE;// 属性

    public void OK() {
        System.out.println("OK");
    }

}
