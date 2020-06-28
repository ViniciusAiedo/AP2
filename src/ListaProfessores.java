import java.util.HashMap;
import java.util.Map;

public class ListaProfessores {
    private static Map<Integer, Professor> Professores = new HashMap<Integer, Professor>();
    //Adiciona um objeto Professor ao map
    public static void addProfessor(Professor Obj){
        if(Obj != null){
            Professores.put(Obj.getId(), Obj);
        }
    }

    public static void updateProfessor(Integer oldKey, Professor newValue){
        if (Professores.remove(oldKey) != null) {
            addProfessor(newValue);
        }
    }

    //faz a remoção somente pelo id
    //por isso, o ID da Professor e a chave do Map devem ser iguais
    public static boolean deleteProfessor(Integer Key){
        Professor temp;
        temp = Professores.remove(Key);
        if (temp != null){
            return true;
        }else{
            return false;
        }

    }

    public static Professor getProfessor(int Id){
        return Professores.get(Id);
    }

    //Exibe a lista de Professores e seus IDs
    public static void exbibeProfessor(){
        Professor temp;
        for (Integer chave : Professores.keySet()){
            temp = Professores.get(chave);
            System.out.println(temp.getId() + " - " + temp.getNome());
        }
    }
}
