
package Exercicio_16;

public class Registro_ing_rec {
    
    int codigo_ingrediente;
    int codigo_receita;
    double quantidade;
    String unidade_de_medida;
    
    public void Registro_ing_rec(){
        codigo_ingrediente = 0;
        codigo_receita = 0;
        quantidade = 0;
        unidade_de_medida = "";
    }
    
    //set
    public void setCodigo_receita(int cr){
        codigo_receita = cr;
    }
    public void setCodigo_ingrediente(int co){
        codigo_ingrediente = co;
    }
    public void setQuantidade(double qt){
        quantidade = 0;
    }
    public void setUnidade_de_medida(String u){
        unidade_de_medida = u;
    }
    
    //get
    public int getCodigo_receita(){
        return codigo_receita;
    }
    public int getCodigo_ingrediente(){
        return codigo_ingrediente ;
    }
    public double getQuantidade(){
        return quantidade;
    }
    public String getUnidade_de_medida(){
        return unidade_de_medida;
    }
    
}
