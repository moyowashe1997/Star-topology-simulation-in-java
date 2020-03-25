/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moyo
 */
public class ServerNode {
    private ServerNode headpc;
    private ServerNode tailpc;
    private String message;

    public ServerNode(String message){
        this.message =message;
    }
    public ServerNode(ServerNode headpc){
        this.headpc=headpc;
    }
    
    public ServerNode(){
    
}

    public ServerNode getHeadpc() {
        return headpc;
    }

    public void setHeadpc(ServerNode headpc) {
        this.headpc = headpc;
    }

    public ServerNode getTailpc() {
        return tailpc;
    }

    public void setTailpc(ServerNode tailpc) {
        this.tailpc = tailpc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String pc) {
        this.message = message;
    }
    

    @Override
    public String toString() {
        return 
                "Sender     :" + headpc +
              "\nReceiver    :" + tailpc + 
              "\nPc       :" + message ;
    }
    
    
    
    
}
