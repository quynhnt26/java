public class Main {
    public static void main(String[] args) {

        BaoVe bv = new BaoVe();
        bv.addEmployee();
        bv.lamViec();

        KeToan kt = new KeToan();
        kt.addEmployee();
        kt.lamViec();

        TuyenSinh ts = new TuyenSinh();
        ts.addEmployee();
        ts.lamViec();

        LaoCong lc = new LaoCong();
        lc.addEmployee();
        lc.lamViec();

        GvFullTime fullTime = new GvFullTime();
        fullTime.addGiangVien();
        fullTime.soGioLamViec();
        fullTime.giangDay();
        fullTime.quanLySinhVien();
        fullTime.soanGiaoAn();

        CTV ctv = new CTV();
        ctv.addGiangVien();
        ctv.soGioLamViec();
        ctv.giangDay();
        ctv.quanLySinhVien();
        ctv.soanGiaoAn();

        ThinhGiang thinhGiang = new ThinhGiang();
        thinhGiang.addGiangVien();
        thinhGiang.soGioLamViec();
        thinhGiang.giangDay();
        thinhGiang.quanLySinhVien();
        thinhGiang.soanGiaoAn();

        SinhVien sv = new SinhVien();
        sv.addSinhVien();
        sv.diemTB();

    }
}
