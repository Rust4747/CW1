public class Main {

    private static final Employee[] employees = new Employee[5];

    public static void main(String[] args) {
        employees[0] = new Employee("Петров В.А.",2700);
        employees[1] = new Employee("Семенов К.Л.", 3500);
        employees[2] = new Employee("Иванова С.В.",3050);
        employees[3] = new Employee("Морозова Г.И.",3675);
        employees[4] = new Employee("Розаев Я.В.",3810);
        System.out.println("Сумма зарплат: " + calculateSumSalary());
        System.out.println("Сотрудник с максимальной зарплатой: "+getEmployeeWithMaxSalary());
        System.out.println("Сотрудник с низкой зарплатой: "+getEmployeeWithMinSalary());
        System.out.println("средняя зарплата " + calculateSumSalary()/employees.length+ " рублей");
        for (int i=0; i<employees.length; i++) {
            System.out.println(employees[i]);
        }


    }
    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }


    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee !=null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }

        }
        return targetEmployee;
    }
    public static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() <min) {
                min = employee.getSalary();
                targetEmployee=employee;
            }
        }
        return targetEmployee;
    }

}