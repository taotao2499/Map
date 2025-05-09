package MapDemp;

import java.util.HashMap;
import java.util.Map;

public class a01MapDemo03 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式：Lambda表达式
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan", 18);
        map.put("lisi", 20);
        map.put("wangwu", 22);

        map.forEach( (k,v) -> System.out.println(k + "=" + v));


    }
}
