package ss6_ke_thua.practice.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filler) {
        super(side,side,color,filler);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
