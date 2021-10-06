
package POO_cap_12.Exercicio_05;
import java.util.Scanner;
public class Main_05 {
    
    static Scanner input = new Scanner(System.in);
    //usa o static pra poder dizer que o Scanner ou qualuer 
    //outra variavel é global e nao-mutavel.
    
    //minhas variaveis globais::
    static Funcionario[] funcionarios;
    static Dependente[] dependentes;
    static final int indice_f = 10;
    static final int indice_d = 30;
    static int i_f=0,i_d=0;
    //atributos static sao atributos da classe, globais;
    public static void main(String args[]) {
        //tem que iniciar os objetos assim.
        funcionarios = new Funcionario[indice_f];
        dependentes = new Dependente[indice_d];
        
        //loop da rotina principal
        while(true){
            Menu();
            System.out.println("digite a opçao escolhida:");
            int op = input.nextInt();
            if(op == 1){
                CadastrarFuncionario();
            }else if(op == 2){
                BonusFuncionario();
            }else if(op == 3){
                ExcluirFuncionario();
            }else if(op == 4){
                AlterarSalarioFuncionario();
            }else if(op == 5){
                System.out.println("deseja mesmo encerrar o programa?(S/N)");
                char end = input.next().charAt(0);
                while(end!='S' && end!='N'){
                    System.out.println("entrada invalida, tente novamente"
                            + "(DICA: letra maiuscula!)");
                    end = input.next().charAt(0);
                }
                if(end == 'S'){
                    System.out.println("encerrando...");
                    break;
                }else if(end == 'N'){
                    System.out.println("voltando ao menu principal...\n");
                }
            }
        }//fim da rotina principal
        
    }
    public static void Menu(){
        System.out.println("##Menu##");
        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Mostrar bônus mensal de cada funcionário");
        System.out.println("3 - Excluir funcionário");
        System.out.println("4 - Alterar salário de um funcionário");
        System.out.println("5 - Sair.");
    }
    public static void CadastrarFuncionario(){
        System.out.println("--Cadastrar Funcionarios e Dependentes--");
        System.out.println("-->temos "+i_f+" funcionarios de 10(Max) cadastrados.");
        if(i_f >= indice_f){
            System.out.println("Limite de funcionarios atingido, tente excluir algum funcionario e volte depois.");
        }else{
            //Funcionario funcionario = new Funcionario(); //-- este instanciamento é redundante pois ja foi instanciada o vetor de objetos e ele é statico da classe, logo global.  
            System.out.println("ok, insira os dados que seram pedidos a seguir: ");
            System.out.println("nome:");
            String nome = input.next();
            System.out.println("cargo:");
            String cargo = input.next();
            System.out.println("salario:");
            double salario = input.nextDouble();
            System.out.println("codigo:");
            int codigo = input.nextInt();
            
            Funcionario func = new Funcionario();
            //inserçao de dados no objeto
            func.setNome(nome);
            func.setCargo(cargo);
            func.setSalario(salario);
            func.setCodigo(codigo);
            
            
            System.out.println("Agora vamos cadastrar os dependentes do nosso Funcionario:");
            System.out.println("quantos dependentes tem o funcionario "
                    +func.getNome()+" ?(digite o numero baixo)\n"
                    + "*Se o funcionario nao tiver dependentes, digite 0(zero).");
            int n_dependentes = input.nextInt();
            while(n_dependentes<0 || n_dependentes>=30){
                
            }
            if(n_dependentes != 0){
                func.setNumero_de_dependentes(n_dependentes);
                CadastraDependentes(func,n_dependentes);
            }else{
                System.out.println("funcionario sem dependentes, "
                        + "voltando ao menu principal.");
            }
            
            //so aqui que eu jogo o objeto na array, moraes estava errado,
            //mas de qualquer forma, facilida mastante emsmo essa forma de fazer a aquestao
            funcionarios[i_f] = func;
            i_f++;//importantisssimo.
        }
        
    }
    public static void CadastraDependentes(Funcionario func,int n_dependentes){
        System.out.println("-->temos "+i_d+" de 30(max) dependentes cadastrados no momento.");
        if(i_d >= indice_d){
            System.out.println("Limite de dependentes maximo atingido,"
                + " tente excluir algum funcionario e tente novamente depois.");
            
        }else if((i_d + n_dependentes) >= indice_d ){
            System.out.println("O Limite de dependentes no banco de dados "
                    + "vai ser atingido se adicionarmos os novos "+n_dependentes+" "
                    + "que voce quer adicionar, \nlogo nao os adicionaremos, "
                    + "tente excliur algum funcionario e tente novamente mais tarde.");
            
        }else{
            System.out.println("ok, agora vamos cadastrar os "
                +n_dependentes+" dependentes do funcionario "
                +func.getNome()+" :");
        
            for(int i = 0 ; i < n_dependentes ; i++){
                Dependente dep = new Dependente();
                System.out.println("dependente "+(i+1)+" de "+n_dependentes);
                //Dependente dep = new Dependente();//-- este instanciamento é redundante pois ja foi instanciada o vetor de objetos e ele é statico da classe, logo global.
                dep.setFuncionario(func);
                System.out.println("digite o nome do dependente(uma palavra):");
                String nome = input.next();
                dep.setNomeDoDependente(nome);
                
                //novamente, so aqui que eu insiro o obeto no vetor de objetos
                dependentes[i_d] = dep;
                i_d++;//importantissimo
            }
            
        }
        
    }
    public static void BonusFuncionario(){
        System.out.println("Listagem dos funcionarios com seus respectivos Bonus:");
        for(int i = 0 ; i < indice_f ; i++){
            
            if(funcionarios[i] != null ){
                
                if(funcionarios[i].getNumero_de_dependentes() == 0){
                    System.out.println("O funcionario "+funcionarios[i].getNome()+" nao tem direito a BONUS.");
                }else{
                    double bonus;
                    double sal = funcionarios[i].getSalario();
                    int n = funcionarios[i].getNumero_de_dependentes();
                    
                    bonus = (double)((sal*(2.0/100.0))*n);
                    
                    System.out.println("O funcionario "+funcionarios[i].getNome()+" tem "+funcionarios[i].getNumero_de_dependentes()+" dependentes e tem direito a "+bonus+" reais de bonus.");
                }
                
            }
            
        }
        
    }
    public static void ExcluirFuncionario(){
        System.out.println("Digite o codigo do funcionario a ser EXCLUIDO:");
        int cod = input.nextInt();
        
        for(int i = 0; i < indice_f ; i++){
            if(funcionarios[i]!=null){
                if(funcionarios[i].getCodigo() == cod){
                    //procuro os dependentes do objeto
                    for(int j = 0 ; j < indice_d ; j++){
                        if(dependentes[j]!= null){
                            if(dependentes[j].funcionario.getCodigo() == cod){
                                dependentes[j] = null;
                            }
                        }
                    }
                    //seta o funcionairio para as configuraçoes de fabrica,
                    //e deposi seta ele pra null(nao sei se isso funciona). 
                    funcionarios[i] = null;
                    System.out.println("Funcionario excluido com sucesso.");
                }
            }
        }
        
    }
    public static void AlterarSalarioFuncionario(){
        System.out.println("Digite o codigo do funcionario que tera seu SALARIO ALTERADO.:");
        int cod = input.nextInt();
        
        for(int i = 0; i < indice_f ; i++){
            if(funcionarios[i]!=null){
                if(funcionarios[i].getCodigo() == cod){
                    System.out.println("o funcionario tem um salario atual de "+funcionarios[i].getSalario());
                    System.out.println("digite o novo salario do funcionario:");
                    double sal = input.nextDouble();
                    while(sal <= 0){
                        if(sal == 0){
                            System.out.println("E é escravodao é?");
                            System.out.println("coloque outro salario ai meu rei:");
                            sal = input.nextDouble();
                        }else{
                            System.out.println("Agora pronto, vai pagar pra trabalhar é?");
                            System.out.println("coloque outro salario ai meu rei:");
                            sal = input.nextDouble();
                        }
                    }
                    funcionarios[i].setSalario(sal);
                    System.out.println("Salario alterado com sucesso.");
                }
            }
        }
        
    }
    
}
