package ss13_search.exercise.chuoi_lien_tiep_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Nhập chuỗi:");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (int i = 0; i < max.size(); i++) {
            System.out.print(max.get(i));
        }
    }
}
