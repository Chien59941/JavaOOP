import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Nhap 1 so bat ky: ");
            int n, gt = 1;
        do {
             n = sc.nextInt();
        } while (n < 0);
        for(int i = 1; i <= n; i++)
        {
            gt = gt*i;
        }
        System.out.print(n + "! = "+ gt);
    }
}
