package TreeMapDemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        tm.put(5, "A");
        tm.put(2, "B");
        tm.put(1, "C");
        tm.put(3, "D");

        System.out.println(tm);



    }
}
