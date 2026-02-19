package id.ac.polban.employee.model;

public class EmploymentType {
    private String type;
    // static constant
    public static final EmploymentType FULL_TIME = new EmploymentType("FULL TIME");
    public static final EmploymentType PART_TIME = new EmploymentType("PART TIME");
    public static final EmploymentType CONTRACT = new EmploymentType("CONTRACT");
    
    public EmploymentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}

