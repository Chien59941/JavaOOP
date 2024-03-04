import java.util.Scanner;

public class HinhTron {
    public final float PI = 3.14f;
    public float r;
    public float cv;
    public float dt;

    public void nhapBK()
    { 
        System.out.println("Hay nhap vao ban kinh hinh tron ");
    Scanner sc = new Scanner(System.in);
    r = sc.nextFloat(); 
    sc.close(); 
    }
    public void tinhChuVi()
    {
        cv = 2*PI*r;
    }  
    public void tinhDienTich()
    {
        dt = r*r*PI;
    }
    public void inChuVi()
    {
        System.out.println("Chu vi hinh tron: " + cv);
    }
    public void inDienTich()
    {
        System.out.println("Dien tich hinh tron: "+ dt);
    }
    
}
