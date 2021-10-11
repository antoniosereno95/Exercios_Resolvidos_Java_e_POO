package Aula_10_herança_parte1;

public class main {
    public static void main(String args[]) {
        
        Funcionario f1 = new Funcionario();
       
        f1.setNome("caio");
        f1.setIdade(30);
        f1.setSetor("limpeza");
        f1.setTrabalhando(true);
        f1.apresentaçao();
    }
}
