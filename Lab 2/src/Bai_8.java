import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        int n , number, s = 0;
        String strKQ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so so nguyen: ");
        n = sc.nextInt();
        for( int i = 0; i < n; i++)
        {
            System.out.print("Nhap so thu " + i + " : ");
            number = sc.nextInt();
            s = s + number;
        }
        float tbc = (float) s/n;
        System.out.println("TBC cua cac so da nhap la "+ tbc);
    }
}
