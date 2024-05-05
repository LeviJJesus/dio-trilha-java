public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está:" + smartTv.connected);
        System.out.println("O canal atual é: " +smartTv.canal);
        System.out.println("O volume está em: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV ligada?" + smartTv.connected);
        
        smartTv.desligar();
        System.out.println("TV ligada?" + smartTv.connected);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume está em: " + smartTv.volume);

        System.out.println(smartTv.canal);

        smartTv.mudarCanal(5);
        System.out.println(smartTv.canal);
    }
}
