package factory.abastracfactory;

import factory.entity.ICourse;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ICourseFactory
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2020/11/26 22:29
 * @Description ICourseFactory
 * @Version 1.0
 */

 // 顶级工厂接口，子接口都需实现该接口 抽象工厂不符合开闭原则 扩展性非常强
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
