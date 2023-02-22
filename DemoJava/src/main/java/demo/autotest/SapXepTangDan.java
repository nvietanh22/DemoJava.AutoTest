package demo.autotest;

import java.util.Scanner;

public class SapXepTangDan {

    public static void main(String[] args) {
        int number;
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        // khởi tạo array
        int[] array;
        array = new int[number];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < number; i++) {
            System.out.printf("a[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        /**
         * sắp xếp mảng số nguyên theo thứ tự tăng dần
         *
         * @param array: mảng các số nguyên
         * @param number:   số phần tử của mảng
         */
        int temp;
        for (int i = 0; i < number - 1; i++) {
            for (int j = i + 1; j < number; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        for (int i = 0; i < number; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
