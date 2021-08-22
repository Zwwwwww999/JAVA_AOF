package proxy.staticproxy;

/**
 * @ClassName FatherproxyTest
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/29 13:09
 * @Description FatherproxyTest
 * @Version 1.0
 */
public class FatherproxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
