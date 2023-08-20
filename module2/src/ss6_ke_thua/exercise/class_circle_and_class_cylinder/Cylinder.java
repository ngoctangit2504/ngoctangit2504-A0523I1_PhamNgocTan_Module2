package ss6_ke_thua.exercise.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * (getRadius() * getRadius() * Math.PI);
    }

    @Override
    public String toString() {
        return "Hình trụ có bán kính đáy " + getRadius() + " màu " + getColor() + " chiều cao " + getHeight() + " thể tích " + getVolume()
                + super.toString();
    }

    public static void main(String[] args) {
        Circle tru = new Cylinder(15, "white", 6);
        System.out.println(tru.toString());
    }
}