package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends Hinhhoc 
{
    public float dai;
    public float rong;
    public HinhChuNhat()
    {
        ten = "Hinh chu nhat";
    }
    public void nhapChieuDai()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        dai = sc.nextFloat();
    }
    public void nhapChieuRong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        rong = sc.nextFloat();
        
    }
    public void tinhChuVi()
    {
        chuVi = 2*(dai+rong);
    }
    public void tinhDienTich()
    {
        dienTich = dai*rong;
    }
}


