package factory.abastracfactory;

import factory.entity.ICourse;
import factory.entity.JavaCourse;
import factory.entity.JavaNote;
import factory.entity.JavaVideo;

/**
 * @ClassName javaCourseFacoty
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/26 22:31
 * @Description javaCourseFacoty
 * @Version 1.0
 */
public class javaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
