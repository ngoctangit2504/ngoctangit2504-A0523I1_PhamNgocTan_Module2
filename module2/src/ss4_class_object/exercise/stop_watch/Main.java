package ss4_class_object.exercise.stop_watch;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int []arr1 = new int[100000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] =(int) (Math.random()*100000);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Đồng hồ bấm giờ");
        System.out.println("---menu---");
        System.out.println("1. Start.");
        System.out.println("0. Exit.");


    }
}