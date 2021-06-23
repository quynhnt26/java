import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh extends Person implements NhanVien{
    String phoneNumber;
    public TuyenSinh(int id, String name, int age, String address, String phoneNumber) {
        super(id, name, age, address);
        this.phoneNumber = phoneNumber;
    }

    public TuyenSinh(){
        super();
    }

    @Override
    public String toString() {
        return "TuyenSinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    ArrayList<TuyenSinh> listEmployee = new ArrayList();
    public void addEmployee(){
        listEmployee.add(new TuyenSinh(1, "Quynh Nguyen", 27, "Thanh Hoa", "0986360427"));
        listEmployee.add(new TuyenSinh(2, "Hai Pham", 31, "Ninh Binh", "0986360428"));
        listEmployee.add(new TuyenSinh(3, "Hang Tran", 30, "Hung Yen", "0986360429"));
        listEmployee.add(new TuyenSinh(4, "Hien Nguyen", 22, "Bac Ninh", "0986360430"));
        listEmployee.add(new TuyenSinh(5, "Oanh Tran", 28, "Nam Dinh", "0986360431"));
        System.out.println("Danh sách nhân viên tuyển sinh sau khi thêm: ");
        for (TuyenSinh emp: listEmployee){
            System.out.println(emp);
        }
    }

    @Override
    public void lamViec() {
        System.out.println("Nhân viên tuyển sinh");
    }
}
