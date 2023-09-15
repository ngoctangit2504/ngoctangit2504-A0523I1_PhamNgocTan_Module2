package ss12_java_collection_fram.practice.danh_sach_sinh_vien_theo_do_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tan", 22);
        hashMap.put("Phat", 23);
        hashMap.put("Luxury", 68);
        System.out.println("Display entries in Hashmap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Pham",30);
        linkedHashMap.put("Ngoc",31);
        linkedHashMap.put("Tan",22);
        System.out.println("\n The age for " + " Tan " + linkedHashMap.get("Tan"));
    }
}
