public class EmployeeOptions {
    public static void printAllEmployees() {
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateCostAmount() {
        double sum = 0;
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static void findWorkerWithMinSalary() {
        double min = Integer.MAX_VALUE;
        String nameWorkerMin = null;
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                nameWorkerMin = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + nameWorkerMin + ". Она зарабатывает " + min + " рублей");
    }

    public static Employee findWorkerWithMaxSalary() { // оставил два разных варианта нахождения и вывода сотрудника
        // с определенным размером ЗП (мин и макс). дайте, пожалуйста,
        // обратную связь, какой вариант правильнее.
        // если допустимы оба варианта, то какой предпочтительнее. спасибо
        double max = Integer.MIN_VALUE;
        Employee nameWorkerWithMaxSalary = null;
        for (int i = 0; i < Main.BOOK_WORKERS.length; i++) {
            if (Main.BOOK_WORKERS[i] != null && Main.BOOK_WORKERS[i].getSalary() > max) {
                nameWorkerWithMaxSalary = Main.BOOK_WORKERS[i];
            }
        }
        return nameWorkerWithMaxSalary;
    }

    public static double calculateAverageSalary() {
        int count = 0;
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null) {
                count++;
            }
        }
        return calculateCostAmount() / count;
    }

    public static void printFullNamesWorkers() {
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void indexSalary(double percent) {

        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
                System.out.printf("После индексации зарплаты " + employee.getFullName() + " получает %.0f " + " рублей%n", employee.getSalary());
            }
        }
    }

    public static void findWorkerWithMinSalaryInDepartment(int number) {
        double min = Integer.MAX_VALUE;
        String minSalaryEmployee = null;
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null && employee.getDepartment() == number && employee.getSalary() < min) {
                min = employee.getSalary();
                minSalaryEmployee = employee.getFullName();
            }
        }
        System.out.printf(minSalaryEmployee + " из " + number + "-го отдела зарабатывает %.0f "
                + " рублей в месяц. Это минимальная ЗП в этом отделе%n", min);
    }

    public static void findWorkerWithMaxSalaryInDepartment(int number) {
        double max = Integer.MIN_VALUE;
        String maxSalaryEmployee = null;
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null && employee.getDepartment() == number && employee.getSalary() > max) {
                max = employee.getSalary();
                maxSalaryEmployee = employee.getFullName();
            }
        }
        System.out.printf(maxSalaryEmployee + " из " + number + "-го отдела зарабатывает %.0f "
                + " рублей в месяц. Это максимальная ЗП в этом отделе%n", max);
    }
    public static double calculateCostAmountInDepartment(int number) {
        double sum = 0;
        for (Employee employee : Main.BOOK_WORKERS) {
            if (employee != null && employee.getDepartment() == number) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

}