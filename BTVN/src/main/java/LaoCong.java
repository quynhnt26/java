import java.util.ArrayList;
import java.util.Scanner;

public class LaoCong extends Person implements NhanVien{
    String phoneNumber;
    public LaoCong(int id, String name, int age, String address, String phoneNumber) {
        super(id, name, age, address);
        this.phoneNumber = phoneNumber;
    }

    public LaoCong(){
        super();
    }

    @Override
    public String toString() {
        return "LaoCong{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<LaoCong> listEmployee = new ArrayList();
    public void addEmployee(){
        listEmployee.add(new LaoCong(1, "Quynh Nguyen", 27, "Thanh Hoa", "0986360427"));
        listEmployee.add(new LaoCong(2, "Hai Pham", 31, "Ninh Binh", "0986360428"));
        listEmployee.add(new LaoCong(3, "Hang Tran", 30, "Hung Yen", "0986360429"));
        listEmployee.add(new LaoCong(4, "Hien Nguyen", 22, "Bac Ninh", "0986360430"));
        listEmployee.add(new LaoCong(5, "Oanh Tran", 28, "Nam Dinh", "0986360431"));
        System.out.println("Danh sách nhân viên quét dọn sau khi thêm: ");
        for (LaoCong emp: listEmployee){
            System.out.println(emp);
        }
    }

    @Override
    public void lamViec() {
        System.out.println("Nhân viên dọn dẹp");
    }
}
