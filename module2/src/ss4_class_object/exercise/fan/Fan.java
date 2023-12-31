package ss4_class_object.exercise.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW; // Định nghĩa quạt đang ở tốc độ slow.
    private boolean on = false; // Định nghĩa quat đang tắt.
    private double radius = 5; // Định nghĩa bán kính quạt là 5.
    private String color = "blue"; // Định nghĩa mặc định quạt màu xanh.

    public Fan(){
        getSpeed();
        isOn();
        getRadius();
        getColor();
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString() {
        return "Tốc độ quạt "+getSpeed()+ " Quạt đang "+isOn()+ " Bán kính "+getRadius()+ " Màu sắc "+getColor();
    }

    public String toStringOn() {
        return "Tốc độ quạt "+getSpeed()+ "fan is on "+" Bán kính "+getRadius()+" Màu săc "+getColor();
    }

    public String toStringOff() {
        return "fan is off "+" Bán kính "+getRadius()+" Màu săc "+getColor();
    }
}