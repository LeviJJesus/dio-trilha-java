public class SmartTv {
    boolean connected = false;
    int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para:" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para:" + volume);
    }

    // O void indica que esse método não irá me retornar nada
    public void ligar(){
        connected = true;
    }
    public void desligar(){
        connected = false;
    }
}
