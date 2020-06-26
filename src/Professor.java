public class Professor extends Pessoa {
    private int Id;
    public Professor(int id){
        this.Id = id;
    }

    public Professor(){

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
