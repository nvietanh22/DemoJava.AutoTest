package demo.autotest;

import java.util.Scanner;

public class Bài12 { public static void main(String[] args) {
        int number;//Số lượng phần tử
        int[] soNguyen;
        Scanner scanner = new Scanner(System.in);// Khai bao ham doc du lieu nhap tu ban phim
        System.out.println("Nhap vào number:");
        number = scanner.nextInt();// doc du lieu int nhap vao tu nguoi dung
    //Gan phan tu so nguyen vao mang
        soNguyen = new int[number];


    //Sau khi biet co bao nhieu phan tu trong mang
    // Nhập các giá trị vào từng vị trí của mảng
        for(int i = 0; i < number; i ++){
            System.out.println("Nhập số nguyên:");
            soNguyen[i] = scanner.nextInt();// Đọc dữ liệu nhập vào từ mảng
        }


    //In ra mảng ban đầu
        System.out.println("Mảng trước khi đảo ngược:");
        for(int i = 0; i < number; i++){
            System.out.println(soNguyen[i] + " ");
        }


    //Đảo ngược mảng
        for (int i = 0; i < number/2; i++){
            int index;// biến tạm
            index = soNguyen[i];
            soNguyen[i] = soNguyen[number-i-1];
            soNguyen[number-i-1] = index;
        }


    // in mảng sau khi đảo ngược
        System.out.println("Mảng đã đảo ngược:");
        for(int i = 0; i< number; i++){
            System.out.println(soNguyen[i] + " ");
        }

    }
}
