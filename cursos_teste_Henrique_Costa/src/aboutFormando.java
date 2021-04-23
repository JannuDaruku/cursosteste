import java.util.ArrayList;

public class aboutFormando {
    private int idFormando;
    private String nome;
    private boolean male;
    private ArrayList<Integer> telefones = new ArrayList<>();

    public aboutFormando() {
    }

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMale() { return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public ArrayList<Integer> getTelefones() {
        return telefones;
    }

    public void setTelefones(int telefone) {
        this.telefones.add(telefone);
    }

    @Override
    public String toString() {
        return "Formando{" +
                "idFormando=" + idFormando +
                ", name='" + nome + ':' +
                ", male=" + male +
                ", cellphone number=" + telefones +
                '}';
    }
}