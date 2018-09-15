import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import tc_Pack.*;

public class TCMain extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        CodeOb co = new CodeOb();
        String mainClass = "";
        
        try
        {
            ObjectInputStream in = new ObjectInputStream(request.getInputStream());
            co = (CodeOb)in.readObject();
            mainClass = co.mainClass;
            
            in.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e);
        }
        
        if(co.mainClass.equals("")) {
            co.returnString  = "Main Class Not Specified!";
            co.toDo = -1;
        }
        
        // process request
        switch(co.toDo) {
            case 1: // write to db (java)
            {
                String fname;
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".class";
                // delete old class file
                try {
                    new File(fname).delete();
                }catch(Exception e) { ; }
                
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".java";
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
                    bw.write(co.code);
                    bw.close();
                    co.toDo = 101; // java write ok
                }catch(Exception e) {
                    co.toDo = 102; // java write error
                    co.returnString = "Exception: " + e;
                }
            }
            break;
            case 11: // write to db (cpp)
            {
                String fname;
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".exe";
                // delete old class file
                try {
                    new File(fname).delete();
                }catch(Exception e) { ; }
                
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".cpp";
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
                    bw.write(co.code);
                    bw.close();
                    co.toDo = 1101; // cpp write ok
                }catch(Exception e) {
                    co.toDo = 1102; // cpp write error
                    co.returnString = "Exception: " + e;
                }
            }
            break;
            case 2: // read from java db
            {
                String fname;
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".java";
                try {
                    BufferedReader br = new BufferedReader(new FileReader(fname));
                    String code="", temp;
                    while((temp=br.readLine())!=null) {
                        code += temp + "\n";
                    }
                    co.code = code;
                    co.toDo = 201; // java code read successfully.
                    co.returnString = "CODE READ SUCCESSFULLY";
                }catch(Exception e) {
                    co.toDo = 202; // error reading code
                    co.returnString = "Exception: " + e;
                }
            }
            break;
            case 12: // read from cpp db
            {
                String fname;
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".cpp";
                try {
                    BufferedReader br = new BufferedReader(new FileReader(fname));
                    String code="", temp;
                    while((temp=br.readLine())!=null) {
                        code += temp + "\n";
                    }
                    co.code = code;
                    co.toDo = 1201; // cpp code read successfully.
                }catch(Exception e) {
                    co.toDo = 1202; // error reading code
                    co.returnString = "Exception: " + e;
                }
            }
            break;
            case 3: // compile java
            {
                String fname;
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".class";
                // delete old class file
                try {
                    new File(fname).delete();
                }catch(Exception e) { ; }
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".java";
                
                try {
                    File codeFile = new File(fname);
                    String parentDir = codeFile.getParent();
                    String fileName = codeFile.getName();

                    ArrayList <String> cmd = new ArrayList <String> ();
                    cmd.add("C:\\Program Files\\Java\\jdk1.8.0_40\\bin\\javac.exe");
                    cmd.add("-classpath");
                    cmd.add(parentDir);
                    cmd.add("-sourcepath");
                    cmd.add(parentDir);
                    cmd.add("-d");
                    cmd.add(parentDir);
                    cmd.add("-verbose");
                    cmd.add(fname);

                    ProcessBuilder pb = new ProcessBuilder(cmd);
                    Process p = pb.start();

                    String res = "";
                    int temp;
                    BufferedInputStream in2 = new BufferedInputStream(p.getErrorStream());
                    while( (temp=in2.read()) != -1) {
                        res += (char)temp;
                    }
                    co.returnString = res;
                    co.toDo = 301; // compiled & result returned...
                }catch(Exception e) {
                    co.returnString = "Exception: " + e;
                    co.toDo = 302; // error
                }
            }
            break;
            case 13: // compile cpp
            {
                String fname;
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".exe";
                // delete old exe file
                try {
                    new File(fname).delete();
                }catch(Exception e) { ; }
                fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".cpp";
                
                try {
                    File codeFile = new File(fname);
                    String parentDir = codeFile.getParent();
                    String fileName = codeFile.getName();
                    String exeName = fname;
                    while(!exeName.endsWith(".")) { // wait till dot
                        exeName = exeName.substring(0,exeName.length()-1);
                    }
                    exeName += "exe";
                    String add = parentDir + "\\bcc32.exe" ;
                    ArrayList <String> cmd = new ArrayList <String> ();
                    cmd.add(add);
                    //cmd.add("/I");
                    //cmd.add(parentDir);
                    cmd.add("\"" + fname + "\"");
                    //cmd.add("/Fe\"" + exeName + "\"");

                    ProcessBuilder pb = new ProcessBuilder(cmd);
                    pb.directory(new File(parentDir));
                    Process p = pb.start();

                    String res = "";
                    int temp;
                    BufferedInputStream in2 = new BufferedInputStream(p.getErrorStream());
                    while( (temp=in2.read()) != -1) {
                        res += (char)temp;
                    }
                    res += "\n";
                    in2 = new BufferedInputStream(p.getInputStream());
                    while( (temp=in2.read()) != -1) {
                        res += (char)temp;
                    }
                    
                    co.returnString = res;
                    co.toDo = 1301;
                }catch(Exception e) {
                    co.returnString = "Exception: " + e;
                    co.toDo = 1302;
                }
            }
            break;
            case 4: // execute java - take name from client side
            {
                String fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".java";
                
                try {
                    File codeFile = new File(fname);
                    String parentDir = codeFile.getParent();
                    String fileName = codeFile.getName();
                    String className = fileName;
                    while(!className.endsWith(".")) { // wait till dot
                        className = className.substring(0,className.length()-1);
                    }
                    className = className.substring(0,className.length()-1); // remove last dot too

                    ArrayList <String> cmd = new ArrayList<String> ();
                    cmd.add("java");
                    cmd.add("-classpath");
                    cmd.add(parentDir);
                    cmd.add("-Djava.library.path="+parentDir);
                    cmd.add(className);

                    ProcessBuilder pb = new ProcessBuilder(cmd);
                    Process p = pb.start();
                    String res = "Program Standard Error Stream:\n";
                    int temp;
                    BufferedInputStream in2 = new BufferedInputStream(p.getErrorStream());
                    while( (temp=in2.read()) != -1) {
                        res += (char)temp;
                    }
                    res += "\n\nProgram Standard Output Stream:\n";
                    in2 = new BufferedInputStream(p.getInputStream());
                    while( (temp=in2.read()) != -1) {
                        res += (char)temp;
                    }
                    co.returnString = res;
                    co.toDo = 401;
                }catch(Exception e) {
                    co.returnString = "Exception: " + e;
                    co.toDo = 402;
                }
            }
            break;
            case 14: // execute cpp - take name from client side
            {
                String fname = "C:\\TopCoder\\CodeDB\\CLIENT" + co.clientNo + "\\" + co.mainClass + ".cpp";
                
                try {
                    File codeFile = new File(fname);
                    String fileName = codeFile.getName();
                    String parentDir = codeFile.getParent();
                    String exeName = fname;
                    while(!exeName.endsWith(".")) { // wait till dot
                        exeName = exeName.substring(0,exeName.length()-1);
                    }
                    exeName += "exe";

                    ProcessBuilder pb = new ProcessBuilder(exeName);
                    pb.directory(new File(parentDir));
                    Process p = pb.start();

                    String res = "Program Standard Error Stream:\n";
                    int temp;
                    BufferedInputStream in2 = new BufferedInputStream(p.getErrorStream());
                    while( (temp=in2.read()) != -1) {
                        res += (char)temp;
                    }
                    res += "\n\nProgram Standard Output Stream:\n";
                    in2 = new BufferedInputStream(p.getInputStream());
                    while( (temp=in2.read()) != -1) {
                        res += (char)temp;
                    }
                    
                    co.returnString = res;
                    co.toDo = 1401; // ok
                }catch(Exception e) {
                    co.returnString = "Exception: " + e;
                    co.toDo = 1402; // exception
                }
            }
            break;
            case 9:
            {
               if(mainClass.equals("vijay"))
               {
                    co.returnString="match";
               }else
                   co.returnString="not match";
            }
        }
        
        //send back to client...
        try
        {
            ObjectOutputStream out = new ObjectOutputStream(response.getOutputStream());
            out.writeObject(co);
            out.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e);
        }        
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
