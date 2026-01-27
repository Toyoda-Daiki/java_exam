import java.util.ArrayList;

public class Exam3 {
  public static void main(String[] args) {
    ArrayList<Employee> employees = new ArrayList<>();

    Employee employee1 = new Employee();
    employee1.setName("後藤");
    employee1.setAge(31);

    Employee employee2 = new Employee();
    employee2.setName("山田");
    employee2.setAge(28);

    Employee employee3 = new Employee();
    employee3.setName("佐藤");
    employee3.setAge(25);

    Employee employee4 = new Employee();
    employee4.setName("田中");
    employee4.setAge(19);

    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);
    employees.add(employee4);

    for (Employee e : employees) {
      System.out.println(e.getName() + "(" + e.getAge() + "歳)");
    }
  }
}
