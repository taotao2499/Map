package MapDemp;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {

        // 1. 创建一个 HashMap 对象
        HashMap<Student,String> hm = new HashMap<>();
        // 2. 添加元素
        hm.put(new Student("张三", 23), "北京");
        hm.put(new Student("李四", 24), "上海");
        hm.put(new Student("王五", 25), "广州");
        hm.put(new Student("赵六", 26), "深圳");

        // 3. 遍历
        for (Student key : hm.keySet()) {
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }




    }
}
