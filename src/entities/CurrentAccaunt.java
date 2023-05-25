/*
 */
package entities;

/**
 *
 * @author jonathan_oliveira
 */
public class CurrentAccaunt extends Account implements Taxable{

    public CurrentAccaunt(int num, String name, String cpf, double value, double limit) {
        super(num, name, cpf, value, limit);
    }
    
    @Override
    public void update(double tax){
        this.value += this.value * tax * 2;
    }
    
    //descount 0.10 of each deposit
    @Override
    public boolean deposit(double value){
        if (value >= 0){
            this.value += value - 0.10;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public double calTax() {
        return this.value * 0.1;
    }
    
}
