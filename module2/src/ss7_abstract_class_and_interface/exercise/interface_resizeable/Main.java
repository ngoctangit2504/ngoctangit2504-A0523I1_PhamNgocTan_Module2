package ss7_abstract_class_and_interface.exercise.interface_resizeable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();
        System.out.println("Hình tròn sau khi thử menthod interface tăng phần trăm diện tích");
        circle.resize(100);

        Rectangle rectangle = new Rectangle(5.0,6.0);
        System.out.println("Diện tích hình chữ nhật");
        System.out.println(rectangle.getArea());
        System.out.println("Hình chữ nhật sau khi thử menthod interface tăng phần trăm diện tích");
        rectangle.resize(100);
    }
}
