
package Exercicio_16;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
        int var_c = 3 , var_i = 15 , var_r = 20 , var_i_r = 3*var_r;
        //contruir os objetos
        Registro_cozinheiros Cozinheiro[];
        Cozinheiro = new Registro_cozinheiros[var_c];
        for(int i = 0 ; i < var_c ; i++){
            Cozinheiro[i] = new Registro_cozinheiros();
        }
        
        Registro_ingredientes Ingrediente[];
        Ingrediente = new Registro_ingredientes[var_i];
        for(int i = 0 ; i < var_i ; i++){
            Ingrediente[i] = new Registro_ingredientes();
        }
        
        Registro_receitas Receita[];
        Receita = new Registro_receitas[var_r];
        for(int i = 0 ; i < var_r ; i++){
           Receita[i] = new Registro_receitas();
        }
        
        Registro_ing_rec Ing_rec[];
        Ing_rec = new Registro_ing_rec[var_i_r];
        for(int i = 0 ; i < var_i_r ; i++ ){
            Ing_rec[i] = new Registro_ing_rec();
        }
        
        //rotina de cadastro
        System.out.println("vamos cadastrar os cozinheiros:");
        for(int i = 0 ; i < var_c ; i++){
            System.out.println("digite o codigo do cozinheiro "+(i+1)+" :");
            int c = input.nextInt();
            //ver se o codigo esta repetido
            boolean repetido = false;
            for(int f = 0 ; f < var_c ; f++){
                if(Cozinheiro[f].getCodigo_cozinheiro() == c){
                    repetido = true;
                }
            }
            if(repetido == true){
                while(repetido == true){
                    repetido = false;
                    System.out.println("codigo repetido, tente novamente.");
                    c = input.nextInt();
                    for(int f = 0 ; f < var_c ; f++){
                        if(Cozinheiro[f].getCodigo_cozinheiro() == c){
                        repetido = true;
                        }
                    }
                }
            }
            Cozinheiro[i].setCodigo_cozinheiro(c);
            
            System.out.println("digite o nome do cozinheiro "+(i+1)+" :");
            String n = input.next();
            Cozinheiro[i].setNome_cozinheiro(n);
        }
        System.out.println("cozinehiros cadastrados ocm sucessso!");
        System.out.println("\nagora vamos cadastrar os ingredientes:");
        for(int i = 0 ; i < var_i ; i++){
            System.out.println("digite o codigo do ingrediente "+(i+1)+" :");
            int c = input.nextInt();
            boolean repetido = false;
            for(int f = 0 ; f < var_i ; f++){
                if(Ingrediente[f].getCodigo_ingrediente() == c){
                    repetido = true;
                }
            }
            if(repetido == true){
                while(repetido == true){
                    repetido = false;
                    System.out.println("codigo repetido, tente novamente.");
                    c = input.nextInt();
                    for(int f = 0 ; f < var_i ; f++){
                        if(Ingrediente[f].getCodigo_ingrediente() == c){
                            repetido = true;
                        }
                    }
                }
            }
            Ingrediente[i].setCodigo_ingrediente(c);
            
            System.out.println("digite a descriçao do ingrediente "+(i+1)+" :");
            String d = input.nextLine();
            Ingrediente[i].setDescriçao(d);
        }
        System.out.println("os ingredientes foram cadastrados!");
        System.out.println("\nagora vamos cadastrar as receitas:");
        for(int i = 0 ; i < var_r ; i++){
            System.out.println("digite o codigo da receita "+(i+1)+" :");
            int cr = input.nextInt();
            boolean repetido = false;
            for(int f = 0 ; f < var_r ; f++){
                if(Receita[i].getCodigo_receita() == cr){
                    repetido = true;
                }
            }
            if(repetido == true){
                while(repetido == true){
                    repetido = false;
                    System.out.println("codigo repetido, tente novamente.");
                    cr = input.nextInt();
                    for(int f = 0 ; f < var_r ; f++){
                        if(Ingrediente[f].getCodigo_ingrediente() == cr){
                        repetido = true;
                        }
                    }
                }
            }
            Receita[i].setCodigo_receita(cr);
            
            System.out.println("digite o codigo do cozinehiro "+(i+1)+" :");
            int cc = input.nextInt();
            Receita[i].setCodigo_cozinheiro(cc);
            
            System.out.println("digite o nome da receita "+(i+1)+" :");
            String nr = input.nextLine();
            Receita[i].setNome_receita(nr);
            
            System.out.println("digite a quantida de calorias por 100g na receita "+(i+1)+" :");
            double q100 = input.nextDouble();
            Receita[i].setCalorias_por_100g(q100);
        }
        System.out.println("receitas cadastradas com sucesso!");
        System.out.println("agora vamos cadastrar a relaçao receita-ingrediente");
        for(int i = 0 ; i < var_i_r ; i++){
            System.out.println("digite o codigo do ingrediente para a relaçao ingrediente-receita "+(i+1)+" :");
            int ci = input.nextInt();
            boolean achou = false;
            for(int f = 0 ; f < var_i ; f++){
                if(Ingrediente[f].getCodigo_ingrediente() == ci){
                    achou = true;
                }
            }
            if(achou == false){
                while(achou == false){
                    System.out.println("codigo nao encontrado, tente novamente.");
                    ci = input.nextInt();
                    for(int f = 0 ; f < var_i ; f++){
                        if(Ingrediente[f].getCodigo_ingrediente() == ci){
                            achou = true;
                        }
                    }
                }
            }
            Ing_rec[i].setCodigo_ingrediente(ci);
            
            System.out.println("digite o codigo da receita para a relaçao ingrediente-receita "+(i+1)+" :");
            int cr = input.nextInt();
            boolean achou1 = false;
            for(int f = 0 ; f < var_i ; f++){
                if(Ing_rec[i].getCodigo_receita() == cr){
                    achou1 = true;
                }
            }
            if(achou1 == false){
                while(achou1 == false){
                    System.out.println("codigo nao encontrado, tente novamente.");
                    cr = input.nextInt();
                    for(int f = 0 ; f < var_i ; f++){
                        if(Ing_rec[i].getCodigo_receita() == cr){
                            achou1 = true;
                        }
                    }
                }
            }
            Ing_rec[i].setCodigo_receita(cr);
            
            System.out.println("digite a quantidade do ingrediente nesta relaçao ingrediente-receita "+(i+1)+" :");
            double qt = input.nextDouble();
            Ing_rec[i].setQuantidade(qt);
            
            System.out.println("digite a unidade de medida para a relaçao ingrediente-receita "+(i+1)+" :");
            String u = input.next();
            Ing_rec[i].setUnidade_de_medida(u);
        }
        System.out.println("cadastro das relaçoes receita-ingrediente realizadas com sucesso!");
        //fim da rotina de cadastro
        
        //rotina pos-cadastro
        int opcao = 0;
        while(opcao != 4){
            Menu();
            System.out.println("escolha sua opçao: ");
            opcao = input.nextInt();
            if(opcao == 1){
                System.out.println("digite o codigo do cozinheiro: ");
                int c = input.nextInt();
                //verifica se o codigo digitado existe
                boolean achou = false;
                for(int f = 0 ; f < var_c ; f++){
                    if(Cozinheiro[f].getCodigo_cozinheiro() == c){
                        achou = true;
                    }
                }
                if(achou == false){
                    while(achou == false){
                        System.out.println("codigo nao encontrado, tente novamente.");
                        c = input.nextInt();
                        for(int f = 0 ; f < var_i ; f++){
                            if(Cozinheiro[f].getCodigo_cozinheiro() == c){
                                achou = true;
                            }
                        }
                    }
                }
                //o codigo existindo...mostrar todas as receitas dele
                int g = 0;
                for(int i = 0 ; i < var_r ; i++){
                    if(Receita[i].getCodigo_cozinheiro() == c){
                        g++;
                        System.out.println("a receita "+g+" do cozinheiro:");
                        System.out.println("nome da receita: "+Receita[i].getNome_receita());
                        System.out.println("codigo da receita: "+Receita[i].getCodigo_receita());
                        System.out.println("calorias por cada 100g: "+Receita[i].getCalorias_por_100g());
                        System.out.println("essa receita utiliza os ingredientes que seram listados a seguir: ");
                        for(int f = 0 ; f < var_i_r ; f++){
                            if( Ing_rec[f].getCodigo_receita() == Receita[i].getCodigo_receita() ){
                                System.out.println("codigo do ingrediente: "+Ing_rec[f].getCodigo_ingrediente());
                                for(int h = 0 ; h < var_i ; h++){
                                    if(Ingrediente[h].getCodigo_ingrediente() == Ing_rec[f].getCodigo_ingrediente() ){
                                        System.out.println("descriçao do ingrediente: "+Ingrediente[h].getDescriçao());
                                    }
                                }
                                System.out.println("quantidade do ingrediente: "+Ing_rec[f].getQuantidade());
                                System.out.println("unidade da medida do ingreditente: "+Ing_rec[f].getUnidade_de_medida());
                            }
                        }
                    }
                }
                System.out.println("Listagem completa.");
            }else if(opcao == 2){
                System.out.println("vamos pegar os dois limites do intervalo [interalo_menor,intervalo_maior]");
                System.out.println("digite o valor do intervalo_menor:");
                double intervalo_menor = input.nextDouble();
                while(intervalo_menor < 0){
                    System.out.println("o intervalo deve ter intervalos maiores que zero, tente novamente.");
                    intervalo_menor = input.nextDouble();
                }
                System.out.println("digite o valor do intervalo_maior:");
                double intervalo_maior = input.nextDouble();
                while(intervalo_menor > intervalo_maior){
                    System.out.println("o intervalo maior deve ter valor maior que o valor do intervalo menor, tente novamente.");
                    intervalo_maior = input.nextDouble();
                }
                
                double kcal;
                int o = 0;
                System.out.println("Listagem das receitas dentro do intervalo ["+intervalo_menor+","+intervalo_maior+"] de calorias:");
                for(int i = 0 ; i < var_r ; i++){
                    kcal = Receita[i].getCalorias_por_100g();
                    if( kcal>intervalo_menor && kcal<intervalo_maior ){
                        o++;
                        System.out.println("A "+o+" receita que esta dentro do intervalo de calorias: ");
                        System.out.println("codigo da receita: "+Receita[i].getCodigo_receita());
                        System.out.println("nome da receita: "+Receita[i].getNome_receita());
                        System.out.println("codigo do cozinheiro: "+Receita[i].getCodigo_cozinheiro());
                        for(int k = 0 ; k < var_c ; k++){
                            if(Cozinheiro[k].getCodigo_cozinheiro() == Receita[i].getCodigo_cozinheiro()){
                                System.out.println("nome do cozinehiro: "+Cozinheiro[k].getNome_cozinheiro());
                            }
                        }
                    }
                }
            }else if(opcao == 3){
                int receitas = 0;
                int cod;
                for(int i = 0 ; i < var_c ; i++){
                    cod = Cozinheiro[i].getCodigo_cozinheiro();
                    for(int k = 0 ; k < var_r ; k++){
                        if( Receita[k].getCodigo_cozinheiro() == cod ){
                            receitas = receitas + 1;
                        }
                    }
                    System.out.println("O cozinheiro "+Cozinheiro[i].getNome_cozinheiro()+" de codigo "+Cozinheiro[i].getCodigo_cozinheiro()+" tem "+receitas+" receitas cadastradas.");
                    receitas = 0;
                }
            }else if(opcao == 4){
                System.out.println("Encerrando o programa, ate mais.");
            }
            
        }
        //fim da rotina de listagens
    }
    public static void Menu(){
        System.out.println("---OPÇÕES---");
        System.out.println("1. Mostre todas as receitas de determinado cozinheiro");
        System.out.println("2. Mostre todas as receitas cujo total de calorias esteja dentro de um intervalo especificado");
        System.out.println("3. Mostre o total de receitas elaboradas por cada um dos cozinheiros.");
        System.out.println("4. Sair.");
    }
}
