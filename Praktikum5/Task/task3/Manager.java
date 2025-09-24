public class Manager extends Employee {
    private String department;

    public Manager(String n, double s, int d, int m, int y, String dept) {
        super(n, s, d, m, y);
        this.department = dept;
    }

    @Override
    public String toString() {
        return super.toString() + " Dept: " + department;
    }
}
