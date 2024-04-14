package Getter_setter;

public class HinhTron {
    private final float PI = 3.14f;
    private float bankinh;
    public float getBanKinh()
    {
        return bankinh;
    }
    public void setBanKinh(float bankInh)
    {
        this.bankinh = bankInh;
    }
    public float tinhChuVi()
    {
        return 2*PI*bankinh;
    }
    public float tinhDientich()
    {
        return PI*bankinh*bankinh;
    }
}
