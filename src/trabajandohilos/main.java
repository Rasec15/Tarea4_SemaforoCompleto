package trabajandohilos;

public class main {

    

    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new red27("ROJO ");
        Thread hilo2 = new yellow27("AMARILLO  ");
        Thread hilo3 = new Green27("VERDE  ");
        Thread hilo4 = new lincolnGreen("VERDE ");
        Thread hilo5 = new lincolnYellow("AMARILLO ");
        Thread hilo6 = new lincolnRed("ROJO");

         int menu = 0;
         
            
            while(menu == 0){
            
            Thread.sleep(1000);
            hilo3.start();

            Thread.sleep(1000 * 46);
            hilo2.start();

            Thread.sleep(1000 * 5);
            hilo.start();

            Thread.sleep(1000 * 50);
            hilo4.start();

        
            Thread.sleep(1000 * 45);
            hilo5.start();


            Thread.sleep(1000 * 5);
            hilo6.start();

        
        
        }
    }
}
