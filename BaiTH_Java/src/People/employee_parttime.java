package People;

import java.util.Scanner;

public class employee_parttime extends employee {
    public final float Luong1h = 20.0f;
    public Float gio;
    public void so_gio_lam()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("So gio lam: ");
        gio = sc.nextFloat();
    }
    public void Luong_NV_PartTime()
    {   
        luong = Luong1h*gio;
        inLuong();
    }
}
