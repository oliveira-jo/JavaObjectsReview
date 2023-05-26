/*
 */
package br.com.oliveira.banco.test;

/**
 *
 * @author jonathan_oliveira
 */
public class TestError {
    
    public static void main(String[] args){
        System.out.println("Início do main");
        try{
        method1();
        } catch (IndexOutOfBoundsException e){
            System.out.println("Erro"+e);
        }
        System.out.println("Fim do main");
        
    }
    
    public static void method1(){
        System.out.println("Inicio do método 1");
//        try{
        method2();
//        } catch(ArrayIndexOutOfBoundsException e ){
//            System.out.println("Erro"+e);
//        }
        System.out.println("Fim do método 1");
    }
    
    public static void method2(){
        System.out.println("Inicio do método 2");
        int[] array = new int[10];
//        try{
            for(int i = 0; i<=15; i++){
                array[i] = i;
                System.out.println(i);
            }   
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Erro: "+ e);
//        }
        System.out.println("Fim do método 2");
    }
}
