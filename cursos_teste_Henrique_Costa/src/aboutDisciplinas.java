import java.util.ArrayList;

public class aboutDisciplinas {
    private String nomeD;
    private int idDisciplina;
    private int HorasD;

    public aboutDisciplinas(String nomeD, int idDisciplina, int horasD) {
        this.nomeD = nomeD;
        this.idDisciplina = idDisciplina;
        HorasD = horasD;
    }

    public aboutDisciplinas() {
    }

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public int getHorasD() {
        return HorasD;
    }

    public void setHorasD(int horasD) {
        HorasD = horasD;
    }

    @Override
    public String toString() {
        return "Disciplina [duration=" + HorasD + ", idCurso=" + idDisciplina + ", name=" + nomeD + "]";
    }
}
