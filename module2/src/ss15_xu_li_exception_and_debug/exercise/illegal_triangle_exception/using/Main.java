package ss15_xu_li_exception_and_debug.exercise.illegal_triangle_exception.using;

import ss15_xu_li_exception_and_debug.exercise.illegal_triangle_exception.triangleEdgesCheck.TriangleEdgesCheck;
import ss15_xu_li_exception_and_debug.exercise.illegal_triangle_exception.triangleEdgesException.TriangleEdgesException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo đối tượng
        TriangleEdgesCheck check = new TriangleEdgesCheck();

        // Nhập dữ liệu
        try {
            System.out.println("Nhập cạnh 1");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh 2");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh 3");
            int c = scanner.nextInt();

            try {
                check.checkTriangleEdges(a,b,c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Sai: Không đúng định dạng!");
        }
    }
}
