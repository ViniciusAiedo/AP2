import java.util.Scanner;

public class Main {
    //Usar esse scanner para fazer todas as atribuições
    public static Scanner IO = new Scanner(System.in);
    /*
    * Classes que irão armazenar as infromações das entidades
    * Professores:
    *   Classe : ListaProfessores.java
    *   Tipo : Static
    * Cursos :
    *   Classe : ListaCursos.java
    *   Tipo : Static
    * Cadeiras :
    *   Classe : ListaCadeiras.java
    *   Tipo : Static
    *
     */
    private static void cadastrarCadeira(){
        //pode user o construtor com os parametros ja
        Cadeira novaCadeira = new Cadeira();
        IO.nextLine();
        System.out.println("Cadastro de cadeiras");
        System.out.print("Nome: ");
        novaCadeira.setNomeDaCadeira(IO.nextLine());
        System.out.println("ID: ");
        novaCadeira.id = IO.nextInt();
        IO.nextLine();
        System.out.print("Descrição: ");
        novaCadeira.setDescricaoDaCadeira(IO.nextLine());
        System.out.print("Carga horaria: ");
        novaCadeira.setCargaHoraria(IO.nextInt());
        System.out.print("Hora de inicio: ");
        novaCadeira.setHoraInicio(IO.nextInt());
        System.out.print("Hora final: ");
        novaCadeira.setHoraFim(IO.nextInt());
        System.out.print("Dia de inicio: ");
        novaCadeira.setComecoDia(IO.nextInt());
        System.out.println("Mes de inicio: ");
        novaCadeira.setComecoMes(IO.nextInt());
        System.out.println("Ano de inicio: ");
        novaCadeira.setComecoAno(IO.nextInt());
        ListaCadeiras.addCadeira(novaCadeira);
    }

    private static void cadastrarProfessor(){
        Professor novoProfessor = new Professor();
        IO.nextLine();
        System.out.println("Cadastro de professores");
        System.out.println("Nome: ");
        novoProfessor.setNome(IO.nextLine());
        System.out.println("ID: ");
        novoProfessor.setId(IO.nextInt());
        IO.nextLine();
        System.out.println("CPF: ");
        novoProfessor.setCpf(IO.nextLine());
        System.out.println("Idade: ");
        novoProfessor.setIdade(IO.nextInt());
        ListaProfessores.addProfessor(novoProfessor);

    }
    private static void cadastrarCurso(){
        Curso novoCurso = new Curso();
        Integer cadeira;
        System.out.println("Digite o nome do curso: ");
        novoCurso.setNome(IO.nextLine());
        System.out.println("ID: ");
        novoCurso.setId(IO.nextInt());
        IO.nextLine();
        System.out.println("Nome: ");
        novoCurso.setNome(IO.nextLine());
        System.out.println("Carga horaria: ");
        novoCurso.setCargaHoraria(IO.nextInt());
        System.out.println("Cadeiras (-1 para terminar): ");
        if (ListaCadeiras.exbibeCadeira()){
            while(true){
                System.out.print("Digite o ID: ");
                cadeira = IO.nextInt();
                if (cadeira <= 0){
                    break;
                }
                novoCurso.addCadeira(ListaCadeiras.getCadeira(cadeira));
            }
        }else{
            System.out.println("Não ha cadeiras cadastradas no sistema. O Curso será adicionado sem cadeiras.");
        }

        ListaCursos.addCurso(novoCurso);
    }

    private static void editarCurso(){
        Integer idCurso, cadeira;
        Curso antigoCurso, novoCurso;
        ListaCursos.exibeCursos();
        System.out.print("Deseja editar o curso com ID: ");
        idCurso = IO.nextInt();
        antigoCurso = ListaCursos.getCurso(idCurso);

        System.out.println("Dados antigos:");
        System.out.println("ID: " + antigoCurso.getId());
        System.out.println("Nome: " + antigoCurso.getNome());
        System.out.println("Carga horaria: " + antigoCurso.getCargaHoraria());
        System.out.println("Cadeiras: " + antigoCurso.getCadeirasToString());
        novoCurso = new Curso();
        System.out.println("Novos dados: ");
        System.out.println("ID: ");
        novoCurso.setId(IO.nextInt());
        System.out.println("Nome: ");
        novoCurso.setNome(IO.nextLine());
        System.out.println("Carga horaria: ");
        novoCurso.setCargaHoraria(IO.nextInt());
        System.out.println("Cadeiras (-1 para terminar): ");
        ListaCadeiras.exbibeCadeira();
        while(true){
            System.out.print("Digite o ID: ");
            cadeira = IO.nextInt();
            if (cadeira <= 0){
                break;
            }
            novoCurso.addCadeira(ListaCadeiras.getCadeira(cadeira));
        }
        ListaCursos.updateCurso(idCurso, novoCurso);
    }

