/*
 * ClientDB.java
 *
 * 
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tc_Pack;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * 
 */
public class ClientDB implements Serializable{
    
    // client list
    public ArrayList <Client> allClients;
    
    //current client id
    public int currentClient;
    
    /** Creates a new instance of ClientDB */
    public ClientDB() {
        allClients = new ArrayList <Client> ();
        for(int i=0;i<100;i++) {
            Client cl = new Client();
            cl.clientNo = "CLIENT" + (i+1);
            cl.password = "";
            cl.userAlias = "USER_" + (i+1);
            cl.task = "";
            allClients.add(cl);
        }
    }
}
