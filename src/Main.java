public class Main {
    public static void main(String[] args) {

        System.out.println("                Курсовая работа Амерханова Ильдара.");
        Employee[] bookWorkers = new Employee[10]; //хранилище для записей о сотрудниках
        bookWorkers[0] = new Employee("Андреев", "Матвей", "Адамович", 1, 50_435);
        bookWorkers[1] = new Employee("Жукова", "Есения", "Ильинична", 1, 43_565);
        bookWorkers[2] = new Employee("Федорова", "Вероника", "Михайловна", 2, 45_635);
        bookWorkers[3] = new Employee("Щербаков", "Михаил", "Владимирович", 3, 50_800);
        bookWorkers[4] = new Employee("Волков", "Артём", "Алексеевич", 4, 65_000);
        bookWorkers[5] = new Employee("Осипова", "Анастасия", "Дмитриевна", 2, 51_990);
        bookWorkers[6] = new Employee("Воробьёва", "Малика", "Валерьевна", 5, 45_190);
        bookWorkers[7] = new Employee("Кулешов", "Роман", "Эминович", 4, 55_490);
        bookWorkers[8] = new Employee("Королёв", "Илья", "Львович", 3, 53_090);
        bookWorkers[9] = new Employee("Морозова", "Александра", "Марковна", 5, 65_290);
        EmployeeOptions.printAllEmployees(bookWorkers);// вызов метода, который выводит в консоль список
        System.out.println();                          // всех сотрудников со всеми имеющимися по ним данными
        double costAmount = EmployeeOptions.calculateCostAmount(bookWorkers); //метод, считающий сумму затрат на ЗП
        System.out.println("Сумма затрат на ЗП в месяц = " + costAmount + " рублей");
        System.out.println();
        EmployeeOptions.findWorkerMinSalary(bookWorkers); //вызов метода, который находит сотрудника с минимальной ЗП
        System.out.println();
        EmployeeOptions.findWorkerMaxSalary(bookWorkers); //вызов метода, который находит сотрудника с максимальной ЗП
        System.out.println();
        double averageSalary = EmployeeOptions.calculateAverageSalary(bookWorkers);//метод, который считает среднюю ЗП
        System.out.println("Средний размер ЗП = " + averageSalary + " рублей");
        System.out.println();
        EmployeeOptions.printFullNamesWorkers(bookWorkers);//метод, который выводит в консоль ФИО всех сотрудников

    }
}