public class Pessoa {

    String nome;
    String apelido;


    public Pessoa() {
    }

    public Pessoa(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Bom dia, chamo-me: "+nome+" "+apelido;
    }
}
