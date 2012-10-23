

package trabajandohilos;


public class lincolnGreen extends Thread {
    
      public String valor="VERDE LINCOLN";
    
    public lincolnGreen (String mens) {
        super(mens);

    }

    @Override
    public void run() {
   for (int i = 45; i > 0; i--) {
            
             try {
                
                 sleep( (int)(Math.random() * 2000 ) );
            } 
             catch( InterruptedException e ) {
                
             
             }
             
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''");
            System.out.println("                    VERDE ABRAHAM LINCOLN");        
            
            System.out.println("El Semaforo De La Abraham Lincoln Esta : " + getName()+ " " + i );
            
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");   
            System.out.println("------ Av 27 De Febrero  Esta En ROJO---------" );    
            System.out.println("");
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");    

            
            
            
            if (lincolnGreen.interrupted()){
           try {
               
              lincolnGreen.sleep(1000 * 2);
           } 
           catch (InterruptedException ex) {
           }
            }
       
   }
    }
}