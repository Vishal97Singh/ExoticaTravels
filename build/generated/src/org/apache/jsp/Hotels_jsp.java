package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Hotels_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hotel Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("        <td valign=\"top\" rowspan=\"200\" colspan=\"80\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\" ><a href=\"DomesticPage.jsp\"><button onmouseover=\"style.color='darkblue',style.fontSize='40',style.fontStyle='bold'\">Domestic Flights</button></a></td>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\" ><a href=\"InternationalPage.jsp\"><button onmouseover=\"style.color='green',style.fontSize='40',style.fontStyle='bold'\">International Flights</button></a></td>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\" ><a href=\"HotelPage.jsp\"><button onmouseover=\"style.color='darkblue',style.fontSize='40',style.fontStyle='bold'\">Hotels</button></a></td>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\" ><a href=\"CarRentalPage.jsp\"><button onmouseover=\"style.color='green',style.fontSize='40',style.fontStyle='bold'\">Car Rentals</button></a></td>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\" ><a href=\"TourPackage.jsp\"><button onmouseover=\"style.color='darkblue',style.fontSize='40',style.fontStyle='bold'\">Tour Packages</button></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <font align=\"center\" color=\"darkblue\" size=\"+1\"><h3>Please Select the Hotel in which would you like to stay:</h3>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <form action=\"Flights.jsp\" name=\"myform\" method=\"post\">\n");
      out.write("            <table cellspacing=\"10\" align=\"center\" border=\"+2\" bordercolor=\"black\">\n");
      out.write("                <tr>\n");
      out.write("                    <td bordercolor=\"white\" ><font color=\"darkblue\">Select Hotel:</font></td>\n");
      out.write("                    <td bordercolor=\"white\">\n");
      out.write("                        <select name=\"HotelName\">\n");
      out.write("                            <option value=\"Sea View\">Hotel Sea View</option>\n");
      out.write("                            <option value=\"Sea Breeze\">Hotel Sea Breeze</option>\n");
      out.write("                        </select>\n");
      out.write("                           </td>\n");
      out.write("                </tr>\n");
      out.write("                   <tr>\n");
      out.write("                       <td bordercolor=\"while\">Number of Days</td>\n");
      out.write("                       <td bordercolor=\"white\"><input type=\"text\" name=\"numOfDays\" required></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                       <td bordercolor=\"white\">\n");
      out.write("                      &nbsp; &nbsp;&nbsp; \n");
      out.write("                     \n");
      out.write("                      <input type=\"submit\" value=\"Next\"></input></a>\n");
      out.write("                      <input type=\"hidden\" name=\"PageName\" value=\"Hotels\"/>\n");
      out.write("                       </td>\n");
      out.write("                   </tr>\n");
      out.write("            </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
