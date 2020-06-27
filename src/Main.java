public class Main {
    public static void main(String[] args) {
        Curso F = new Curso();
        Curso G = new Curso();
        Integer oldKey;
        Cadeira Obj = new Cadeira(1, "POO", "Uma merda", 30, 19, 22, 1, 7, 2020);

        ListaCadeiras.addCadeira(Obj);

        F.setNome("Ciencia da Computação");
        F.setCargaHoraria(3046);
        F.setDescricao("Lorem ipsum");
        F.setId(1);
        ListaCursos.addCurso(F);
        F = new Curso();
        F.setNome("Ciencia da informacao");
        F.setCargaHoraria(3040);
        F.setDescricao("Lorem ipsum dolor");
        F.setId(2);
        ListaCursos.addCurso(F);
        //Mostra todos os cursos
        ListaCursos.exibeCursos();
        //Lê a chave do antigo
        oldKey = 2;
        //Cria novo objeto
        G.setId(4);
        G.setDescricao("Lorem ipsum dolor mer");
        G.setCargaHoraria(3060);
        G.setNome("Sistemas da informação");
        //Chama o "update"
        ListaCursos.updateCurso(oldKey, G);
        //Exibe todos
        ListaCursos.exibeCursos();
        //ListaCursos.deleteCurso(1);

    }
}