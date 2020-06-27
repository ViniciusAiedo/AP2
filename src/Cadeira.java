public class Cadeira {
    public int id;
    public Cadeira(){

    }
    public Cadeira(int id, String nomeDaCadeira, String descricaoDaCadeira, int cargaHoraria, int horaInicio, int horaFim, int comecoDia, int comecoMes, int comecoAno) {
        this.id = id;
        this.nomeDaCadeira = nomeDaCadeira;
        this.descricaoDaCadeira = descricaoDaCadeira;
        this.cargaHoraria = cargaHoraria;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.comecoDia = comecoDia;
        this.comecoMes = comecoMes;
        this.comecoAno = comecoAno;
    }

    private String nomeDaCadeira;
    private String descricaoDaCadeira;
    private int cargaHoraria;
    private int horaInicio;
    private int horaFim;
    private int comecoDia;
    private int comecoMes;
    private int comecoAno;

    public String getNomeDaCadeira() {
        return nomeDaCadeira;
    }

    public void setNomeDaCadeira(String nomeDaCadeira) {
        this.nomeDaCadeira = nomeDaCadeira;
    }

    public String getDescricaoDaCadeira() {
        return descricaoDaCadeira;
    }

    public void setDescricaoDaCadeira(String descricaoDaCadeira) {
        this.descricaoDaCadeira = descricaoDaCadeira;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public int getComecoDia() {
        return comecoDia;
    }

    public void setComecoDia(int comecoDia) {
        this.comecoDia = comecoDia;
    }

    public int getComecoMes() {
        return comecoMes;
    }

    public void setComecoMes(int comecoMes) {
        this.comecoMes = comecoMes;
    }

    public int getComecoAno() {
        return comecoAno;
    }

    public void setComecoAno(int comecoAno) {
        this.comecoAno = comecoAno;
    }
}
