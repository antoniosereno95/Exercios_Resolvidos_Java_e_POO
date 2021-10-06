
package Exercicio_01_refazer;

public class Cadastro {
    int codigo_vendedor;
    double venda; //o probelma de nao poder colocar varias vendas por vendedor pode ser pq aqui tem uma varavel so e eu podia ter colocado uma array de valores.
    
    // os set
    public void setCodigo(int codigo){
        codigo_vendedor = codigo;
    }
    public void setVenda(double entrada_venda){
        venda = entrada_venda;
    }
    
    //os get
    public int getCodigo(){
        return codigo_vendedor;
    }
    public double getVenda(){
        return venda;
    }
    
    //contrutor
    public Cadastro(){
        codigo_vendedor = 0;
        venda = 0;
    }
    
}
