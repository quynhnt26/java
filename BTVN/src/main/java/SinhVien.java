import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien extends Person {
    double diem;
    String status;
    public SinhVien(int id, String name, int age, String address, double diem, String status) {
        super(id, name, age, address);
        this.diem = diem;
        this.status = status;
    }
    public SinhVien(){
        super();
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", diem='" + diem + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public void addSinhVien(){
        ArrayList<SinhVien> listEmployee = new ArrayList();
        listEmployee.add(new SinhVien(1, "Quynh Nguyen", 27, "Thanh Hoa", 6.5, "Đã ra trường"));
        listEmployee.add(new SinhVien(2, "Hai Pham", 31, "Ninh Binh", 7.5, "Đã ra trường"));
        listEmployee.add(new SinhVien(3, "Hang Tran", 30, "Hung Yen", 5.5, "Đang học"));
        listEmployee.add(new SinhVien(4, "Hien Nguyen", 22, "Bac Ninh", 4.5, "Đang học"));
        listEmployee.add(new SinhVien(5, "Oanh Tran", 28, "Nam Dinh", 0.0, "Chuẩn bị nhập học"));
        System.out.println("Danh sách sinh viên sau khi thêm: ");
        for (SinhVien emp: listEmployee){
            System.out.println(emp);
        }
    }

    public void diemTB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm trung bình: ");
        double DTB = sc.nextDouble();
        if(DTB >=8){
            System.out.println("Xếp loại Giỏi");
        }else if(DTB <5){
            System.out.println("Xếp loại Yếu");
        } else if(DTB >= 7 & DTB < 8){
            System.out.println("Xếp loại Khá");
        } else {
            System.out.println("Xếp loại Trung Bình");
        }
    }

}