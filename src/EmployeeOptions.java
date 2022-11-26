public class EmployeeOptions {
    public static void printAllEmployees() {
        for (Employee employee : Main.BOOK_WORKERS) {
            System.out.println(employee);
        }
    }
    public static double calculateCostAmount() {
        double sum = 0;
        for (Employee employee : Main.BOOK_WORKERS) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static void findWorkerWithMinSalary() {
        double min = Integer.MAX_VALUE;
        String nameWorkerMin = null;
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                nameWorkerMin = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + nameWorkerMin + ". Она зарабатывает "+ min + " рублей");
    }
    public static Employee findWorkerWithMaxSalary() { // оставил два разных варианта нахождения и вывода сотрудника
                                                       // с определенным размером ЗП (мин и макс). дайте, пожалуйста,
                                                      // обратную связь, какой вариант правильнее.
                                                    // если допустимы оба варианта, то какой предпочтительнее. спасибо
        double max = Integer.MIN_VALUE;
        Employee nameWorkerWithMaxSalary = null;
        for (int i = 0; i < Main.BOOK_WORKERS.length; i++) {
            if (Main.BOOK_WORKERS[i].getSalary() > max) {
                nameWorkerWithMaxSalary = Main.BOOK_WORKERS[i];
            }
        }
        return nameWorkerWithMaxSalary;
    }

    public static double calculateAverageSalary() {
        return calculateCostAmount() / Main.BOOK_WORKERS.length;
    }

    public static void printFullNamesWorkers() {
        for (Employee employee : Main.BOOK_WORKERS) {
            System.out.println(employee.getFullName());
        }
    }
}
