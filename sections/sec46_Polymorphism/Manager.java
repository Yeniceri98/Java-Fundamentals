package sections.sec46_Polymorphism;

public class Manager extends Employee {
    private int numOfEmployees;

    public Manager(String name, String department, int salary, int numOfEmployees) {
        super(name, department, salary);
        this.numOfEmployees = numOfEmployees;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public void showInfos() {
        super.showInfos();
        System.out.println("Number of employees responsible for: " + numOfEmployees);
    }
}
