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

    public void setName(String newName){
        if ( newName == null ){
            return;
        }
        this.name = newName;
    }
    
    public String getNINumber(){
        return this.NINumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double amount){
        if (amount < 0){
            return;
        }
        this.salary += amount;
    }

    public double calculatePayBonus(){
        return this.salary * 0.01;
    }

}
