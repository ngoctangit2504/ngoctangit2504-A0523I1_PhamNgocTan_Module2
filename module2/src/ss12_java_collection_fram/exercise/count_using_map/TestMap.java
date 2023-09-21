package ss12_java_collection_fram.exercise.count_using_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi để đếm số lần xuất hiện các từ:");
        String string = scanner.nextLine();

        String[] arr = string.split(" ");
        String key = "";
        Integer value;

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            key = (String) i.next();
            System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
        }
    }
}
