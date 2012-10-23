
package trabajandohilos;



public class red27 extends Thread {
    
        public String valor="Rojo";
    
    public  red27 (String mens) {
        super(mens);

    }

    @Override
    public void run() {
   for (int i = 50; i > 0; i--) {
            
             try {
               
                 sleep( (int)(Math.random() * 2000 ) );
            } 
             catch( InterruptedException e ) {
                
                }
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''");
            System.out.println("                    ROJO 27 FEBRERO ");
            
            System.out.println("El Semaforo La Av. 27 De Febrero Esta " + getName() +  " " +  i);
            
            System.out.println("-------------------------------------------");
            System.out.println("");
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");   
  
   
                if (red27.interrupted())
                {
          
                    try {   
               
               red27.sleep(1000 *2);
           } 
           catch (InterruptedException ex) {
           
           }
                }
   
   
   
   
   
   
   }
   }
    
}
