
public class Employee {
    private final String name;
    private double salary;
    
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj==null || !(obj instanceof Employee))
            return false;
        Employee other = (Employee) obj;
        if(this.name.equals(other.name))
            return true;
        return false;
    }
}




