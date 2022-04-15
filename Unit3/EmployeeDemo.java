
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Asma");
        e.setSalary(100);
        System.out.println(e);

        Programmer p = new Programmer("Rawan");
        p.setSalary(200);
        p.setProduct("HR system");
        System.out.println(p);

        SiteEngineer s = new SiteEngineer("Amal");
        s.setSalary(200);
        s.setSiteLocation("Dubai");
        System.out.println(s);
    }
}

