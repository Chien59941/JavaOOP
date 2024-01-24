import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        String Ten;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        Ten = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        a = sc.nextInt();
        if(a > 2024)
            System.out.println("Nhap nam sai, Nam phai < 2023");
        else if((2024 - a) < 16)
            System.out.println("Ban " + Ten + " o do tuoi vi thanh nien");
        else if((2024 - a) >= 16 && (2024 - a) < 18)
            System.out.println("Ban " + Ten + " o do tuoi truong thanh");
        else
            System.out.println("Ban " + Ten + " da gia");
    }
}
