package ss10_danh_sach.exercise.arraylist_nomal;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(0,"pro");
        list.add(1,"vip");
        list.add(2,"alo");
        list.add(5,"alo");

        System.out.println(list);
    }
}
