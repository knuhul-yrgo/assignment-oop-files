package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private List<Role> roles = new ArrayList<>();

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        roles.add(initialRole);
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    @Override
    public String toString() {
        return String.format("%s at %s with roles %s", name, department, roles);

    }
}