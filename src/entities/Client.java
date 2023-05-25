/*
 */
package entities;

/**
 *
 * @author jonathan_oliveira
 */
public class Client {
    
    private String name;
    private String cpf;
    
    public Client(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
