package MapDemp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a01MapDemo02 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式：键值对对象找键和值
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan", 18);
        map.put("lisi", 20);
        map.put("wangwu", 22);
        //1.获取所有键值对对象的集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //2.遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, Integer> entry : entries) {
            //3.根据键值对对象获取键和值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }


    }
}
