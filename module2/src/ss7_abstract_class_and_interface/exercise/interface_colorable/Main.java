package ss7_abstract_class_and_interface.exercise.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.6);
        System.out.println(square.getArea());
        square.howToColor();
    }
}
