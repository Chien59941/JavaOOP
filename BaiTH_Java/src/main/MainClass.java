package main;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;

public class MainClass {
    public static void main(String[] args) {
        HinhTron ht4 = new HinhTron();
        HinhChuNhat hcn1 = new HinhChuNhat();
        ht4.nhapBankinh();
        ht4.tinhchuvi();
        ht4.tinhdientich();
        ht4.inchuvi();
        ht4.indientich();
        
        hcn1.nhapChieuDai();
        hcn1.nhapChieuRong();
        hcn1.tinhChuvi();
        hcn1.tinhDientich();
        hcn1.inChUVi();
        hcn1.inDIenTich();
    }
}
