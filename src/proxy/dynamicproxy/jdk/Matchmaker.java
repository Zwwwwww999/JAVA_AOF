package proxy.dynamicproxy.jdk;

import proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName Matchmaker
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/29 13:25
 * @Description Matchmaker
 * @Version 1.0
 */
public class Matchmaker implements InvocationHandler {

    private Person target;
    public Object getInstance(Person person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            before();
        Object obj = method.invoke(this.target, args);
            after();
        return obj;
    }
    private void before(){
        System.out.println("媒婆根据筛选");
        System.out.println("开始收钱");
    }
    private void after(){
        System.out.println("OK成功，拿到尾款");
    }
}
