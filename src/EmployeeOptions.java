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
}
