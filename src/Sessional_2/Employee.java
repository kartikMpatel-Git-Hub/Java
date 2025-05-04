package Sessional_2;

public class Employee {
    String name;
    float basicSalary;
    int noOfLeave;

    public Employee() {
    }

    public Employee(String name, float basicSalary, int noOfLeave) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.noOfLeave = noOfLeave;
    }

    public void calBudget(){
        System.out.println("Employee !.");
        System.out.println((30 - noOfLeave) * basicSalary);
    }
}

class TeamLead extends Employee{
    String projectName;
    int noOfEmployee;
    int noOfDays;
    int ratePerDay;

    public TeamLead(String projectName, int noOfEmployee, int noOfDays, int ratePerDay) {
        this.projectName = projectName;
        this.noOfEmployee = noOfEmployee;
        this.noOfDays = noOfDays;
        this.ratePerDay = ratePerDay;
    }

    public TeamLead(String name, float basicSalary, int noOfLeave, String projectName, int noOfEmployee, int noOfDays, int ratePerDay) {
        super(name, basicSalary, noOfLeave);
        this.projectName = projectName;
        this.noOfEmployee = noOfEmployee;
        this.noOfDays = noOfDays;
        this.ratePerDay = ratePerDay;
    }

    @Override
    public void calBudget() {
//        super.calBudget();
        System.out.println("Team Lead");
        System.out.println(noOfEmployee * noOfDays * ratePerDay);
    }
}
