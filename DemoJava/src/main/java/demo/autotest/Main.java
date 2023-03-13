package demo.autotest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message;
        // sử dụng class Scanner để nhận dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi cần thay đổi: ");
        message = sc.nextLine();
        //sử dụng phương thức toLowerCase() để in thường các ký tự trong chuỗi
        System.out.println("Chuỗi sau khi viết thường:\n" + message.toLowerCase());
        //sử dụng phương thức toUpperCase() để in hoa các ký tự trong chuỗi
        System.out.println("Chuỗi sau khi viết hoa:\n" + message.toUpperCase());

    }
}