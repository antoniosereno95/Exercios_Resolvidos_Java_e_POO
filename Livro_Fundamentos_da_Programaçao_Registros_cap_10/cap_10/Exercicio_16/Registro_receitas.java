
package Exercicio_16;

public class Registro_receitas {
    
    //Receita(codigo da receita, 
    //nome da receita, total de calorias a cada 100g, 
    //codigo_ cozinheiro)
    
    int codigo_receita;
    int codigo_cozinheiro;
    String nome_receita;
    double calorias_por_100g;
    
    public void Registro_receitas(){
        codigo_receita = 0;
        codigo_cozinheiro = 0;
        nome_receita = "";
        calorias_por_100g = 0;
    }
    
    //set
    public void setCodigo_receita(int cr){
        codigo_receita = cr;
    }
    public void setCodigo_cozinheiro(int cc){
        codigo_cozinheiro = cc;
    }
    public void setNome_receita(String nr){
        nome_receita = nr;
    }
    public void setCalorias_por_100g(double c_100){
        calorias_por_100g = c_100;
    }
    
    //get
    public int getCodigo_receita(){
        return codigo_receita;
    }
    public int getCodigo_cozinheiro(){
        return codigo_cozinheiro ;
    }
    public String getNome_receita(){
        return nome_receita ;
    }
    public double getCalorias_por_100g(){
        return calorias_por_100g ;
    }
    
}
