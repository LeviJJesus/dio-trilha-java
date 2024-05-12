import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("1,75");
        valor = NumberFormat.getInstance().parse("1.75");
        System.out.println(valor);
    }
}
