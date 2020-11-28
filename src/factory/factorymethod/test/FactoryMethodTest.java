package factory.factorymethod.test;

import factory.factorymethod.ICourseFactory;
import factory.factorymethod.JavaCourseFactory;
import factory.entity.ICourse;

/**
 * @ClassName FactoryMethodTest
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/26 22:08
 * @Description FactoryMethodTest
 * @Version 1.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory =new JavaCourseFactory();
        final ICourse course = factory.course();
        System.out.println(course.study());
    }
}
