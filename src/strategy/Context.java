package strategy;

/**
 * @ClassName Context
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2021/8/22 11:41
 * @Description Context
 * @Version 1.0
 */
public class Context {

    private Mqtt mqtt;

    public Context(Mqtt mqtt) {
        this.mqtt = mqtt;
    }

    public void saveData(){
        mqtt.saveData();  }


}
