
package trabajandohilos;


public class lincolnYellow extends Thread {
    
    
      public String valor="AMARILLO";
    
    public lincolnYellow(String mens) {
        super(mens);

    }

    @Override
    public void run() {
   for (int i = 5; i > 0; i--) {
            
             try {
                
                 sleep( (int)(Math.random() * 2000 ) );
            } 
             catch( InterruptedException e ) {
                
             
             }
             
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''");
            System.out.println("                    AMARILLO ABRAHAM LINCOLN");        
            
            System.out.println("El Semaforo De La Av. Abraham Lincoln Esta :  " + getName()+ " " + i);
            
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");
            
            System.out.println("---------Av 27 De Febrero Esta En ROJO -----------" );    
            System.out.println("");
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");    

            
            
            
            if (lincolnYellow.interrupted()){
           try {
               
              lincolnYellow.sleep(1000 * 2);
           } 
           catch (InterruptedException ex) {
           }
            }
   }
}
}