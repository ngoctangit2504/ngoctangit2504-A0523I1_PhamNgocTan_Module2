package ss6_ke_thua.exercise.build_class_triangle;

public class Main {
    public static void main(String[] args) {
        Triangle demo = new Triangle(1.0,5.0,6.0,0.8);
        System.out.println(demo.toString());
        System.out.println(demo.getPerimeter());
    }
}