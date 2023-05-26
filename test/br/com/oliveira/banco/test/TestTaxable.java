/*
 */
package br.com.oliveira.banco.test;

import br.com.oliveira.banco.entities.CurrentAccaunt;
import br.com.oliveira.banco.system.Taxable;

/**
 *
 * @author jonathan_oliveira
 */
public class TestTaxable {
    
    public static void main(String[] args){
     
        CurrentAccaunt a1 = new CurrentAccaunt(1234, "Carlos Silva", "12345678987", 100, 0);
        //System.out.printf("O saldo é: %.2f", a1.getValue());
        
        System.out.printf("Calc Tributos: %.2f ", a1.calTax());
        System.out.println("");
        //Test Polymorphism
        Taxable t = a1;
        System.out.printf("Calc Tributos Polymorphism: %.2f" , t.calTax());
        System.out.println("");
        
        
        
        
    }
    
}
