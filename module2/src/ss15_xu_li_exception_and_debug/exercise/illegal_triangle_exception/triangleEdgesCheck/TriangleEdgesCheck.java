package ss15_xu_li_exception_and_debug.exercise.illegal_triangle_exception.triangleEdgesCheck;

import ss15_xu_li_exception_and_debug.exercise.illegal_triangle_exception.triangleEdgesException.TriangleEdgesException;

public class TriangleEdgesCheck {
    // Hàm kiểm tra tam giác hợp lệ
    public void checkTriangleEdges(double a,double b,double c)
        throws TriangleEdgesException {
        if (a+b <= c || a+c <= b || b+c <= a) {
            throw new TriangleEdgesException("Lỗi: Tam giác không hợp lệ");
        } else {
            System.out.println("Tam giác hợp lệ .");
        }
    }
}
