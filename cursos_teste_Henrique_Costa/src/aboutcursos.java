import java.util.ArrayList;

public class aboutcursos {
    private int idCurso;
    private String nome;
    private int horas;
    private String disciplinas;

    public aboutcursos(int idCurso, String nome, int horas, String disciplinas) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.horas = horas;
        this.disciplinas = disciplinas;
    }

    public aboutcursos() {
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "cursos [duration=" + horas + ", idCurso=" + idCurso + ", name=" + nome + ", disciplinas=" + disciplinas + "]";
    }
}
