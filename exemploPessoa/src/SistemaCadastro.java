public class SistemaCadastro {
    public static void main(String[] args) {
        // Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("150", "Levi");

        // definimos o endereço de marcos
        marcos.setEndereco("Rua das marias");

        // e como definir o nome e cpf do marcos?
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
