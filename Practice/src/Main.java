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
        Map<String, String> tempMap = new HashMap<>();

        tempMap.putAll(metadata);

        this.metadata = tempMap;

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
        System.out.print(e.getEId()+ "\t");
        System.out.print(e.getName()+ "\t");
        System.out.print(e.getDepartment()+ "\t");
        System.out.print(e.getSalary()+ "\t");
        System.out.println(e.getMetaData()+ "\t");
        System.out.println(e.getName().replace("s","a"));
        System.out.println(e.getName());

        Employee e1 = e;



    }
}