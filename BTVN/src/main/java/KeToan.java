import java.util.ArrayList;
import java.util.Scanner;

public class KeToan extends Person implements NhanVien{
    String phoneNumber;
    public KeToan(int id, String name, int age, String address, String phoneNumber) {
        super(id, name, age, address);
        this.phoneNumber = phoneNumber;
    }

    public KeToan(){
        super();
    }

    @Override
    public String toString() {
        return "KeToan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<KeToan> listEmployee = new ArrayList();
    public void addEmployee(){
        listEmployee.add(new KeToan(1, "Quynh Nguyen", 27, "Thanh Hoa", "0986360427"));
        listEmployee.add(new KeToan(2, "Hai Pham", 31, "Ninh Binh", "0986360428"));
        System.out.println("Danh sách kế toàn sau khi thêm: ");
        for (KeToan emp: listEmployee){
            System.out.println(emp);
        }
    }

    @Override
    public void lamViec() {
        System.out.println("Nhân viên kế toán");
    }
}
