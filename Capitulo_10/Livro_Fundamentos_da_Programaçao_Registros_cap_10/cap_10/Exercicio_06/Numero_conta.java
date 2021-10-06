
package Exercicio_06;

public class Numero_conta {
    
    double saldo;
    int numero_do_cliente;
    
    public Numero_conta(){
        saldo = 0;
        numero_do_cliente = 0;
    }
    
    //set
    public void setNumero_do_cliente(int numb){
        numero_do_cliente = numb;
    }
    public void setSaldo(double sal){
        saldo = sal;
    }
    
    //get
    public int getNumero_do_cliente(){
        return numero_do_cliente;
    }
    public double getSaldo(){
        return saldo;
    }
    
}
