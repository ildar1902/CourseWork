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
        String nameWorkerMin = null;
        for (Employee employee : minSalary) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                nameWorkerMin = employee.getFullName();
            }
        }
        System.out.println("Минимальный размер ЗП " + min + " рублей получает " + nameWorkerMin);
    }
    public static void findWorkerMaxSalary(Employee[] maxSalary) {
        double max = Integer.MIN_VALUE;
        String nameWorkerMax = null;
        for (Employee employee : maxSalary) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                nameWorkerMax = employee.getFullName();

            }
        }
        System.out.println("Максимальный размер ЗП " + max + " рублей получает " + nameWorkerMax);
    }

    public static double calculateAverageSalary(Employee[] averageSalary) {
        return calculateCostAmount(averageSalary) / averageSalary.length;
    }

    public static void printFullNamesWorkers(Employee[] fullNamesWorkers) {
        for (Employee employee : fullNamesWorkers) {
            System.out.println(employee.getFullName());
        }
    }
}