    private static void removerCurso(){
        Integer curso;
        ListaCursos.exibeCursos();
        System.out.println("Qual curso deseja remover: ");
        curso = IO.nextInt();
        if (ListaCursos.deleteCurso(curso)){
            System.out.println("Curso removido com sucesso");
        }else{
            System.out.println("Erro ao remover curso");
        }

    }

    private static void removerCadeira(){
        Integer cadeira;
        ListaCadeiras.exbibeCadeira();
        System.out.println("Qual cadeira deseja remover: ");
        cadeira = IO.nextInt();
        if (ListaCadeiras.deleteCadeira(cadeira)){
            System.out.println("Cadeira removido com sucesso");
        }else{
            System.out.println("Erro ao remover cadeira");
        }
    }

    private static void mostraMenuCadeiras(){
        int escolha = 0;
        while(escolha != 4) {
            System.out.println("1 - Adicionar cadeira");
            System.out.println("2 - Exibir cadeiras");
            System.out.println("3 - Remover cadeira");
            System.out.println("4 - Voltar ao menu anterior");
            System.out.println("Digite uma opção de pressione enter: ");
            escolha = IO.nextInt();
            if(escolha == 1){
                cadastrarCadeira();
            }else if (escolha == 2){
                ListaCadeiras.exbibeCadeira();
            }else if (escolha == 3){
                removerCadeira();
            }
        }
    }
    public static void montraMenuCursos(){
        int escolha = 0;
        while(escolha != 5) {
            System.out.println("1 - Adicionar curso");
            System.out.println("2 - Exibir cursos");
            System.out.println("3 - Remover um curso");
            System.out.println("4 - Editar um curso");
            System.out.println("5 - Voltar ao menu anterior");
            System.out.println("Digite uma opção de pressione enter: ");
            escolha = IO.nextInt();
            if(escolha == 1){
                cadastrarCurso();
            }else if (escolha == 2){
                ListaCursos.exibeCursos();
            }else if (escolha == 3){
                removerCurso();
            }else if (escolha == 4){
                editarCurso();
            }
        }
    }

    private static void mostraMenuProfessor(){
        int escolha = 0;
        while(escolha != 3) {
            System.out.println("1 - Adicionar professor");
            System.out.println("2 - Exibir professores");
            System.out.println("3 - Voltar ao menu anterior");
            System.out.println("Digite uma opção de pressione enter: ");
            escolha = IO.nextInt();
            if(escolha == 1){
                cadastrarProfessor();
            }else if (escolha == 2){
                ListaProfessores.exbibeProfessor();
            }
        }
    }

    private static void deletarTurma(){
        Integer turma;
        ListaTurmas.exibirTurmas();
        System.out.println("Qual turma deseja remover: ");
        turma = IO.nextInt();
        if (ListaTurmas.deleteTurma(turma)){
            System.out.println("Truma removido com sucesso");
        }else{
            System.out.println("Erro ao remover cadeira");
        }
    }
    private static void cadastrarTurma(){
        Professor P;
        Cadeira C;
        Turma T = new Turma();
        System.out.println("Cadastro de turmas");
        ListaProfessores.exbibeProfessor();
        System.out.println("Digite o ID de um Professor e pressione enter: ");
        P = ListaProfessores.getProfessor(IO.nextInt());
        ListaTurmas.exibirTurmas();
        System.out.println("Digite o ID de uma cadeira e pressione enter: ");
        C = ListaCadeiras.getCadeira(IO.nextInt());
        if(C != null && P != null){
            System.out.println("ID (turma): ");
            T.setId(IO.nextInt());
            T.setDisciplina(C);
            T.setProf(P);
            ListaTurmas.addTurma(T);
        }

    }
    private static void mostraMenuTurmas(){
        int E = 0;

        while(E != 4){
            E = IO.nextInt();
            System.out.println("1 - Adicionar turma");
            System.out.println("2 - Remover turma");
            System.out.println("3 - Exibir turma");
            System.out.println("4 - Sair");
            System.out.print("Digite uma opção e pressione ok: ");
            switch (E){
                case 1:
                    cadastrarTurma();
                    break;
                case 2:
                    deletarTurma();
                    break;
                case 3:
                    ListaTurmas.exibirTurmas();
                    break;
                default:
                    break;
            }
        }

    }
    public static void main(String[] args) {
        int A = 0;
        while (A != 4) {
            System.out.println("1 - Cursos");
            System.out.println("2 - Cadeiras");
            System.out.println("3 - Professores");
            System.out.println("4 - Turmas");
            System.out.println("5 - Sair");
            System.out.print("Digite uma opção e pressione enter: ");
            A = IO.nextInt();
            IO.nextLine();
            switch (A) {
                case 1:
                    montraMenuCursos();
                    break;
                case 2:
                    mostraMenuCadeiras();
                    break;
                case 3:
                    mostraMenuProfessor();
                    break;
                case 4:
                    mostraMenuTurmas();
                    break;
                default:
                    break;
            }
        }

    }
}