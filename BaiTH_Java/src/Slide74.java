import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao so phan tu cua mang: ");
            n =sc.nextInt();
        } while (n<0);
        int a[] =  new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        } 
        int s = 0;
        for(int i = 0; i < n; i++){
            if(a[i]%2==0)
            {s = s + a[i];}
        }
        System.out.print("Tong : " + s);
    }
}
