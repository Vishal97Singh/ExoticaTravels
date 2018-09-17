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
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Vishal Singh
 */
@WebServlet(name = "SessionServlet", urlPatterns = {"/SessionServlet"})
public class SessionServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            HttpSession session=request.getSession();
            String requestingPageName=request.getParameter("PageName");
             if(requestingPageName.equals("destination"))
               {
              String selectedDestination=request.getParameter("destination");
              session.setAttribute("selDestination", selectedDestination);
              RequestDispatcher dispatch=request.getRequestDispatcher("/Hotels.jsp");       
              dispatch.forward(request,response);
               }
             else if(requestingPageName.equals("Hotels"))
             {
               String selectedHotel=request.getParameter("HotelName");
               String noOfDays=request.getParameter("numOfDays");
              session.setAttribute("selHotel", selectedHotel);
               session.setAttribute("numDays", noOfDays);
              RequestDispatcher dispatch=request.getRequestDispatcher("/Flights.jsp");       
              dispatch.forward(request,response);
             }
             else if(requestingPageName.equals("FlightsSevlet"))
             {
               String selectedAirline=request.getParameter("Airline");
              session.setAttribute("selAirline", selectedAirline);
              RequestDispatcher dispatch=request.getRequestDispatcher("/Cart.jsp");       
              dispatch.forward(request,response);
             
             }
                 
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

       @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
