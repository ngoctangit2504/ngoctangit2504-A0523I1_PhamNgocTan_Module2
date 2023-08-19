package ss4_class_object.exercise.fan;

public class Main {
    public static void main(String[] args) {
        System.out.println("FAN Mặc định");
        Fan fanS = new Fan();
        System.out.println(fanS);

        System.out.println("---FAN 1---");
        Fan fan1 = new Fan(fanS.getFAST(), true,10,"yellow");
        if (fan1.isOn() == true) {
            System.out.println(fan1.toStringOn());
        } else {
            System.out.println(fan1.toStringOff());
        }

        System.out.println("---FAN 2---");
        Fan fan2 = new Fan(fanS.getMEDIUM(),false,5,"blue");
        if (fan2.isOn() == true) {
            System.out.println(fan2.toStringOn());
        } else {
            System.out.println(fan2.toStringOff());
        }
    }
}