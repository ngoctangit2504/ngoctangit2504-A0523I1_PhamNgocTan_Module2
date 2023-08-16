package ss4_class_object.exercise.quadratic_equation;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation () {
    }

    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String display() {
        return "Phương trình là:" +this.a+"X2 + "+this.b+"X + "+this.c+" = 0";

    }

    public double getDiscriminant() {
        return (this.b*this.b) - (4*this.a*this.c);
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(getDiscriminant())) / (2*this.a));
    }
    public double getRoot2() {
        return ((-this.b - Math.sqrt(getDiscriminant()))/ (2*this.a));
    }
    public double getOneRoot() {
        return ((-this.b)/2*this.a);
    }
}