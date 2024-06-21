public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // método construtor 
    // o nome deverá ser igual ao nome da classe
    // invocando o método construtor neste caso, está dizendo que obrigatoriamente quando eu for criar uma pessoa,
    // eu preciso informar nome e cpf
    public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
