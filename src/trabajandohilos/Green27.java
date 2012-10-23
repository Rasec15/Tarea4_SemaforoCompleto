    
package trabajandohilos;



public class Green27 extends Thread {
   
        public String valor="VERDE";
    
    public Green27(String mensaje) {
        super(mensaje);

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
            System.out.println("                    VERDE 27 FEBRERO");                  
            
            System.out.println("El SEMAFORO DE LA AV 27 DE FEBRERO Esta " + getName()+" " +i);
            
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''"); 
            
            System.out.println("------Av Abraham Lincohn NO PUEDE CRUZAR------ FAVOR ESPERAR -----");    
            System.out.println("");
            System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''");    

            
            
            if (Green27.interrupted()){
          
                try {
               
                    Green27.sleep(1000 * 2);
           } 
                catch (InterruptedException ex) {
           }
           
            }
           
            
            
   }
    
    
    }
}
