
package trabajandohilos;


public class lincolnRed extends Thread {
    
      public String valor=" Rojo ";
    
    public lincolnRed (String mens) {
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
            System.out.println("                    ROJO ABRAHAM LINCOLN");        
            
            System.out.println("El Semaforo La Av. Abraham Lincoln Esta" + getName()  + " "   +  i);
            
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");   
            System.out.println("---------Av 27 De  Febrero Esta En Verde-------------" );    
            System.out.println("");
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");    

            
            
            
            if (lincolnRed.interrupted()){
           try {
               
              lincolnRed.sleep(1000 * 2);
           } 
           catch (InterruptedException ex) {
           }
            }
    
    
}
    }
}