/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.oliveira.banco.entities;

import br.com.oliveira.banco.system.Taxable;

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
