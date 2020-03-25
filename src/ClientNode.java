

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**l
 *
 * @author Moyo
 */
public class ClientNode {
    Scanner ex = new Scanner(System.in);  
    
    
    private ClientNode pc;
   
   
    
   
    
    
    public ClientNode(){
        
    }
    
   public void send(){
       System.out.println("Write your message below ");
       String msg =ex.next();
       ServerNode m =new ServerNode();
       m.setMessage(ex.next(msg));
       
       
        
   }
   public void receice(){
         ServerNode r = new ServerNode();
         
         
   }
    
    
    
    
    
}
