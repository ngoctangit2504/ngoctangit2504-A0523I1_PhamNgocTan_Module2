package ss5_access_modifier_static_method_static_property.exercise.lop_chi_ghi_trong_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Tân","A05");
        student.setName("Luxury");
        student.setClasses("A500");
        System.out.println(student.toString());
    }
}