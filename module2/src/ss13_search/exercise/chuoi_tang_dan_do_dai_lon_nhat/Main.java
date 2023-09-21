package ss13_search.exercise.chuoi_tang_dan_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        // Tìm chuỗi tăng dần có độ dài lớn nhất

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch:
             max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
