import java.util.ArrayList;
import java.util.List;
public class Curso {
    private int Id;
    private String Nome;
    private String Descricao;
    private int CargaHoraria;
    //Metodo cadeira não terá metodo set, apenas um metodo add e outro remove
    private List<Cadeira> Cadeiras;

    public Curso(int id) {
        if (id >= 0)
            this.Id = id;
        else
            this.Id = -1;

        Cadeiras = new ArrayList<Cadeira>();
    }

    public Curso() {
        this.Id = -1;
        Cadeiras = new ArrayList<Cadeira>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        //se não tem ID
        if (this.Id < 0)
            Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public void addCadeira(Cadeira Value){
        if (Value != null){
            this.Cadeiras.add(Value);
        }
    }

    public List<Cadeira> getCadeiras(){
        return this.Cadeiras;
    }
    public boolean removeCadeira(Cadeira Value){
        if (this.Cadeiras.remove(Value)){
            return true;
        }
        return false;
    }

    public Cadeira removeCadeira(int Value){
        return this.Cadeiras.remove(Value);
    }

}
