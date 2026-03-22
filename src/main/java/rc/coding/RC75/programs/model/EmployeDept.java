package rc.coding.RC75.programs.model;

public class EmployeDept extends Employee{

    private String department;

    public EmployeDept(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
