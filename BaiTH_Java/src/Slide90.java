import java.util.Scanner;

public class Slide90 {
    public static void main(String[] args) {
    String chuoi;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao 1 chuoi: ");
    chuoi = sc.nextLine();
    for(int i = 0; i < chuoi.length(); i++)
        {
            System.out.println(chuoi.charAt(i));
        }
    }
}
