public class Usuario {
    public static void main (String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " +smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);




        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);
    }
    
}
