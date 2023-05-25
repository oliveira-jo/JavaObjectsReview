/*
 */
package entities;

/**
 *
 * @author jonathan_oliveira
 */
public class Company {
    private final Employee [] employeesOfCompany;
    private final int qtdEmployees;
    private String name;
    private String cnpj;
    private int position;
    
    public Company(String name, String cnpj, int qtdEmployees) {
        this.name = name;
        this.cnpj = cnpj;
        this.qtdEmployees = qtdEmployees;
        //new arry of var(?) employees
        employeesOfCompany = new Employee[qtdEmployees];
        position = 0;
        
    }
    
    public void addEmployee(Employee employee){
        
        //test if arry is full
        if (position != qtdEmployees){
            //if not add employee in array
            employeesOfCompany[position] = employee;
            position += 1;
        } else{
            System.out.println("As vagas na empreza já chegaram ao limite!");
        }
        
    }
    
    public void showEmploees(){
        for(Employee ep : employeesOfCompany){
            if (ep != null){
                ep.show();
                System.out.println("");
            }
        }
    }
    
    public void showEmploeeName(String name) {
        boolean aux = false;
        try{
            for(Employee ep : employeesOfCompany){

                if (ep.getName().equals(name)){
                    ep.show();
                    aux = true;
                } 
            }
        }catch(NullPointerException e){
            
        }
        if (aux == false){
            System.out.println("Colaborador não encontrado!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
