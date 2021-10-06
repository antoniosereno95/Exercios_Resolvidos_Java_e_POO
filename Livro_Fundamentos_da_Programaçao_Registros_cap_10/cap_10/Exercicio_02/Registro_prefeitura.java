
package Exercicio_02;

public class Registro_prefeitura {
    
    double salario;
    int idade;
    int numero_de_filhos;
    
    //variaveis staticas
    static double soma_sal = 0;
    static int soma_filho = 0;
    static double maior_sal = 0;
    static double sal_1000 = 0;
    
    //set
    public void setSalario(double cash){
        salario = cash;
        soma_sal += salario;
        if(salario > maior_sal){
            maior_sal = salario;
        }
        if(cash > 1000){
            sal_1000++;
        }
    }
    public void setIdade(int anos){
        idade = anos;
    }
    public void setNumero_de_Filhos(int filhos){
        numero_de_filhos = filhos;
        soma_filho += numero_de_filhos;
    }
    
    //get
    public double getSalario(){
        return salario;
    }
    public int getIdade(){
        return idade;
    }
    public int getNumero_de_filhos(){
        return numero_de_filhos;
    }
    
    //construtor
    public Registro_prefeitura(){
        salario = 0;
        idade = 0;
        numero_de_filhos = 0;
    }
        
}
