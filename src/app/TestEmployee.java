/*
 */
package app;

import entities.Employee;

/**
 *
 * @author jonathan_oliveira
 */
public class TestEmployee {
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee(12, 05, 2023);
        e1.setName("Jonata");
        e1.setSalary(5000.0);
        e1.bonifies(50);
        e1.setIsInTheCompany(true);
        e1.show();
        
        System.out.println("");
        //dois funcionários com o new e compare-os com o ==. 
        Employee e2 = new Employee(25, 12, 2019);
        e2.setName("Rafael");
        e2.setSalary(10000.0);
        e2.setIsInTheCompany(true);
        
        //in this case the if teste if the object have same reference in the memory
        if(e1 == e2){
            System.out.println("São iguais, mesma área de memória");
        } else{
            System.out.println("São diferentes, posições diferentes na memória");
        }
        
        //in this case the if teste if the object have same date, number or name
        System.out.println("");
        if(e1.getName().equals(e2.getName())){
            System.out.println("São iguais, mesmo nome");
        } else{
            System.out.println("São diferentes, nomes são diferentes");
            
        }
        
        //whem e2 points to e1, the reference e1 is lost
        //both objects turn same address in the memory
        System.out.println("");
        e2 = e1;
        if (e1 == e2){
            System.out.println("Mesmos objetos na memória");
        } else{
            System.out.println("Objetos diferentes!");
        }
        
        System.out.println("");
        e1.show();
        System.out.println("");
        e2.show();
        
    }
    
}
