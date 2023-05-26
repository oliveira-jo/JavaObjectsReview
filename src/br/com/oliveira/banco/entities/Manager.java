/*
 */
package br.com.oliveira.banco.entities;

/**
 *
 * @author jonathan_oliveira
 */
public class Manager extends Employee {
    
    private int password;
    private int numOfEmployees;
    
    public Manager(int day, int month, int year) {
        super(day, month, year);
    }
    
    public void setPassword(int pass){
        this.password = pass;
    }
    
    public int getPassword(){
        return this.password;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }
    
    //bonus
    @Override
    public double getBonus(){
        return this.getSalary() * 0.20;
    }
    
    @Override
    public void show(){
        super.show();
        System.out.println("Senha: " + this.password);
        System.out.println("Número de gerenciaveis: " + this.numOfEmployees);
    }
    
}
