package strategy;

/**
 * @ClassName Wifi
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2021/8/22 11:34
 * @Description Wifi
 * @Version 1.0
 */
public class Wifi implements Mqtt{
    @Override
    public void saveData() {
        System.out.println("保存wifi数据");
    }
}
