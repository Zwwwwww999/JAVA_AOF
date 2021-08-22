package proxy.dynamicproxy.jdk;

import proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName JDKProxyTest
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/29 13:28
 * @Description JDKProxyTest
 * @Version 1.0
 */
public class JDKProxyTest {
    public static void main(String[] args) throws IOException {
        Person obj = (Person) new Matchmaker().getInstance(new Gril());
        obj.findLove();
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream fos = new FileOutputStream("E://$Proxy0.class");
        fos.write(bytes);
        obj.toString();
        fos.close();

   }
}
