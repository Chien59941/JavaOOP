import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        delta = b*b - 4*a*c;
        x = -b/2*a;
        x1 = (-b + Math.sqrt(delta))/2*a;
        x2 = (-b - Math.sqrt(delta))/2*a;
        if(a==0)
        System.out.println("Khong phai phuong trinh bac 2");
        else if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if( delta == 0){
            System.out.println("Phuong trinh co nghiem kep" + x);
        }
        else System.out.println("Phuong trinh co 2 nghiem phan biet"+ " " + "x1 la " + x1 + ",  " + "x2 la " +x2);
    }
}
