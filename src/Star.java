
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moyo
 */
public class Star {
    
   private ServerNode server;
   private ServerNode pc;
   private int size;
  private Star(){
      
  }
   
   public void addPc(ArrayList<String> id ){
       
       ClientNode pc =new ClientNode(id);
       ServerNode node = new ServerNode();
       
       node.setHeadpc(server);
       server=node;
       size++;
       
       
       
      
       
       
        
       
   }
    
}
