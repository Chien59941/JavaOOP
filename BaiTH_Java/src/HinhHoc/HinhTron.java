package HinhHoc;

import java.util.Scanner;

public class HinhTron extends Hinhhoc {
    public float banKinh;
    public  HinhTron()
    {
        ten = "Hinh tron";
        chuVi = 314;
        dienTich = 516;
    }
    public void nhapBanKinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi()
    {
        chuVi = 2*PI*banKinh;
    }
    public void tinhDienTich()
    {
        dienTich = PI*banKinh*banKinh;
    }
}
