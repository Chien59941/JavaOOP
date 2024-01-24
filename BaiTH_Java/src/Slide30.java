import java.util.Scanner;

public class Slide30 { 
    public static void main(String[] args) {
        int n, du, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen bat ky: ");
        n = sc.nextInt();
        while ( n >0 ) {
            du = n%10;
            s = s + du;
            n = n/10;
        }
        System.out.println("Tong cac chu so la " + s);
    } 
}
