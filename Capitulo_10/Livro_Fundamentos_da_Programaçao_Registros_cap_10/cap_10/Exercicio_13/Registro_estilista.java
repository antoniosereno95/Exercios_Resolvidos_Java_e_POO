
package Exercicio_13;

public class Registro_estilista {
    
    int codigo_estilista;
    String nome_estilista;
    double salario;
    
    //construtor
    public void Registro_estilista(){
        codigo_estilista = 0;
        nome_estilista = "";
        salario = 0;
    }
    
    //os set
    public void setCodigo_estilista(int cod){
        codigo_estilista = cod;
    }
    public void setNome_estilista(String nome){
        nome_estilista = nome;
    }
    public void setSalario(double sal){
        salario = sal;
    }
    
    //os get
    public int getCodigo_estilista( ){
        return codigo_estilista ;
    }
    public String getNome_estilista( ){
        return nome_estilista ;
    }
    public double getSalario( ){
        return salario ;
    }
    
}
