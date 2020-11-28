package factory.entity;

/**
 * @ClassName JavaCourse
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/26 20:49
 * @Description JavaCourse
 * @Version 1.0
 */
public class JavaCourse implements ICourse {
    @Override
    public String study() {
        return "学习java";
    }
}
