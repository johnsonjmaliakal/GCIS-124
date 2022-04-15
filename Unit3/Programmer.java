
public class Programmer extends Employee {

    private String product;
    
    public Programmer(String name) {
        super(name);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Programmer [name=" + getName() + ", salary=" 
            + getSalary() + ", product=" + product + "]";
    }     
}

