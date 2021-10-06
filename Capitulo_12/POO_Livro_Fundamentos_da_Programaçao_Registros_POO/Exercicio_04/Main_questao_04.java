
package POO_cap_12.Exercicio_04;
import java.util.Scanner;
public class Main_questao_04 {
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       
       //criar meus objetos
       Disciplina  disciplinas[];
       disciplinas = new Disciplina[Constantes.constD]; // MAX 5 disciplinas
       
       DisciplinaPratica  disciplinas_praticas[];
       disciplinas_praticas = new DisciplinaPratica[Constantes.constD]; // MAX 5 disciplinas
       
       Aluno[] alunos; // eu so precisei criar a matriz vetor de objetos para carra 
       //tipo de objeto pois os meus objetos estao sendo inicializados/instanciados 
       //nos seus determianaods metodos e depois retornados e colocalos na matriz que criei.
       alunos = new Aluno[Constantes.constA]; // max 10
       
       Matricula[] matriculas;
       matriculas = new Matricula[Constantes.constM]; // max 30
       
       //todos os objetos foram criados
       
       //talvez funcione fazer assim:
       /*
       em todo metodos eu crio um objeto diferente 
       e mando o metodo retornar retornar um objeto
       do tipo desejado, e ai pego esse retorno e 
       jogo na matriz-vetor de objetos;
       tipo como endrigo vez em sala de aula, mas o 
       vetor de objetos.
       
       **e nos metodos em que precisam buscar informaçoes
       de algum objeto qualquer eu posso mandar o vetor 
       de objetos como parametro para o metodo em questao.
       
       ***essa ideia funciona, endrigo usou na aula de 20/09
       
       ****no caso esse conceito de passar objetos e vetores
       de objetos como referencia e parametros é normal e deve
       ser utilizado sempre pra ajudar a modularizar o codigo
       
       *****da pra criar uma classe e colocar constantes nela
       usando o tipo static antes do tipo da variavel e ai o 
       codigo fica mais bonito e organizado e mais facil de mudar
       as constantes no meio do codigo, principalmente para que 
       se possa debugar e testar o codigo.
       */
       
