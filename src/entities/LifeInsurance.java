/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author jonathan_oliveira
 */
public class LifeInsurance implements Taxable{

    @Override
    public double calTax() {
        return 42; 
    }
    
}
