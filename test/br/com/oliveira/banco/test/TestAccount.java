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
public class TestAccount {
    
    public static void main(String[] args) {
        Account ac = new CurrentAccaunt(1234, "Jonathan Oliveira", "83271856087", 200.0, 10000.0);
        
        ac.show();
        System.out.println("");
        
        System.out.println("op1. saque 100...");
//        if (ac.withdrawal(100.0)){
//            System.out.println("Saque concluido com sucesso! Seu saldo é: " + ac.getValue());
//        } else {
//            System.out.print("Saque infisponível, sem limite.");
//        }
        try {
            ac.withdrawal(100.0);
            System.out.println("Saque concluido com sucesso! Seu saldo é: " + ac.getValue());
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            //System.out.print("Saldo Insuficiente! Saque não concluido");  
            System.out.println(e.getMessage());
        }
        
        System.out.println("");
        System.out.println("op2. Deposito 100.0... ");
        //deposit
        ac.deposit(100.0);
        System.out.println("Deposito realizado! Seu saldo é: " + ac.getValue());
        
        //withdrawal
        System.out.println("");
        System.out.println("op3. Saque 300...");
//        if (!ac.withdrawal(300.0)){
//            System.out.print("Valor indisponível!!! Seu saldo é:"  + ac.getValue());  
//        }
        try {
            ac.withdrawal(300.0);
            System.out.println("Saque concluido com sucesso! Seu saldo é: " + ac.getValue());
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            //System.out.print("Saldo Insuficiente!");  
            System.out.print(e.getMessage());  
        }
        
        //new account
        Account ac2 = new CurrentAccaunt(1235, "Piter", "xxxxxxxxxxx", 100.0, 10000.0);System.out.println("");
        ac2.show();
        System.out.println("");
        //transfer
//        if (ac.transferTo(ac2, 300.0)) {
//            System.out.println("Transferencia realizada com sucesso!");
//        } else {
//            System.out.println("Transferencia de "+ 300+" não realizada, saldo insuficiente! Saldo: "+ ac2.getValue() );
//        }
        System.out.println("");
        System.out.println("op4. Transfere 300...");
        try {
            ac.transferTo(ac2, 300.0);
            System.out.println("transferencia realizada! Seu saldo é: " + ac.getValue());
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            //System.out.print("Saldo Insuficiente! Transferencia não realizada");  
            System.out.println(e.getMessage());
        }
        //show datas 
        System.out.println("");
        System.out.println("Conta : " + ac.getNum() + " - Saldo: "+ ac.getValue());
        System.out.println("");
        System.out.println("Conta : " + ac2.getNum() + " - Saldo: "+ ac2.getValue()); 
    }
    
}
