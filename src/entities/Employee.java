/*
 */
package entities;

/**
 *
 * @author jonathan_oliveira
 */
public class Employee {
    
    private String name;
    private String department;
    private double salary;
    private String rg;
    private boolean isInTheCompany;
    private MyDate entryDate;
    
    public Employee(int day, int month, int year) {
        this.entryDate = new MyDate(day, month, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(MyDate entryDate) {
        this.entryDate = entryDate;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isIsInTheCompany() {
        return isInTheCompany;
    }

    public void setIsInTheCompany(boolean isInTheCompany) {
        this.isInTheCompany = isInTheCompany;
    }
    
    public void bonifies(double increase) {
        this.salary += increase;
    }
    
    public void dismiss() {
        this.isInTheCompany = false;
    }
    
    public double annualGain() {
        return this.salary * 12;
    }
    
    //bonus
    public double getBonus(){
        return this.salary * 0.10;
    }
     
    //toString
    public void show() {
        
        if(this.name != null) {
            System.out.println("Nome: "+getName());
        }
        if(this.department != null) {
            System.out.println("Departamento: "+getDepartment());
        }
        if(this.salary >= 0) {
            System.out.println("Salário: "+getSalary());
        }
        if(this.rg != null) {
            System.out.println("RG: "+ getRg());
        }
        if(this.entryDate != null) {
            System.out.println("Data de entrada:  "+ 
                    this.entryDate.getDay()+ "/"+
                    this.entryDate.getMonth()+ "/"+
                    this.entryDate.getYear());
        }
        System.out.println("Esta na Empresa: " + this.isInTheCompany);   
    }
    
}
