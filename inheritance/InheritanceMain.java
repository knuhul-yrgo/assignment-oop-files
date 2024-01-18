package inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Role managerRole = new Role("Manager");
        Role engineerRole = new Role("Engineer");
        Employee employee = new Employee("Stefan", "Sales", managerRole);
        Employee anotherEmployee = new Employee("Britta", "Sales", engineerRole);
        anotherEmployee.addRole(managerRole);

        System.out.println("Employee 1: " + employee.toString());
        System.out.println("Employee 2: " + anotherEmployee.toString());
    }
}
