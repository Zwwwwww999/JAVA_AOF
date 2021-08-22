package proxy.staticproxy;


import proxy.Person;

/**
 * @ClassName Father
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/29 13:03
 * @Description Father
 * @Version 1.0
 */
public class Father implements Person{

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove(){
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方同意，确认关系");
    }
}
