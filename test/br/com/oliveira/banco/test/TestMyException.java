/*
 */
package br.com.oliveira.banco.test;

import br.com.oliveira.banco.entities.Account;
import br.com.oliveira.banco.entities.CurrentAccaunt;
import br.com.oliveira.banco.system.InsufficientBalanceException;

/**
 *
 * @author jonathan_oliveira
 */
public class TestMyException {
    public static void main(String[] args){
        Account ac = new CurrentAccaunt(1234, "Jose da Silva Oliveira", "12312312399", 200, 0);
        
        try {
            ac.withdrawal(500);
            System.out.println("Saque realizado! Seu saldo é de: "+ ac.getValue());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
