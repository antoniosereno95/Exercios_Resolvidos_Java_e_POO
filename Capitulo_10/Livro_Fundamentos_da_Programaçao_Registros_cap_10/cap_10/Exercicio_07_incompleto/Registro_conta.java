
package Exercicio_07_incompleto;

public class Registro_conta {
    
    int N_conta;
    double valor_compra;
    int codigo_cliente;
    
    public void setN_conta(int n){
        N_conta = n;
    }
    public void setValor_compra(double valor){
        valor_compra = valor;
    }
    public void setCodigo_cliente(int codigo){
        codigo_cliente = codigo;
    }
    
    public int getN_conta(){
        return N_conta;
    }
    public int getCodigo_cliente(){
        return codigo_cliente;
    }
    public double getValor_compra(){
        return valor_compra;
    }
        
    public void Registro_conta(){
        N_conta =0;
        valor_compra=0;
        codigo_cliente=0;
    }
    
}
