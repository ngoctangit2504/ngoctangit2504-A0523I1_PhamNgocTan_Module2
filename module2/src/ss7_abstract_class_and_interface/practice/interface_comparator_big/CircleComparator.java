package ss7_abstract_class_and_interface.practice.interface_comparator_big;

public class CircleComparator extends Circle implements Comparator<Circle> {

    public CircleComparator() {
    }

    public CircleComparator(double darius) {
        super(darius);
    }

    public CircleComparator(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }


    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
