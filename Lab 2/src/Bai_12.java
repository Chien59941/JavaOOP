import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
    int n=0,m=0, i,j;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao so dong cua ma tran: ");
    while (n<=0) {
    n = sc.nextInt();}
    System.out.print("Nhap vao so cot cua ma tran: ");
    while (m<=0) {
    m = sc.nextInt();}
    int A[][] = new int[n][m];
    System.out.print("Nhap cac phan tu cho ma tran: ");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
        System.out.print("A[" + i + "][" + j + "] = ");
        A[i][j] = sc.nextInt();
        }
    }
    int max = A[0][0];
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
        if(max < A[i][j])
            {
            max = A[i][j];
            }
        }
    }
    System.out.print("Phan tu lon nhat trong mang la "+ max);
    }
}
