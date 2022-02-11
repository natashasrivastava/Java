import sun.security.krb5.JavaxSecurityAuthKerberosAccess;

import java.util.*;

final class Employee {
    private final int EId;
    private final String name;
    private final Double Salary;
    private final String Department;
    private final Map<String, String> metadata;

    public Employee(int eId, String name, Double salary, String department, Map<String, String> metadata) {
        this.EId = eId;
        this.name = name;
        this.Salary = salary;
        this.Department = department;
        this.metadata = metadata;
    }

    public int getEId() {
        return this.EId;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return Salary;
    }

    public String getDepartment() {
        return Department;
    }

    public Map<String, String> getMetaData()
    {
        return Collections.unmodifiableMap(this.metadata);

    }


}

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        Employee e = new Employee(1, "Natasha", 50000.0, "IQ", map);
        System.out.println(e.getEId());
        System.out.println(e.getName());
        System.out.println(e.getDepartment());
        System.out.println(e.getSalary());
        System.out.println(e.getMetaData());
        System.out.println(e.getName().replace("s","a"));
        System.out.println(e.getName());

    }
}