package ss7_abstract_class_and_interface.practice.interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
    }
}