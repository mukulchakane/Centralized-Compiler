/*
 * GetClientDB.java
 *
 * 
 */

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;
import tc_Pack.*;

/**
 *
 * 
 * @version
 */
public class GetClientDB extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        ClientDB clientDB = new ClientDB();
        
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\TopCoder\\Database\\ClientDB.dat"));
            clientDB = (ClientDB)in.readObject();
            in.close();
        }catch(Exception e) {
            System.out.println("Exception: " + e);
        }
        
        try {
            ObjectOutputStream out = new ObjectOutputStream(response.getOutputStream());
            out.writeObject(clientDB);
            out.close();
        }catch(Exception e) {
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
