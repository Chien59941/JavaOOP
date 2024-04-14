package Getter_setter;

public class MainClass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.setBanKinh(10);
        float chuVi = ht.tinhChuVi();
        float dientich = ht.tinhDientich();
        System.out.println("chu vi hinh tron "+ chuVi +"; va dien tich " + dientich);
    }
    
}
