package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students;
        students = new String[3];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name student at "+i);
            students[i] = scanner.nextLine();
        }

        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            // .equals so sánh chuỗi dựa trên nội dung
            if (students[i].equals( input_name)) {
                System.out.println(input_name+" is at "+i+" in array.");
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}