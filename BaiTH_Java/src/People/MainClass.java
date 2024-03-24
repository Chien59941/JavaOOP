package People;

public class MainClass {
    public static void main(String[] args) {
        person per = new person();
        per.xuatThongTin();
        per.nhapThongTin();
        per.xuatThongTin();

        employee em = new employee();
        em.nhapThongTin("Nguyen Van C", "Da Nang", 20);
        em.xuatThongTin();
        
        employee_parttime emp = new employee_parttime();
        emp.so_gio_lam();
        emp.Luong_NV_PartTime();

        employee_fulltime emf = new employee_fulltime();
        emf.nhapLCB();
        emf.PhanTram_Doanhthu();
        emf.thuong();
        emf.Luong_FullTime();
    }
}
