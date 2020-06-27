import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ListaCadeiras {
    private static Map<Integer, Cadeira> Cadeiras = new HashMap<Integer, Cadeira>();
    public static void addCadeira(Cadeira Obj){
        if(Obj != null){
            Cadeiras.put(Obj.id, Obj);
        }
    }
    public static void exbibeCadeira(){
        Cadeira temp = new Cadeira();
        for (Integer chave : Cadeiras.keySet()){
            temp = Cadeiras.get(chave);
            System.out.println(temp.id + " - " + temp.getNomeDaCadeira());
        }
    }
}
