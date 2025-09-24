public class Employee extends Sortable {
    private String name;
    private double salary;
    private int day, month, year;

    public Employee(String n, double s, int d, int m, int y) {
        name = n;
        salary = s;
        day = d;
        month = m;
        year = y;
    }

    public double getSalary() { return salary; }
    public String getName() { return name; }

    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return +1;
        return 0;
    }

    @Override
    public String toString() {
        return name + " " + salary + " (" + day + "/" + month + "/" + year + ")";
    }
}
