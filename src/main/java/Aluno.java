import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private CPF cpf;
    private List<Telefone> telefones = new ArrayList<>();
    private String nome;
    private Email email;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void addTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

    public static void main(String[] args) {
        Aluno a = new Aluno(new CPF("123"), "Fulano", new Email("something"));
    }
    //Uma entidade pois podemos diferenciar duas instancias baseado em algum atributo
}
