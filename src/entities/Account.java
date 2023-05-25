/*
 */
package entities;

/**
 *
 * @author jonathan_oliveira
 */
public abstract class Account {
    
    protected int num;
    protected double value;
    protected double limit;
    Client cli;
    
    
    public Account(int num, String name, String cpf, double value, double limit){
        this.num = num;
        this.value = value;
        this.limit = limit;
        cli = new Client();
        cli.setName(name);
        cli.setCpf(cpf);
        
    }
    
    public int getNum(){
        return this.num;
        
    }
    
    public Client getClient(){
        return this.cli;
    }
    
    //how money have in the account
    public double getValue(){
        return this.value;
    }
    
    //put money
    public boolean deposit(double value){
        if (value >= 0){
            this.value += value;
            return true;
        }else {
            return false;
        }
    }
    
    // get money
    public void withdrawal(double value) throws InsufficientBalanceException{
        if (this.value < value){
            //throw new IllegalArgumentException("Saldo insuficiente! Saque não realizado.");
            throw new InsufficientBalanceException(value);
        } else {
            this.value -= value;
        }
    }
    
    public void transferTo(Account acto, double value) throws InsufficientBalanceException{
//        if (this.withdrawal(value) == true){
//            acto.deposit(value);
//            return true;
//        } else{
//            return false;
//        }
        if (this.value < value){
            //throw new IllegalArgumentException("Saldo insuficiente! Transferência não realizada.");
            throw new InsufficientBalanceException(value);
        } else {
            acto.deposit(value);
        }
    }
    
    //update account
    public abstract void update(double tax);
//    {
//        this.value += this.value * tax;
//        
//    }
        //toString
    public void show(){
        System.out.println("");
        System.out.println("Conta Bancária: ");
        System.out.println("Numero: "+this.getNum());
        if(this.value >= 0){
            System.out.println("Saldo: "+ this.getValue());
        }
        if(this.cli.getName() != null){
            System.out.println("Nome Cliente: "+ cli.getName());
        }
        if(this.cli.getCpf() != null){
            System.out.println("CPF Cliente: "+ cli.getCpf());
        }   
    }
}
