package ss4_class_object.exercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();
        System.out.println("--- Giải phương trình bậc 2---");

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.display());
        System.out.println("delta của pt: "+quadraticEquation.getDiscriminant());

        double detal = quadraticEquation.getDiscriminant();
        if (detal > 0) {
            double x = quadraticEquation.getRoot1();
            double y = quadraticEquation.getRoot2();
            System.out.println("PT có 2 nghiệm x = "+x+" và x = "+y);
        } else if (detal == 0) {
            double x = quadraticEquation.getOneRoot();
            System.out.println("PT có 1 nghiệm x = "+x);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}