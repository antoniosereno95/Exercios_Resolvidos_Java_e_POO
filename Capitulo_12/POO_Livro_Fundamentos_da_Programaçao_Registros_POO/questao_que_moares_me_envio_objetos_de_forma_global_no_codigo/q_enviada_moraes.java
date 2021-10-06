
package questao_que_moares_me_envio_objetos_de_forma_global_no_codigo;

import java.util.Scanner;

public class q_enviada_moraes {
static Scanner ler = new Scanner(System.in);
   static Estacionamento[] estacionamento;
   static int posicaoNoArray = 0;
   static boolean arrayCheio = false;
       
   public static void main(String[] args) {
       estacionamento = new Estacionamento[5];
       int opcao = 0;
       
        while(true){
            System.out.println("--- Cadastro de estacionamento ---");
            System.out.println("--- Digite [1] para cadastrar um novo estacionamento ---");
            System.out.println("--- Digite [2] para consultar um estacionamento ---");
            System.out.println("--- Digite [3] para ativar ou desativar um estacionamento");
            System.out.println("--- Digite [0] para finalizar ---");
            System.out.println("Opção: ");
            opcao = ler.nextInt();    
       
            switch(opcao){
                case 1: 
                    cadastrarEstacionamento();
                    break;
                case 2:    
                    consultarEstacionamento();
                    break;
                case 3:
                    alterarStatus();
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    return;
                default:
                    System.out.println("Opção incorreta!");  
                    break;
            }
            
        }
   }
   
    public static void cadastrarEstacionamento(){
        int codigo = 0;
        if(arrayCheio == true){
            System.out.println("--- Array lotado! ---");
            System.out.println("--- Finalize o cadastro! ---");
            return;
        }
        
        while(arrayCheio == false){
            if(posicaoNoArray == 4 && arrayCheio == false){
                System.out.println("--- Só há espaço para mais este cadastro! ---");
            }
            
            System.out.println("--- Cadastro de estacionamento ---");
            System.out.println("--- Para sair, digite 0 ---");
            System.out.println("Código: ");
            codigo = ler.nextInt();
            if(codigo == 0){
                System.out.println("--- Cadastro encerrado ---");
                return;
            }
            
            if(pesquisarEstacionamento(codigo) != -1){
                System.out.println("Este código já pertence a um estacionamento existente");
                continue;
            }
            
            System.out.println("Nome: ");
            String nome = ler.nextLine();
            ler.nextLine();
            System.out.println("Cidade: ");
            String cidade = ler.nextLine();
            System.out.println("Quantidade de Vagas: ");
            int vagas = ler.nextInt();
            System.out.println("Quantidade de horas permitidas na franquia inicial: ");
            int qtdHorasInicial = ler.nextInt();
            System.out.println("Valor da franquia inicial: ");
            float franquiaInicial = ler.nextFloat();
            System.out.println("Valor adicional por hora excedente: ");
            float horaExcedente = ler.nextFloat();
       
            estacionamento[posicaoNoArray] =  new Estacionamento(codigo, nome, cidade, 
                                                            vagas, qtdHorasInicial,
                                                            franquiaInicial, horaExcedente);
            System.out.println("\nEstacionamento cadastrado!");
            
            if(posicaoNoArray == 4){
                System.out.println("--- Array cheio! ---");
                System.out.println("--- Finalize o cadastro ---");
                arrayCheio = true;
                return;
            }
            else if(posicaoNoArray < 5){
                posicaoNoArray++;
            }
        }   
   }
    
    
    public static void consultarEstacionamento(){
        System.out.println("--- Consulta de estacionamento ---");
        if(estacionamento[0] == null){
            System.out.println("--- O Array não foi criado ---\n");
            return;
        }
        
        while(true){
            System.out.println("Aperte 0 para sair");
            System.out.println("Digite o código do estacionamento que quer consultar: ");
            int idEstacionamento = ler.nextInt();
            if(idEstacionamento == 0){
                System.out.println("Consulta encerrada");
                return;
            }
            int posicaoEncontrada = pesquisarEstacionamento(idEstacionamento);
            if (posicaoEncontrada == -1){
                System.out.println("--- Estacionamento não encontrado ---");
                continue;
            }
            System.out.println(estacionamento[posicaoEncontrada]);
            System.out.println("--- Estacionamento consultado ---");
        }
    }
    
    public static int pesquisarEstacionamento(int idEstacionamento){
        int posicao = -1;
        for(int i = 0; i < estacionamento.length; i++){
            if(estacionamento[i] != null && estacionamento[i].getCodigo() == idEstacionamento){
                posicao = i;
                break;
            }
        }
        return posicao;
    }
    
    public static void alterarStatus(){
        if(estacionamento[0] == null){
            System.out.println("Não há estacionamento cadastrado\n");
        }
        else{
            System.out.println("Digite o código do estacionamento para alterar: ");
            int estacionamentoParaAlterar = ler.nextInt();
            int posicaoParaAlterar = estacionamentoParaAlterar - 1;
       
            if(estacionamento[posicaoParaAlterar].getSituacao().equals("Desativado")){
                estacionamento[posicaoParaAlterar].ativar();
                System.out.println("Estacionamento ativado");
            }
            else{
                estacionamento[posicaoParaAlterar].desativar();
                System.out.println("Estacionamento desativado");
            }
        }
    }
}

