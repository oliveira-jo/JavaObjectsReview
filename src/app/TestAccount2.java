/*
 * Rewritten Methods, each with its rate 
 */
package app;

import entities.Account;
import entities.CurrentAccaunt;
import entities.SavingAccaunt;

/**
 *
 * @author jonathan_oliveira
 */
public class TestAccount2 {
    
    public static void main(String[] args) {
        
        //create accounts
        //use polymorphism
        //Account a = new Account();
        Account a2 = new CurrentAccaunt(123, "name1", "cpf1", 0, 0);
        Account a3 = new SavingAccaunt(124, "name2", "cpf2", 0, 0);
        
        //deposit same value
        //a.deposit(1000);
        a2.deposit(1000);
        a3.deposit(1000);
        
        //update accouts with the same rate
        //and each account have its way to calculet the rate
        //using a rewritten method 
        //a.update(0.1);
        a2.update(0.1);
        a3.update(0.1);
        
        //show
        //System.out.println(a.getValue());
        System.out.println(a2.getValue());
        System.out.println(a3.getValue());
        
    }
    
}
