package demo.autotest;

import java.util.Scanner;

public class TimGiaTriLonNhatVaNhoNhat {

    public static void main(String[] args) {
        int number;
        int[] soNguyen;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử trong mảng:");

        number = sc.nextInt();
        soNguyen = new int[number];

        // Tìm phần tử có giá trị lớn nhất, nhỏ nhất
        int min = soNguyen[0];// khởi tạo phần tử bé nhất là phần tử đầu tiên
        int max = soNguyen[0];// khởi tạo phần tử lớn nhất là phần tử đầu tiên

        for (int i = 0; i < number; i++) {
            System.out.println("Nhập vào số nguyên:");
            soNguyen[i] = sc.nextInt();
        }

        for (int i = 0; i < number; i++) {
            if (soNguyen[i] < min) {
                min = soNguyen[i];
            }

            if (soNguyen[i] > max) {
                max = soNguyen[i];
            }
        }
        System.out.println("\nPhần tử có giá trị nhỏ nhất là: " + min);
        System.out.println("\nPhần tử có giá trị lớn nhất là: " + max);
    }
}
