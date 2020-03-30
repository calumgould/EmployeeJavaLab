package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNINumber(){
        return this.NINumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double amount){
        this.salary += amount;
    }

    public double calculatePayBonus(){
        return this.salary * 0.01;
    }

}
