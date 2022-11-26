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

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFullName() {
        return name + " " + surname + " " + patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Фамилия: " + getSurname() + ", Имя: " + getName() + ", Отчество: " + getPatronymic() +
                ", отдел № " + getDepartment() + ", зп = " + getSalary() + ", id = " + getId();
    }
}