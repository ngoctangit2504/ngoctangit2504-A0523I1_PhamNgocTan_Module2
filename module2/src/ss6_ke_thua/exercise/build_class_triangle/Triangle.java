package ss6_ke_thua.exercise.build_class_triangle;

public class Triangle extends Shape{
    private double height = 0.7;

    public Triangle() {
    }

    public Triangle(double height) {
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3, double height) {
        super(side1, side2, side3);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        // p là nữa chu vi.
        double p = (getSide1() + getSide2() + getSide3()) / 2;
        // h là chiều cao.
        double h = 2 * ((Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()))) / getSide1());
        // diện tích là đây.
        double s = (getSide1() * h) / 2;
        return s;
    }

    public double getPerimeter() {
        return (getSide1() + getSide2() + getSide3());
    }

    @Override
    public String toString() {
        return super.toString() + "bổ sung chiều cao "+getHeight();
    }
}
