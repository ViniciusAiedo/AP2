import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ListaCadeiras {
    private static Map<Integer, Cadeira> Cadeiras = new HashMap<Integer, Cadeira>();
    //Adiciona um objeto cadeira ao map
    public static void addCadeira(Cadeira Obj){
        if(Obj != null){
            Cadeiras.put(Obj.id, Obj);
        }
    }

    public static void updateCadeira(Integer oldKey, Cadeira newValue){
        if (Cadeiras.remove(oldKey) != null) {
            addCadeira(newValue);
        }
    }

    //faz a remoção somente pelo id
    //por isso, o ID da cadeira e a chave do Map devem ser iguais
    public static boolean deleteCadeira(Integer Key){
        Cadeira temp;
        temp = Cadeiras.remove(Key);
        if (temp != null){
            return true;
        }else{
            return false;
        }

    }

    public static Cadeira getCadeira(int Id){
        return Cadeiras.get(Id);
    }

    //Exibe a lista de cadeiras e seus IDs
    public static boolean exbibeCadeira(){
        Cadeira temp;
        if (!(Cadeiras.size() > 0)){
            return false;
        }
        for (Integer chave : Cadeiras.keySet()){
            temp = Cadeiras.get(chave);
            System.out.println(temp.id + " - " + temp.getNomeDaCadeira());
        }
        return true;
    }
}
