public class EmployeeOptions {
    public static void printAllEmployees(Employee[] listEmployee) {
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

    public static double calculateCostAmount(Employee[] sumSalary) {
        double sum = 0;
        for (Employee employee : sumSalary) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void findWorkerMinSalary(Employee[] minSalary) {
        double min = Integer.MAX_VALUE;
        String nameWorker = null;
        for (Employee employee : minSalary) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                nameWorker = employee.getFullName();
            }
        }
        System.out.println("Минимальный размер ЗП " + min + " рублей получает " + nameWorker);
    }
}
