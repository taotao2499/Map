package MapDemp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class a01MapDemo01 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式：键找值
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan", 18);
        map.put("lisi", 20);
        map.put("wangwu", 22);

        //1.获取所有键的集合
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("==============================");

        //2.迭代器
        Set<String> ks = map.keySet();
        Iterator<String> ksit = ks.iterator();
        while (ksit.hasNext()) {
            String key = ksit.next();
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("==============================");

        //3.lambda表达式
        Set<String> lam = map.keySet();
        lam.forEach( s -> System.out.println(s + "=" + map.get(s)));




    }
}
