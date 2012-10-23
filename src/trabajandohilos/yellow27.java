
package trabajandohilos;


public class yellow27 extends Thread {
    
        public String valor="AMARILLO";
    
    public yellow27 (String mens) {
        super(mens);

    }

    @Override
    public void run() {
   for (int i = 5; i > 0; i--) {
            
             try {
                
                 sleep( (int)(Math.random() * 1000 ) );
            } 
             catch( InterruptedException e ) {
                
             
             }
             
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''");
            System.out.println("                    AMARILLO 27 FEBRERO ");        
            
            System.out.println("El Semaforo La Av. 27 De Febrero Esta " + getName()+ "" + i);
            
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");   
            System.out.println("---------Av Abraham Lincohn Esta En ROJO ----------" );    
            System.out.println("");
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");    

            
            
            
            if (yellow27.interrupted()){
           try {
               
              yellow27.sleep(1000 * 2);
           } 
           catch (InterruptedException ex) {
           }
            }
            
   
            
            
   }
    
}
}