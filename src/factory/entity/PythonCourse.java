package factory.entity;

/**
 * @ClassName PythonCourse
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/26 20:51
 * @Description PythonCourse
 * @Version 1.0
 */
public class PythonCourse implements ICourse {
    @Override
    public String study() {
        return "学习python";
    }
}
