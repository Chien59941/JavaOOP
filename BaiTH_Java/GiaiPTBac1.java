import java.util.Scanner;

public class GiaiPTBac1 {
    public static void main(String[] args)
    {
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        x = -b/a;
        if(a==0)
            System.out.println("Khong phai phuong trinh bac nhat");
        else 
            System.out.println("Phuong trinh co nghiem duy nhat: " + x);
    }
}
