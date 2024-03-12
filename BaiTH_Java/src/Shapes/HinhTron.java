package Shapes;

import java.util.Scanner;

public class HinhTron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    public void nhapBankinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap vao ban kinh hinh tron: ");
        r = sc.nextFloat();
    }
    public void tinhchuvi()
    {
        cv = 2*PI*r;
    }
    public void tinhdientich()
    {
        dt = PI*r*r;
    }
    public void inchuvi()
    {
        System.out.println("Chu vi hinh tron "+ cv);
    }
    public void indientich()
    {
        System.out.println("Dien tich hinh tron "+ dt);
    }
}
