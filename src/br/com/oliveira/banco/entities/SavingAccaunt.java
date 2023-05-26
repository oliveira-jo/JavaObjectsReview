/*
 */
package br.com.oliveira.banco.entities;

/**
 *
 * @author jonathan_oliveira
 */
public class SavingAccaunt extends Account {

    public SavingAccaunt(int num, String name, String cpf, double value, double limit) {
        super(num, name, cpf, value, limit);
    }
    
    @Override
    public void update(double tax){
        this.value += this.value * tax * 3;
    }
}
