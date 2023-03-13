package demo.autotest;

import java.util.Scanner;

public class de {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số phần tử của mảng: ");
        number = scanner.nextInt();
        int soNguyen[] = new int[number];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < number; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            soNguyen[i] = scanner.nextInt();
        }
        // Tìm phần tử có giá trị lớn nhất, nhỏ nhất
        int max = soNguyen[0]; // khởi tạo phần tử lớn nhất là phần tử đầu tiên
        int min = soNguyen[0]; // khởi tạo phần tử bé nhất là phần tử đầu tiên

        for (int i = 0; i < number; i++) {
            if (soNguyen[i] < min) {
                min = soNguyen[i];
            }

            if (soNguyen[i] > max) {
                max = soNguyen[i];
            }
        }
        System.out.print("\nPhần tử lớn nhất trong mảng là " + max);
        System.out.print("\nPhần tử nhỏ nhất trong mảng là " + min);
    }
}
