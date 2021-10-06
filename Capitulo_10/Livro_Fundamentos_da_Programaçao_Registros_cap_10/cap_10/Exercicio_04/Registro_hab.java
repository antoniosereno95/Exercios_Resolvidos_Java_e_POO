
package Exercicio_04;

public class Registro_hab {
    //variaveis
    int idade;
    char sexo;
    double renda_familiar;
    int numero_filhos;
    
    //variaveis staticas
    static double soma_renda;
    static int menor_idade = Integer.MAX_VALUE;
    static int maior_idade = Integer.MIN_VALUE;
    
    //os set
    public void setIdade(int id){
        idade = id;
        if(id < menor_idade){
            menor_idade = id;
        }
        if(id > maior_idade){
            maior_idade = id;
        }
    }
    public void setSexo(char s){
        sexo = s;
    }
    public void setRenda_familiar(double renda){
        renda_familiar = renda;
        soma_renda += renda;
    }
    public void setNumero_filhos(int fi){
        numero_filhos = fi;
    }
    
    //os get
    public int setIdade(){
        return idade ;
    }
    public char setSexo(){
        return sexo;
    }
    public double setRenda_familiar(){
        return renda_familiar;
    }
    public int setNumero_filhos(){
        return numero_filhos;
    }
    
    //construtor
    public Registro_hab(){
        idade = 0;
        sexo = 0;
        renda_familiar = 0;
        numero_filhos = 0;
    }
    
}
