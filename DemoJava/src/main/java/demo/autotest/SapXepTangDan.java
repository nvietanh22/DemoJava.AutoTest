package demo.autotest;

import java.util.Scanner;

public class SapXepTangDan {

    public static void main(String[] args) {
        int number;
        int[] soNguyen;
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        // Gán phần tử vào soNguyen
        soNguyen = new int[number];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < number; i++) {
            soNguyen[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        /**
         * sắp xếp mảng số nguyên theo thứ tự tăng dần
         *
         * @param soNguyen: mảng các số nguyên
         * @param number:   số phần tử của mảng
         */
        int temp;
        for (int i = 0; i < number - 1; i++) {
            for (int j = i + 1; j < number; j++) {
                if (soNguyen[i] > soNguyen[j]) {
                    temp = soNguyen[j];
                    soNguyen[j] = soNguyen[i];
                    soNguyen[i] = temp;
                }
            }
        }
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        for (int i = 0; i < number; i++) {
            System.out.print(soNguyen[i] + " ");
        }
    }
}
