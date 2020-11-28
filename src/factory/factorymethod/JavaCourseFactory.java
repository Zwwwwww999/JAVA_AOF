package factory.factorymethod;

import factory.entity.ICourse;
import factory.entity.JavaCourse;

/**
 * @ClassName JavaCourseFactory
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/26 20:48
 * @Description JavaCourseFactory
 * @Version 1.0
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse course() {
        return new JavaCourse();
    }
}
