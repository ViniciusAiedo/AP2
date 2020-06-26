import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    private static Map<Integer, Curso> Cursos = new HashMap<Integer, Curso>();

    private static boolean addCurso(Curso Value){
        if (Value.getId() > 0){
            Cursos.put(Value.getId(), Value);
            return true;
        }

        return false;
    }

    private static Curso getCurso(int Id){
        return Cursos.get(Id);
    }

    public static void main(String[] args) {
        Curso F = new Curso(1);
        F.setNome("Ciencia da Computação");
        F.setCargaHoraria(3046);
        F.setDescricao("Lorem ipsum");
        F.setId(1);
        addCurso(F);

        F = getCurso(1);

        System.out.println(F.getNome());
    }
}