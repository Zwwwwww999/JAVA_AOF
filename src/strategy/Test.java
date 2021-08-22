package strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName Test
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2021/8/22 11:40
 * @Description Test
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Map<String,Mqtt> map = new ConcurrentHashMap<>();
        map.put("wifi",new Wifi());
        map.put("app",new App());
        StrategyFactory factory = new StrategyFactory(map);
        factory.getMqtt("wifi").saveData();
        factory.getMqtt("app").saveData();
        factory.getMqtt("lll  " +
                "l").saveData();
    }
}
