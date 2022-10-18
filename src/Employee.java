public class Employee {
    private int salary;
    private final String fcs;

    private final int id;

    private static int counter = 0;


    public Employee (String fcs, int salary) {
        this.fcs = fcs;
        this.salary = salary;
        this.id = counter++;

    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFcs() {
        return this.fcs;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return " " +
                " " + salary +
                " " + fcs + '\'' +
                " " + id;
    }
}
