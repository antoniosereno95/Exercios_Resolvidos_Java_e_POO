
package Exercicio_05;

public class Registro_de_estoque {
    
    int codigo;
    String descriçao;
    double valor_unitario;
    int quantidade_estoque;
    
    //construtor
    public Registro_de_estoque(){
        descriçao = "";
        valor_unitario = 0;
        quantidade_estoque = 0;
    }
    
    //os set
    public void setDescriçao(String des){
        descriçao = des;
    }
    public void setValor_unitario(double valor){
        valor_unitario = valor;
    }
    public void setQuantidade_estoque(int q){
        quantidade_estoque = q;
    }
    public void setCodigo(int cod){
        codigo = cod;
    }
    
    //os get
    public String getDescriçao(){
        return descriçao;
    }
    public double getValor_unitario(){
        return valor_unitario;
    }
    public int getQuantidade_estoque(){
        return quantidade_estoque;
    }
    public int getCodigo(){
        return codigo;
    }
       
}
