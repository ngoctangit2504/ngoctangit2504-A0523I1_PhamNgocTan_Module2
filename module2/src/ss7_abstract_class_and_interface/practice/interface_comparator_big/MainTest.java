package ss7_abstract_class_and_interface.practice.interface_comparator_big;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
    }
}
