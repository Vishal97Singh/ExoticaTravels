/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoticatravels;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.http.*;
/**
 *
 * @author Vishal Singh
 */
@WebServlet(name = "ValidationServlet", urlPatterns = {"/ValidationServlet"})
public class ValidationServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
          {
            /* TODO output your page here. You may use following sample code. */
            String user=request.getParameter("uid");
            String password=request.getParameter("pwd");
            String role=request.getParameter("r1");
                if(user.equals("admin") && password.equals("password@123") && role.equals("administrator"))
                  {
                   HttpSession session=request.getSession();
                   session.setAttribute("user",user);
                      
                  RequestDispatcher dispatch=request.getRequestDispatcher("WelcomeAdminPage.jsp");                   
                  dispatch.forward(request,response);
                  }
             else {
                if(user.equals("user") &&password.equals("user@123") &&role.equals("customer"))
                 {
                   HttpSession session=request.getSession();
                   session.setAttribute("user",user);
                                
                 RequestDispatcher dispatch=request.getRequestDispatcher("WelcomeCustomerPage.jsp");       
                    dispatch.forward(request,response);
                  }
            else
              {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>");
            out.println("<tr>");
            out.println("<td bgcolor='#000080' align='center'>");
            out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>Exotica Travels</font>");
            out.println("</td>");
            out.println("<td bgcolor='#000080' align='left' width='180'>");
            out.println("<img src='Images/exotica.png' width='180' height='120' align='right'/>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<font style='font-family: 'Arial Rounded MT Bold;' size='+2' color='red'>Invalid User Credentials!!</font>");
            out.println("</body>");
            out.println("</html>");
              }
           }
          }
    }
      
           
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

    
