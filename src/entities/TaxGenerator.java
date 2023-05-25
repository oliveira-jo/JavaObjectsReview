/*
 * generate impost with all tax about products that need to calculet
 */
package entities;

/**
 *
 * @author jonathan_oliveira
 */
public class TaxGenerator {
    
    double total;
    
    public void addTax(Taxable t){
        System.out.println("Adicionado tributável: "+ t);
        this.total += t.calTax();
        
    }
    
    public double getTotal(){
        return this.total;
    }
}
