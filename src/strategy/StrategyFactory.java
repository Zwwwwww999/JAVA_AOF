package strategy;

import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName StrategyFactory
 * @Author zzzzwwwwwwwwwwwwww
 * @Date 2021/8/22 11:37
 * @Description StrategyFactory
 * @Version 1.0
 */
public class StrategyFactory {

    Map<String,Mqtt> stategys = new ConcurrentHashMap<>();


    public StrategyFactory(Map<String, Mqtt> stategys) {
        this.stategys = stategys;
    }

    public Mqtt getMqtt(String key)throws Exception {
        Mqtt mqtt = stategys.get(key);
        if (ObjectUtils.isEmpty(mqtt)){
             throw  new RuntimeException("no strategy defined");
         }
         return mqtt;
    }

}
