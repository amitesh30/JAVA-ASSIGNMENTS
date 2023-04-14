
// Employee.java
public abstract class Employee {
    private String name;
    private String address;
    protected int grossWage;
    protected int totalWorkingDays;
    protected int paidWorkingDays;




    public Employee(String name, String address, int grossWage, int totalWorkingDays, int paidWorkingDays) {
        this.name = name;
        this.address = address;
        this.grossWage = grossWage;
        this.totalWorkingDays = totalWorkingDays;
        this.paidWorkingDays =  paidWorkingDays;

    }



    // Getters and Setters for name, address, and basicSalary
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrossWage() {
        return grossWage;
    }

    public void setGrossWage(int basicSalary) {
        this.grossWage = basicSalary;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getPaidWorkingDays() {
        return paidWorkingDays;
    }

    public void setPaidWorkingDays(int paidWorkingDays) {
        this.paidWorkingDays = paidWorkingDays;
    }

    public abstract double calculateMonthlySalary();

}



