package ss4_class_object.exercise.stop_watch;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void addArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100000) + 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("Đồng hồ bấm giờ thêm phần ử vào mảng 100000 phần tử.");
            System.out.println("---menu---");
            System.out.println("1. Start.");
            System.out.println("0. Exit.");
            System.out.println("Nhập lựa chọn của bạn:");
            int check = scanner.nextInt();
            if ( check == 1 ) {
                LocalTime start = LocalTime.now();
                LocalTime end = LocalTime.now();
                StopWatch run = new StopWatch(start,end);
                run.start();
                System.out.println("Thời giam bắt đầu "+run.getStartTime());

                int arr[] = new int[100000];
                addArr(arr);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }

                StopWatch stop = new StopWatch(start,end);
                stop.stop();
                System.out.println("\n"+"thời gian kết thúc "+stop.getEndTime());

                System.out.println(stop.getElapsedTime());
            } else if (check == 0) {
                flag = false;
                break;
            } else {
                System.out.println("Cú pháp không hợp lệ");
            }
        } while (flag);
    }
}