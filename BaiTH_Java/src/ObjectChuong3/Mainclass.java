package ObjectChuong3;

public class Mainclass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        System.out.println("Thong tin doi tuong hinh tron" + ht.getClass());
        System.out.println("Thong tin doi tuong hinh tron" + ht.getClass().getName());
        System.out.println("Thong tin doi tuong hinh tron" + ht.getClass().getSimpleName());
    }
}
