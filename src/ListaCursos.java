import java.util.HashMap;
import java.util.Map;

public class ListaCursos {
    //A classe main não deve ter acesso diretamente ao map de cursos
    //Para manipular o mesmo, deve-se utilizar os metodos descritos abaixo
    private static Map<Integer, Curso> Cursos = new HashMap<Integer, Curso>();


    //Adiciona um curso ao mapa de cursos
    //Verifica o ID, porém ele nunca deve chegar aqui com id menor que zero
    //O ID deve ser tratado no metodo modificador da propriedade
    public static boolean addCurso(Curso Value){
        if (Value.getId() > 0){
            Cursos.put(Value.getId(), Value);
            return true;
        }

        return false;
    }

    public static void updateCurso(Integer oldKey, Curso newValue){
        if (Cursos.remove(oldKey) != null) {
            addCurso(newValue);
        }
    }

    public static boolean deleteCurso(Integer Key){
        Curso temp;
        temp = Cursos.remove(Key);
        if (temp != null){
            return true;
        }else{
            return false;
        }

    }

    public static Curso getCurso(int Id){
        return Cursos.get(Id);
    }

    public static void exibeCursos(){
        Curso temp = new Curso();
        for (Integer chave : Cursos.keySet()){
            temp = Cursos.get(chave);
            System.out.println(temp.getId() + " - " + temp.getNome());
        }
    }
}
