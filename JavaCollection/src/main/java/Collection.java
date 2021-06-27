import java.util.*;
import java.util.stream.Collectors;

public class Collection {
    ArrayList<Person> people = new ArrayList<>(List.of(
            new Person("Vinh", "Vietnam", 28),
            new Person("Lan", "Vietnam", 24),
            new Person("John", "USA", 27),
            new Person("Lee", "China", 67),
            new Person("Kim", "Korea", 22),
            new Person("Long", "Vietnam", 18),
            new Person("Jungho", "Korea", 19),
            new Person("Tian", "China", 20),
            new Person("Clara", "USA", 40),
            new Person("Mikura", "Japan", 27),
            new Person("Sony", "Japan", 29),
            new Person("Xiang", "China", 78),
            new Person("Peter", "France", 18),
            new Person("Haloy", "Malaysia", 20),
            new Person("Magie", "Malaysia", 32)));

    // 1.1 Đếm số người theo từng quốc tịch in ra màn hình
    public void countPersonByNationality() {
        Map<String, Integer> countPersonByNationality = new HashMap<>();
        for (Person person : people) {
            Integer countPerson = countPersonByNationality.get(person.getNationality());
            if (countPerson == null) countPersonByNationality.put(person.getNationality(), 1);
            else countPersonByNationality.put(person.getNationality(), countPerson + 1);
        }
        for (Map.Entry<String, Integer> entry : countPersonByNationality.entrySet()) {
            System.out.printf(entry.getKey() + " : "+ entry.getValue() + "\n");
        }
    }

    //1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
    public void sortPersonByName(){
        ArrayList<Person> sortPersonByName = new ArrayList<>(List.of());
        for (Person i:people){
            if (i.getAge()>25){
                sortPersonByName.add(i);
            }
        }
        var result = sortPersonByName.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        for (Person over25: result)
        {
            System.out.printf("\n- %s - %s - %d",over25.getName(), over25.getNationality(), over25.getAge());
        }
    }

    //1.3 Tính trung bình tuổi của người theo từng quốc gia
    public void averageAgeByNationality(){
        Map<String,List<Person>> averageAgeByNationality = new HashMap<>();
        averageAgeByNationality = people.stream().collect(Collectors.groupingBy(w->w.getNationality()));
        for (Map.Entry<String,List<Person>> person :averageAgeByNationality.entrySet()){
            int sum = 0;
            for (Person age: person.getValue()){
                sum = sum +age.getAge();
            }
            double avrAge = (double) sum/person.getValue().size();
            System.out.printf("\n- %s: %.1f", person.getKey(), avrAge);
        }
    }

    //1.4 In ra màn hình đánh giá tuổi mỗi người
    public void evaluatePersonByAge(){
        String evaluate = "";
        for (Person person: people){
            if (person.getAge()<20){
                evaluate = "nổi loạn";
            }
            else if (person.getAge()>=20&& person.getAge()<=30){
                evaluate = "việc làm";
            }
            else if (person.getAge()>=31 && person.getAge()<=40){
                evaluate = "sự nghiệp";
            }
            else evaluate = "hưởng thụ";
            System.out.printf("\n- %s - %s - %d - %s",person.getName(), person.getNationality(),person.getAge(),evaluate);
        }
    }
}

