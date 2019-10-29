package GOF23.com.stu.designPattren.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 真实中介者对象
 * */
public class MediatorImpl implements MediatorIntarface{

    Map<String ,ColleaguesIntarface> map = new HashMap<String,ColleaguesIntarface>();
    @Override
    public void relevance(String name, ColleaguesIntarface colleagues) {
        map.put(name , colleagues);
    }

    @Override
    public void command(String name) {
        map.get(name).internal();
    }
}
