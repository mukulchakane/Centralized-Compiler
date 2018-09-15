/*
 * CodeOb.java
 *
 * 
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tc_Pack;

import java.io.Serializable;

/**
 *
 * 
 */
public class CodeOb implements Serializable{
    public String mainClass;
    public String code;
    public int clientNo;
    public int toDo;
    public String returnString;
    
    /** Creates a new instance of CodeOb */
    public CodeOb() {
        clientNo = 0; // default 
        code = "";
        mainClass = "";
        toDo = 0;
        /*
         *toDo
         *1 = Fetch
         *2 = Save
         *3 = Compile
         *4 = Execute
         */
        returnString = "";
    }
}
