/*
 */
package entities;

/**
 *
 * @author jonathan_oliveira
 */
public class InsufficientBalanceException extends Exception {
    
    //create my exception
    public InsufficientBalanceException(double val){
        super("Valor inválido: "+ val);
        
    }
    
}
