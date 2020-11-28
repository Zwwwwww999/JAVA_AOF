package factory.factorymethod.test;

import factory.abastracfactory.ICourseFactory;
import factory.abastracfactory.javaCourseFactory;


/**
 * @ClassName AbstactFactoryTest
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/26 22:34
 * @Description AbstactFactoryTest
 * @Version 1.0
 */
public class AbstactFactoryTest {

    public static void main(String[] args) {
        ICourseFactory abstractFactory =new javaCourseFactory();

        System.out.println(abstractFactory.createCourse().study());
        System.out.println(abstractFactory.createNote());
    }
}
