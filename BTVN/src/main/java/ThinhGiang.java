import java.util.ArrayList;
import java.util.Scanner;

public class ThinhGiang extends Person implements GiangVien {
    String phoneNumber;

    public ThinhGiang(int id, String name, int age, String address, String phoneNumber) {
        super(id, name, age, address);
        this.phoneNumber = phoneNumber;
    }

    public ThinhGiang() {
        super();
    }

    @Override
    public String toString() {
        return "ThinhGiang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void addGiangVien() {
        ArrayList<ThinhGiang> thinhGiangs = new ArrayList();
        thinhGiangs.add(new ThinhGiang(1, "Quynh Nguyen", 27, "Thanh Hoa", "0986360427"));
        thinhGiangs.add(new ThinhGiang(2, "Hien Nguyen", 30, "Ha Noi", "0986360428"));
        System.out.println("Danh sách giáo viên full time sau khi thêm: ");
        for (ThinhGiang thinhgiang : thinhGiangs) {
            System.out.println(thinhgiang);
        }
    }

    @Override
    public int soGioLamViec() {
        int gio = 10;
        System.out.println("Thỉnh giảng dạy tối đa " + gio + "/tuần");
        return gio;
    }

    @Override
    public void giangDay() {
        System.out.println("Tiến hành giảng dạy sinh viên và hướng dẫn sinh viên về các kỹ năng tự học, nghiên cứu, trao đổi,...");

    }

    @Override
    public void quanLySinhVien() {
        System.out.println("Tham gia công tác đánh giá kết quả học tập của sinh viên");

    }

    @Override
    public void soanGiaoAn() {
        System.out.println("Thực hiện xây dựng các kế hoạch giảng dạy, trau dồi các kỹ năng cũng như trình độ chuyên môn.");

    }
}
