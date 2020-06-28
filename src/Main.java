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
        //faz as perguntas e gets e sets
        //do novo objeto cadeira
        //...
        //...
        //...
        //depois de ter os dados
        ListaCadeiras.addCadeira(novaCadeira);
    }

    private static void cadastrarProfessor(){
        Professor novoProfessor = new Professor();
        //faz as perguntas e gets e sets
        //do novo objeto Professor
        //...
        //...
        //...
        //depois de ter os dados
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

    private void editarCurso(){
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
    public static void main(String[] args) {
        int A;
        while (true) {
            System.out.println("1 - Cadastrar Cursos");
            System.out.println("2 - Cadastrar Cadeiras");
            System.out.println("3 - Cadastrar Professores");
            System.out.print("Digite uma opção e pressione enter: ");
            A = IO.nextInt();
            IO.nextLine();
            switch (A) {
                case 1:
                    cadastrarCurso();
                    break;
                case 2:
                    cadastrarCadeira();
                    break;
                case 3:
                    cadastrarProfessor();
                    break;
            }
        }

    }
}