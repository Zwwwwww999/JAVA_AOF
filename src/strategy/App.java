package strategy;

/**
 * @ClassName App
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2021/8/22 11:34
 * @Description App
 * @Version 1.0
 */
public class App implements Mqtt{
    @Override
    public void saveData() {
        System.out.println("保存App数据");
    }
}
