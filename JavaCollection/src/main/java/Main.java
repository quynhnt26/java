public class Main {
    public static void main(String[] args) {
        Collection person = new Collection();
        System.out.println("Bài 1: Số người theo từng quốc tịch");
        person.countPersonByNationality();
        System.out.println("\nBài 2: Danh sách tên những người trên 25 tuổi");
        person.sortPersonByName();
        System.out.println("\nBài 3: Trung bình tuổi của người theo từng quốc gia");
        person.averageAgeByNationality();
        System.out.println("\nBài 4: Đánh giá tuổi mỗi người");
        person.evaluatePersonByAge();
    }
}