       //rotina principal
        while(true){//rotina principal do main
            int op = 0;
            Menu();
            System.out.println("digite o numero da opçao escolhida:");
            op = input.nextInt();
           
            if(op == 1){
                //cadasttro das disciplinas
                int dis_normal= 0 , dis_pratica= 0;
                int conta_disciplina = dis_normal + dis_pratica;
                System.out.println("**no momento temos "+conta_disciplina+" de 5(maximo) disciplinas cadastradas");
                if( conta_disciplina >= 5){
                    System.out.println("-->limite de disciplinas cadastradas atingido.");
                }else{
                    System.out.println("Ok, a disciplina que voce ira cadastrar é:\n1-disciplina padrao./2-disciplina pratica.");
                    int opp = input.nextInt();
                    while(opp != 1 && opp != 2){
                        System.out.println("entrada invalida, tente novamenet.");
                        opp = input.nextInt();
                    }
                    if(opp == 1){
                        disciplinas[dis_normal] = CadastraDisciplinaPadrao(); 
                        dis_normal++;
                    }else if(opp == 2){
                        disciplinas_praticas[dis_pratica] = CadastraDisciplinaPratica(); 
                        dis_pratica++;
                    }
                }
            //fim do cadastro das disciplinas
            }else if(op == 2){
                int conta_aluno = 0;
                System.out.println("**no momento temos "+conta_aluno+" de 10(maximo) alunos cadastrados");
                if(conta_aluno >= 10){
                    System.out.println("-->limite de alunos cadastrados atingindo");
                }else{
                    alunos[conta_aluno] = CadastraAlunos();
                    if(alunos[conta_aluno]!=null){
                        System.out.println("aluno cadastrado ocm sucesso.");
                    }
                    conta_aluno++;
                }
            //fim do cadastro dos alunos
            }else if(op == 3){
                System.out.println("--Matricular um aluno em uma disciplina qualquer--");
                    int matriculas_efetuadas = 0;
                    System.out.println("**no momento temos "+matriculas_efetuadas+" de 10(maximo) alunos cadastrados");
                    if(matriculas_efetuadas >= 30){
                        System.out.println("-->O limite de matriculas foi atingindo.");
                    }else{
                        matriculas[matriculas_efetuadas] = MatricularAlunoEmDisciplina(alunos,disciplinas,disciplinas_praticas);
                    }
                    matriculas_efetuadas++;
            //fim do cadastramento das matriculas 
            }else if(op == 4){
                    matriculas = LançarNotas(alunos,disciplinas,disciplinas_praticas,matriculas);
                   //oq ta rolando aqui é que eu to enviando a matriz matriculas pro metodos
                   //ele vai la, modifica ela, e depois retorna ela modificada. e depois eu 
                   //recebo essa matriz de objetos matricula ja modificada e jogo no antigo lugar da
                   //matriz matriculas que foi enviado, assim, atualizando os dados da mesma
                   //que caso sao os dados das notas no aluno em questao na disciplina em questao.
                   
            //fim do lançamento de notas
            }else if(op == 5){
                 BoletimDoAluno(matriculas);
            //fim do boletim
            }else if(op == 6){
                System.out.println("deseja mesmo encerrar o programa?(S/N)");
                char end = input.next().charAt(0);
                while(end!='S' && end!='N'){
                    System.out.println("entrada invalida, tente novamente(DICA: letra maiuscula!)");
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
        System.out.println("##opçoes do sistema##");
        System.out.println("1 - Cadastrar as disciplinas oferecidas na escola(praticas ou nao)(maximo de 5).");
        System.out.println("2 - Cadastrar alunos(maximo de 10).");
        System.out.println("3 - Matricular aluno em uma disciplina qualquer.(maximo de 30)");
        System.out.println("4 - Lançar notas de um aluno.");
        System.out.println("5 - Mostrar Boletim de um aluno especifico.");
        System.out.println("6 - Fechar o programa.");
    }
    public static Disciplina CadastraDisciplinaPadrao(){
        Scanner input = new Scanner(System.in);
        System.out.println("--Cadastrar as disciplinas oferecidas na escola.--");
                System.out.println("digite codigo da disciplina:");
                int codigo = input.nextInt();
                //devo asumir que a entrada sera valida ou devo fazer uma verificaçao pra saber seo codigo esta repetipo?

                System.out.println("digite o nome da disciplina(somente uma palavra):");
                String nome = input.next();
                //mesmo questionamento da ultima entrada de dados.

                System.out.println("digite o valor da carag horaria geral da disciplina:");
                int carga_h = input.nextInt();


                //incersao dos dados recebidos no objeto:
                Disciplina disciplina = new Disciplina();
                disciplina.setCodigo(codigo);
                disciplina.setNome(nome);
                disciplina.setCarga_horaria_geral(carga_h);
                
                //debug
                System.out.println(disciplina.toString());
                
                return disciplina;
    }
    public static DisciplinaPratica CadastraDisciplinaPratica(){
        Scanner input = new Scanner(System.in);
        System.out.println("--Cadastrar as disciplinas oferecidas na escola(pratica).--");
        
                System.out.println("digite codigo da disciplina:");
                int codigo = input.nextInt();
                //devo asumir que a entrada sera valida ou devo fazer uma verificaçao pra saber seo codigo esta repetipo?

                System.out.println("digite o nome da disciplina(somente uma palavra):");//ver esse erro, so funciona com uma unica palavra como entrada, talvez tenha que usar o tal do BufferReader como leitor de dados...
                String nome = input.next();
                //mesmo questionamento da ultima entrada de dados.

                System.out.println("digite o valor da carga horaria geral da disciplina:");
                int carga_h = input.nextInt();

                System.out.println("digite o valor da carga horaria pratica da disciplina:");
                int carga_h_pratica = input.nextInt();

                //incersao dos dados recebidos no objeto:
                DisciplinaPratica pratica = new DisciplinaPratica();
                pratica.setCodigo(codigo);
                pratica.setNome(nome);
                pratica.setCarga_horaria_geral(carga_h);
                pratica.setCarga_horaria_pratica(carga_h_pratica);
                
                //debug
                System.out.println(pratica.toString());
                
                return pratica;
                
    }
    public static Aluno CadastraAlunos(){
        Scanner input = new Scanner(System.in);
        System.out.println("--Cadastrar aluno--");
            
        Aluno aluno = new Aluno();//crio o meu objeto individual
        
            System.out.println("digite o codigo do aluno:");
            int codigo = input.nextInt();
            
            System.out.println("digite o nome do aluno(somente uma palavra):");
            String nome = input.next();
            
            //incersao de dados no objeto
            aluno.setCodigo(codigo);
            aluno.setNome(nome);
            
            //debug
            System.out.println(aluno.toString());
            
            return aluno;//retorno meu objeto aluno indivual
      
    }
    public static Matricula MatricularAlunoEmDisciplina(Aluno[] alunos , Disciplina[] disciplinas , DisciplinaPratica[] disciplinas_praticas){
        Scanner input = new Scanner(System.in);

            Matricula matriculas = new Matricula();
        
            System.out.println("digite o ano letivo do aluno:");
            int ano = input.nextInt();
            while(ano > 2023){
                System.out.println("ano invalido");
                ano = input.nextInt();
            }
            
            //debug
            System.out.println(matriculas.toString());
            
            System.out.println("digite a serie no aluno(EX: primeira serie = 01, setima serie = 07):");
            int serie = input.nextInt();
            while(serie < 1 || serie > 9){
                System.out.println("serie invalida");
                serie = input.nextInt();
            }
            
            //debug
            System.out.println(matriculas.toString());
            
            //set aluno na matricula
            System.out.println("digite o codigo do aluno que esta sendo matriculado:");
            int codigo_aluno = input.nextInt();
            boolean codigo_ok = false;
            int index_aluno=12;//esse 12 é pra poder debugar se o erro aparecer aqui, oq nao vai por conta das validaçoes, mas de qqc forma ta ai =).
            
      /****/while(!codigo_ok){//********tem algum erro aqui nesse loop*******
                for(int i = 0 ; i < 10 ; i++){
                    if(alunos[i]!= null && alunos[i].getCodigo() == codigo_aluno){ //toda vez que for dar um search em uma matriz de objetos tem que lembrar que os objetos nao instanciados estaram como "null" e devem ser levados em consideraçao na hora da procura dentro da matriz.
                        codigo_ok = true;
                        index_aluno = i;
                    }
                }
                if(codigo_ok == false){
                    System.out.println("codigo nao encontrado, tente denovo.");
                    System.out.println("digite o codigo do aluno que esta sendo matriculado:");
                    codigo_aluno = input.nextInt();
                }
            }
            if(codigo_ok){
                matriculas.setAno_letivo(ano);
                matriculas.setSerie(serie);
                matriculas.setAluno(alunos[index_aluno]);
            }
            
            //set disciplina na matricula
            System.out.println("digite o codigo da disciplina em que o aluno sera matriculado:");
            int codigo_disciplina = input.nextInt();
            boolean codigo_d_ok = false;
            int index_disciplina = 11;
            System.out.println("disciplina pratica ou padrao?\n1.padrao.\n2.pratica.");
            int op = input.nextInt();
            while(op!=1 && op!=2){
                System.out.println("entrada invalida.");
                op = input.nextInt();
            }
            if(op==1){
                while(!codigo_d_ok){
                    for(int i = 0 ; i > 5 ; i++){
                        if(disciplinas_praticas[i]!=null  && disciplinas_praticas[i].getCodigo() == codigo_disciplina){
                            codigo_d_ok = true;
                            index_disciplina = i;
                        }
                    }
                    if(codigo_d_ok == false){
                        System.out.println("o codigo digitado nao foi encontrado, tente novamente.");
                        System.out.println("digite o codigo da disciplina em que o aluno sera matriculado:");
                        codigo_disciplina = input.nextInt();
                    }
                }
               
            }else /*if(op==2)*/{//esse if é redundante pq ja fiz uma validaçao de dados ali emcima, mas ele vai ficar por fim didaticos pra eu poder achar oq e onde eu to escrevendo os codigos 
                while(!codigo_d_ok){
                    for(int i = 0 ; i > 5 ; i++){
                        if(disciplinas[i]!=null  && disciplinas[i].getCodigo() == codigo_disciplina){
                            codigo_d_ok = true;
                            index_disciplina = i;
                        }
                    }
                    if(codigo_d_ok == false){
                        System.out.println("o codigo digitado nao foi encontrado, tente novamente.");
                        System.out.println("digite o codigo da disciplina em que o aluno sera matriculado:");
                        codigo_disciplina = input.nextInt();
                    }
                }
               
            }
            
            if(codigo_d_ok == true){
                if(op ==1){
                    matriculas.setDisciplina(disciplinas[index_disciplina]);
                }else{
                    matriculas.setDisciplinaPratica(disciplinas_praticas[index_disciplina]);
                }
            }
            
            return matriculas;
        
    }
    public static Matricula[] LançarNotas(Aluno[] alunos , Disciplina[] disciplinas , DisciplinaPratica[] disciplinas_praticas , Matricula[] matriculas){
        Scanner input = new Scanner(System.in);
        //lembrar que na media as notas tem pesos diferentes.
        boolean tudo_ok = false;
        System.out.println("--Lançar notas de um aluno--");
        System.out.println("informe o codigo do aluno:");
        int cod = input.nextInt();
        boolean ok = false;
        while(!ok){
            for(int i = 0 ; i < 10 ; i++){
                if(alunos[i]!=null  && alunos[i].getCodigo() == cod){
                    ok = true;
                }
            }
            
            if(ok == false){
                System.out.println("codigo nao encontrado, tente novamente.");
                System.out.println("informe o codigo do aluno:");
                cod = input.nextInt();
            }
            
        }
        
        System.out.println("informe o codigo da disciplina:");
        int dis = input.nextInt();
        boolean ok2 = false;
        while(!ok2){
            for(int i = 0 ; i < 10 ; i++){
                if(disciplinas[i]!=null  && disciplinas[i].getCodigo() == dis){
                    ok2 = true;
                }
            }
            if(ok2 == false){
                for(int i = 0 ; i < 10 ; i++){
                    if( disciplinas_praticas[i]!=null && disciplinas_praticas[i].getCodigo() == dis){
                        ok = true;
                    }
                }
            }
            if(ok2 == false){
                System.out.println("codigo nao encontrado, tente novamente.");
                System.out.println("informe o codigo da disciplina:");
                dis = input.nextInt();
            }
        }
        
        System.out.println("informe o ano letivo :");
        int ano = input.nextInt();
        while(ano > 2023){
            System.out.println("entrada invalida");
            ano = input.nextInt();
        }
        
        System.out.println("informe o bimestre da nota a ser lançada:");
        int bi = input.nextInt();
        while(bi<1 || bi>4){
            System.out.println("entrada invalida");
            bi = input.nextInt();
        }
        
        System.out.println("ok, digite a nota a ser inserida no sistema:");
        double nota = input.nextDouble();
        while(nota<0.0 || nota>10.0){
            System.out.println("entrada invalida");
            nota = input.nextDouble();
        }
        int index = -1;
        if(ok == true && ok2 == true){//verificaçao redundante
            for(int i = 0 ; i < 30 ; i++){
                if(matriculas[i]!=null && matriculas[i].aluno.getCodigo() == cod 
                        && matriculas[i].disciplina.getCodigo() == dis
                        && matriculas[i].getAno_letivo() == ano){
                    index = i;
                    if(bi == 1){
                        matriculas[i].setNota1Bim(nota);
                    }else if(bi == 2){
                        matriculas[i].setNota2Bim(nota);
                    }else if(bi == 3){
                        matriculas[i].setNota3Bim(nota);
                    }else if(bi == 4){
                        matriculas[i].setNota4Bim(nota);
                    }
                }
            }
        }
        
        return matriculas;
        //verificar se vai dar erro na parte da matriz de matriculas pq 
        //acho que quando retorna rnao vai fazer a modificaçao no retorno.
        //ahco que precisa enviar uma matricula(objeto singular) e ai no main
        //eu vou e coloco essa matricula(objeto singular) no lugar da matricula 
        //que estava na matriz de objetos pra poder atualizar os valores da notas.
        
    }
    public static void BoletimDoAluno(Matricula[] matriculas){
        Scanner input = new Scanner(System.in);
        System.out.println("--Mostrar Boletim do aluno--");
        //informa cod do aluno e ano letivo e tem que mostrar todas as 4 notas
        //junto com a media de todas as materias onde o aluno esteja matriculado;
        
        //coleta dados
        int index = -1;
        System.out.println("insira o codigo do aluno :");
        int cod = input.nextInt();
        boolean ok = false;
        while(!ok){
            for(int i = 0 ; i < Constantes.constM ; i++){
                if(matriculas[i]!=null && matriculas[i].aluno.getCodigo() == cod){
                    ok = true;
                    index = i;
                }
            }
            
            if(ok == false){
                System.out.println("codigo nao encontrado, tente novamente.");
                System.out.println("informe o codigo do aluno:");
                cod = input.nextInt();
            }
            
        }//essa verificaçao é somente para ver se o codigo esta cadastrado.
        
        System.out.println("digite o ano letivo do boletim desejado:");
        int ano = input.nextInt();
        while(ano > 2023){
            System.out.println("entrada invalida");
            ano = input.nextInt();
        }
        //fim da verificaçao de dados inceridos
        
        //procura os dados e ja poe na tela o boletim:
        int index2 = -1;
        System.out.println("--------------------------------------");
        System.out.println("Aluno: "+matriculas[index].aluno.getNome());
        System.out.println("Ano letivo: "+ano);
        System.out.println("Disciplinas:");
        for(int i = 0 ; i < Constantes.constM ; i++){
            if(matriculas[i]!=null && matriculas[i].aluno.getCodigo() == cod){
                index2 = i;
                if(matriculas[index2].getDisciplinaPratica() == null){
                    System.out.println("    "+matriculas[index2].disciplina.getNome()+":");
                    System.out.println("      Carga horaria: "+matriculas[index2].disciplina.getCarga_horaria_geral());
                    System.out.println("      Carga horaria pratica: 0");
                    System.out.println("      Notas:");
                    System.out.println("        1º Bim: "+matriculas[index2].getNota1Bim());
                    System.out.println("        2º Bim: "+matriculas[index2].getNota2Bim());
                    System.out.println("        3º Bim: "+matriculas[index2].getNota3Bim());
                    System.out.println("        4º Bim: "+matriculas[index2].getNota4Bim());
                    System.out.println("      Media final: "+matriculas[index2].MediaDisciplinaPadrao());
                    
                }else if(matriculas[index2].getDisciplinaPratica() != null){
                    System.out.println("    "+matriculas[index2].disciplinaPratica.getNome()+":");
                    System.out.println("      Carga horaria: "+matriculas[index2].disciplinaPratica.getCarga_horaria_geral());
                    System.out.println("      Carga horaria pratica: "+matriculas[index2].disciplinaPratica.getCarga_horaria_pratica());
                    System.out.println("      Notas:");
                    System.out.println("        1º Bim: "+matriculas[index2].getNota1Bim());
                    System.out.println("        2º Bim: "+matriculas[index2].getNota2Bim());
                    System.out.println("        3º Bim: "+matriculas[index2].getNota3Bim());
                    System.out.println("        4º Bim: "+matriculas[index2].getNota4Bim());
                    System.out.println("      Media final: "+matriculas[index2].MediaDisciplinaPratica());
                }
            }
        }
        System.out.println("--------------------------------------");
    }
    
}//fim da classe main...fim do codigo geral;
