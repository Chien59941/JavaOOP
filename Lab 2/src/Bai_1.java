package src;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        double a,b, tong, hieu, tich, thuong, phandu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        tong = a + b;
        System.out.println("Tong cua 2 so bat ky la " + tong);
        hieu = a-b;
        System.out.println("Hieu cua 2 so bat ky la " + hieu);
        tich = a*b;
        System.out.println("Tich cua 2 so bat ky la " + tich);
        thuong = a/b;
        if(b == 0)
        System.out.println("Khong co phep chia nay");
        else
        System.out.println("Thuong cua 2 so bat ky la " + thuong);
        phandu = a%b; 
        System.out.println("Phan du cua 2 so bat ky la " + phandu);
        if(a==b)
        System.out.println("Hai so bang nhau");
        else if(a > b)
        System.out.println("a lon hon b  ");
        else
        System.out.println("a nho hon b   ");
        }
    }
