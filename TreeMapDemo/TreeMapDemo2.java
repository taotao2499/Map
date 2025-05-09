package TreeMapDemo;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {

        // 需求：按照学生的年龄进行排序
        // 1. 创建TreeMap集合对象
        TreeMap<Student,String> tm = new TreeMap();

        // 2. 创建学生对象
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 18);
        Student s3 = new Student("王五", 22);
        Student s4 = new Student("赵六", 19);

        // 3. 添加学生对象
        tm.put(s1, "北京");
        tm.put(s2, "江苏");
        tm.put(s3, "上海");
        tm.put(s4, "深圳");

        System.out.println(tm);





    }
}
