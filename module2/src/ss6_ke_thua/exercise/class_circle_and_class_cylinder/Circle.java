package ss6_ke_thua.exercise.class_circle_and_class_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính " + getRadius() + " và màu " + getColor();
    }

    public static void main(String[] args) {
        Circle demo = new Circle(15, "red");
        System.out.println(demo.toString());
    }
}