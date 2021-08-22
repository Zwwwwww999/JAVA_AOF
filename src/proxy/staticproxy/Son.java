package proxy.staticproxy;


import proxy.Person;

/**
 * @ClassName Son
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/29 13:03
 * @Description Son
 * @Version 1.0
 */
public class Son implements Person {
    @Override
    public void findLove(){
        System.out.println("Son找对象要肤白貌美");
    }
}
