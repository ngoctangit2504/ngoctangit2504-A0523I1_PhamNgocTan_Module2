package ss2_loop_in_java.exercise;

public class PrimeLessHundred {
    public static void main(String[] args) {
        System.out.println("---Hiển thị 100 số nguyên tố đầu tiên---");
        int n = 2;
        System.out.println(n + "\n");

        for (int count = 0; count < 100; ) {
            boolean flag = true;
            if (n > 2) {
                for (int j = 2; j < n; j++) {
                    if (n % j == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println(n + ",");
                    count++;
                }
            }
            n++;
        }
    }
}
