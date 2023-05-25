/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entities.CurrentAccaunt;
import entities.LifeInsurance;
import entities.TaxGenerator;

/**
 *
 * @author jonathan_oliveira
 */
public class TestTaxGenerator {
    
    public static void main(String[] args){
        
        //calc all tax about products
        TaxGenerator tg = new TaxGenerator();
        
        //create a insurance and get tax about that
        LifeInsurance lf = new LifeInsurance();
        tg.addTax(lf);
        
        //create a current account and get the tax about the value that this account have
        CurrentAccaunt ac = new CurrentAccaunt(1234, "Jorge da Silva", "123456789", 1000, 0);
        tg.addTax(ac);
        
        // total of tax about the last products
        System.out.println("Total Tax: "+ tg.getTotal());
        
        
    }
    
}
