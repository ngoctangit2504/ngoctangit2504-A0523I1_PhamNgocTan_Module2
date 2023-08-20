package ss5_access_modifier_static_method_static_property.exercise.lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "Tên : " + name + " Lớp : "+classes;
    }
}