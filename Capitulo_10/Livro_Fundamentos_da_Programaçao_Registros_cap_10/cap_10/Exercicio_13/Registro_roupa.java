
package Exercicio_13;

public class Registro_roupa {
    
    int codigo_roupa;
    String descriçao_roupa;
    int codigo_estilista;
    int codigo_estaçao;
    int ano;
    
    //construtor
    public void Registro_roupa(){
        codigo_roupa = 0;
        descriçao_roupa = "";
        codigo_estilista = 0;
        codigo_estaçao = 0;
        ano = 0;
    }
    
    //os set
    public void setCodigo_roupa(int roupa){
        codigo_roupa = roupa;
    }
    public void setCodigo_estilista(int est){
        codigo_estilista = est;
    }
    public void setCodigo_estaçao(int es){
        codigo_estaçao = es;
    }
    public void setDescriçao_roupa(String des){
        descriçao_roupa = des;
    }
    public void setAno(int a){
        ano = a;
    }
    
    //os get
    public int getCodigo_roupa( ){
        return codigo_roupa ;
    }
    public int getCodigo_estilista( ){
        return codigo_estilista ;
    }
    public int getCodigo_estaçao( ){
        return codigo_estaçao ;
    }
    public String getDescriçao_roupa( ){
        return descriçao_roupa ;
    }
    public int getAno( ){
        return ano ;
    }
    
}
