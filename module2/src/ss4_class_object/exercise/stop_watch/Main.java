package ss4_class_object.exercise.stop_watch;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.start());
        for (int i = 0; i < 100; i++) {
            System.out.println("hi lulu");
        }
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
    }
}