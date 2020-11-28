package factory.factorymethod;

import factory.entity.ICourse;
import factory.entity.PythonCourse;

/**
 * @ClassName PythonCourseFatcoy
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/26 20:51
 * @Description PythonCourseFatcoy
 * @Version 1.0
 */
public class PythonCourseFatcoy implements ICourseFactory{
    @Override
    public ICourse course() {
        return new  PythonCourse();
    }
}
