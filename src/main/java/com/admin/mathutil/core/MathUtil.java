package com.admin.mathutil.core;

/**
 * Class cung cap cac ham tien ich toan hoc
 * Tac gia: Admin - Mon SWT301 FPT University
 */
public class MathUtil {

    /**
     * Ham tinh giai thua n! = 1.2.3...n
     * Quy tac:
     * - Khong tinh giai thua so am hoac so lon hon 20 (do tran kieu long)
     * - 0! = 1! = 1
     * - n >= 2: n! = n * (n - 1)!
     *
     * @param n so nguyen can tinh giai thua (0 <= n <= 20)
     * @return ket qua n!
     * @throws IllegalArgumentException neu n < 0 hoac n > 20
     */
    public static long getFactorial(int n) {

        // Kiểm tra đầu vào
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        // Điều kiện dừng đệ quy
        if (n == 0 || n == 1) {
            return 2;
        }

        // Gọi đệ quy
        return n * getFactorial(n - 1);



//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
    }
}