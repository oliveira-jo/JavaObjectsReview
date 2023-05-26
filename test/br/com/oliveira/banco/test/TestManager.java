/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.oliveira.banco.test;

import br.com.oliveira.banco.entities.Manager;

/**
 *
 * @author jonathan_oliveira
 */
public class TestManager {
    public static void main(String[] args){
        
        //New Manager
        Manager manager = new Manager(12, 12, 2020);
        //method of employee
        manager.setName("Leandro Massoco");
        manager.setSalary(5000.0);
        manager.setIsInTheCompany(true);
        //method of manager
        manager.setPassword(1234);
        manager.setNumOfEmployees(50);
        //method of moth classes
        manager.show();
        
        //manager bonus Employee (salary * 0.10)
        //manager bonus Manager (salary * 0.20)
        System.out.println("Bonus: " +  manager.getBonus());
        
        
        
    }
}
