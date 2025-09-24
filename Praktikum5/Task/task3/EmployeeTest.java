public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Kim ", 2000000, 6, 4, 1997);
        staff[1] = new Employee("Marion", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Dino", 3000000, 1, 11, 1993);
        staff[3] = new Manager("Niki", 4000000, 1, 9, 1990, "HR");

        System.out.println("=== Sebelum Sorting ===");
        for (Employee e : staff) {
            System.out.println(e);
        }

        Sortable.shell_sort(staff);

        System.out.println("\n=== Setelah Sorting (by salary) ===");
        for (Employee e : staff) {
            System.out.println(e);
        }

        // Test compare secara langsung
        System.out.println("\nCompare staff[0] dengan staff[1] = " + staff[0].compare(staff[1]));
    }
}
