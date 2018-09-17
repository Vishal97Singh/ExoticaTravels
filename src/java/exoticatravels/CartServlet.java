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
import javax.servlet.http.*;

/**
 *
 * @author Vishal Singh
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void displayCart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
   {
    PrintWriter pw=response.getWriter();
    HttpSession session=request.getSession(false);
    String destination=session.getAttribute("selDestination").toString();
    String hotel=session.getAttribute("selHotel").toString();
    String totalDays=session.getAttribute("numDays").toString();
    String Airline=session.getAttribute("selAirline").toString();
    pw.println("<table>");
    pw.println("<tr><td>");
    pw.println("<font color='darkblue'>Destination:</font></td>");
    pw.println("<td><font color='darkblue'>"+destination+"</font></td></br>");
    
    pw.println("<table>");
    pw.println("<tr><td>");
    pw.println("<font color='darkblue'>Hotel:</font></td>");
    pw.println("<td><font color='darkblue'>"+hotel+"</font></td></br>");
    
    pw.println("<table>");
    pw.println("<tr><td>");
    pw.println("<font color='darkblue'>Total Number of Days for Stay:</font></td>");
    pw.println("<td><font color='darkblue'>"+totalDays+"</font></td></br>");
   
    pw.println("<tr><td>");
    pw.println("<font color='darkblue'>Airline:</font></td>");
    pw.println("<td><font color='darkblue'>"+Airline+"</font></td></br>");
    pw.println("</table>");
   }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            displayCart(request,response);
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
