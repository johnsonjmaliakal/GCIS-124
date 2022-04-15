
public class SiteEngineer extends Employee {
    
    private String siteLocation;
    
    public SiteEngineer(String name) {
        super(name);
    }

    public String getSiteLocation() {
        return siteLocation;
    }

    public void setSiteLocation(String siteLocation) {
        this.siteLocation = siteLocation;
    }

    @Override
    public String toString() {
        return "SiteEngineer [name=" + getName() + ", salary=" 
            + getSalary() + ", siteLocation=" + siteLocation + "]";
    } 
}

