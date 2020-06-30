import java.util.HashMap;
import java.util.Map;

public class ListaTurmas {
    private static Map<Integer, Turma> Turmas = new HashMap<Integer, Turma>();
    public static void addTurma(Turma Obj){
        if (Obj != null){
            Turmas.put(Obj.getId(), Obj);
        }
    }

    public static void exibirTurmas(){
        Turma temp;
        for (Integer chave : Turmas.keySet()){
            temp = Turmas.get(chave);
            System.out.println(temp.getId() + " - " + temp.getDisciplina().getNomeDaCadeira());
        }
    }

    public static boolean deleteTurma(Integer Key){
        Turma temp;
        temp = Turmas.remove(Key);
        return (temp != null);
    }
}
