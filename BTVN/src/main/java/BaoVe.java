import java.util.ArrayList;
import java.util.Scanner;

public class BaoVe extends Person implements NhanVien{
    String phoneNumber;
    public BaoVe(int id, String name, int age, String address, String phoneNumber) {
        super(id, name, age, address);
        this.phoneNumber = phoneNumber;
    }

    public BaoVe(){
        super();
    }

    @Override
    public String toString() {
        return "BaoVe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<BaoVe> listEmployee = new ArrayList();
    public void addEmployee(){
        listEmployee.add(new BaoVe(1, "Quynh Nguyen", 27, "Thanh Hoa", "0986360427"));
        listEmployee.add(new BaoVe(2, "Hai Pham", 31, "Ninh Binh", "0986360428"));
        listEmployee.add(new BaoVe(3, "Hang Tran", 30, "Hung Yen", "0986360429"));
        System.out.println("Danh sách bảo vệ sau khi thêm: ");
        for (BaoVe emp: listEmployee){
            System.out.println(emp);
        }
    }

    @Override
    public void lamViec() {
        System.out.println("Nhân viên bảo vệ");
    }
}
