public class Employee {
    String surname;
    String name;
    String patronymic;
    int department;
    double salary;
    int id;
    public static int idCounter; //статическая переменная счетчик, отвечающая за id

    public Employee(String surname, String name, String patronymic, int department, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = idCounter++;
    }
}
