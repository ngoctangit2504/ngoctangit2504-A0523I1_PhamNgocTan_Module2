package ss5_access_modifier_static_method_static_property.practice.static_property;

public class Car {
    private String name;
    private String enegine;
    public static int numberOfCar;
    public Car(String name, String enegine) {
        this.name = name;
        this.enegine = enegine;
        numberOfCar++;
    }
    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnegine() {
        return enegine;
    }

    public void setEnegine(String enegine) {
        this.enegine = enegine;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }
}