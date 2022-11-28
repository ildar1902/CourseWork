public class Main {
    public static Employee[] BOOK_WORKERS = new Employee[10]; //хранилище для записей о сотрудниках

    public static void main(String[] args) {
        System.out.println();
        System.out.println("                Курсовая работа Амерханова Ильдара.");
        System.out.println();
        System.out.println("    Список сотрудников со всеми данными:");
        BOOK_WORKERS[0] = new Employee("Андреев", "Матвей", "Адамович", 1, 50_435);
        BOOK_WORKERS[1] = new Employee("Жукова", "Есения", "Ильинична", 1, 43_565);
        BOOK_WORKERS[2] = new Employee("Федорова", "Вероника", "Михайловна", 2, 45_635);
        BOOK_WORKERS[3] = new Employee("Щербаков", "Михаил", "Владимирович", 3, 50_800);
        BOOK_WORKERS[4] = new Employee("Волков", "Артём", "Алексеевич", 4, 65_000);
        BOOK_WORKERS[5] = new Employee("Осипова", "Анастасия", "Дмитриевна", 2, 51_990);
        BOOK_WORKERS[6] = new Employee("Воробьёва", "Малика", "Валерьевна", 5, 45_190);
        BOOK_WORKERS[7] = new Employee("Кулешов", "Роман", "Эминович", 4, 55_490);
        BOOK_WORKERS[8] = new Employee("Королёв", "Илья", "Львович", 3, 53_090);
        BOOK_WORKERS[9] = new Employee("Морозова", "Александра", "Марковна", 5, 65_290);
        EmployeeOptions.printAllEmployees();// вызов метода, который выводит в консоль список
        System.out.println();                // всех сотрудников со всеми имеющимися по ним данными
        double costAmount = EmployeeOptions.calculateCostAmount(); //метод, считающий сумму затрат на ЗП в месяц
        System.out.println("Сумма затрат на ЗП в месяц = " + costAmount + " рублей");
        System.out.println();
        EmployeeOptions.findWorkerWithMinSalary(); //вызов метода, который находит сотрудника с минимальной ЗП
        System.out.println();
        Employee workerWithMaxSalary = EmployeeOptions.findWorkerWithMaxSalary(); //вызов метода, который находит сотрудника с максимальной ЗП
        System.out.println("Сотрудник с максимальной зарплатой: " + workerWithMaxSalary);
        System.out.println();
        double averageSalary = EmployeeOptions.calculateAverageSalary();//метод, который считает среднюю ЗП
        System.out.println("Средний размер ЗП = " + averageSalary + " рублей");
        System.out.println();
        EmployeeOptions.printFullNamesWorkers();//метод, который выводит в консоль ФИО всех сотрудников
        System.out.println();
        System.out.println("        Ну вот и всё. Базовая сложность выполнена");

//        Повышенная сложность
        System.out.println();
        System.out.println("    Задания повышенной сложности");
        double percentIncreasingSalary = 6; // задаваемая величина индексации (%)
        EmployeeOptions.indexSalary(percentIncreasingSalary); //вызов метода, который индексирует ЗП
        System.out.println();
        int numberDepartment = 4; //задаваемый номер отдела
        EmployeeOptions.findWorkerWithMinSalaryInDepartment(numberDepartment); //вызов метода, который находит сотрудника по отделу с минимальной зп
        System.out.println();
        EmployeeOptions.findWorkerWithMaxSalaryInDepartment(numberDepartment);//вызов метода, который находит сотрудника по отделу с максимальной зп
        System.out.println();
        double costAmountInDepartment = EmployeeOptions.calculateCostAmountInDepartment(numberDepartment);// метод, который считает сумму ЗП в отделе
        System.out.println("Сумма затрат на ЗП в месяц в " + numberDepartment + "-м отделе равна " + costAmountInDepartment + " рублей");
        System.out.println();
        double averageSalaryInDepartment = EmployeeOptions.calculateAverageSalaryInDepartment(numberDepartment);//вызов метода, который находит среднюю зп в отделе
        System.out.println("Средняя ЗП в " + numberDepartment + "-м отеле равна " + averageSalaryInDepartment + " рублей");
        System.out.println();
        EmployeeOptions.indexSalaryInDepartment(numberDepartment, percentIncreasingSalary); //вызов метода, который индексирует зп по отделу
        System.out.println();
    }
}