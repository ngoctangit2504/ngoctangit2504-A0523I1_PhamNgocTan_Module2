package codegym;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Hiển thị 100 số nguyên tố đầu tiên---");
        int N = 2;
        System.out.println(N + "\n");

        for (int count = 0; count < 100; ) {
            boolean flag = true;
            if (N > 2) {
                for (int j = 2; j < N; j++) {
                    if (N % j == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println(N + ",");
                    count++;
                }
            }
            N++;
        }
    }
}