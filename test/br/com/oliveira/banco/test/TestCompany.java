/*
 */
package br.com.oliveira.banco.test;

import br.com.oliveira.banco.entities.Company;
import br.com.oliveira.banco.entities.Employee;

/**
 *
 * @author jonathan_oliveira
 */
public class TestCompany {
    public static void main(String[] args){
        //create 5 employees
        Employee a1 = new Employee(12, 5, 23);
        a1.setName("a1");
        a1.setSalary(5000.0);
        a1.setIsInTheCompany(true);
        
        Employee a2 = new Employee(13, 6, 23);
        a2.setName("a2");
        a2.setSalary(5000.0);
        a2.setIsInTheCompany(true);
        
        Employee a3 = new Employee(13, 7, 23);
        a3.setName("a3");
        a3.setSalary(5000.0);
        a3.setIsInTheCompany(true);
        
        Employee a4 = new Employee(15, 10, 23);
        a4.setName("a4");
        a4.setSalary(5000.0);
        a4.setIsInTheCompany(true);
        
        Employee a5 = new Employee(16, 12, 23);
        a5.setName("a5");
        a5.setSalary(5000.0);
        a5.setIsInTheCompany(true);
        
        //create Complany and add employees in the array 
        Company cp = new Company("JO ltda", "1234560001/10", 100);
        cp.addEmployee(a1);
        cp.addEmployee(a2);
        cp.addEmployee(a3);
        cp.addEmployee(a4);
        cp.addEmployee(a5);
        
        //print company dates
        System.out.println("Empresa: " + cp.getName());
        System.out.println("CNPJ: " + cp.getCnpj());
        System.out.println("");
        
        //print collaborators
        //System.out.println("Colaboradores: ");
        //cp.showEmploees();
        
        //print collaborator for name
        cp.showEmploeeName("a10");
    }
    
}
