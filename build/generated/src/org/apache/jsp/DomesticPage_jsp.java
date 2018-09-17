package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DomesticPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Domestic Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>\n");
      out.write("            <tr>\n");
      out.write("            <td bgcolor='#000080' align=\"center\" >\n");
      out.write("            <font style=\"font-family: 'Arial Rounded MT Bold' , Gadget, sans-serif;\" size='+4' color='FFE4B5'><center>Exotica Travels</center></font>\n");
      out.write("            </td>\n");
      out.write("            <td bgcolor='#000080' align='left' width='150' height=\"200\">\n");
      out.write("                <img src='Images/exotica.png' width='250' height='150' align='right'/>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("       \n");
      out.write("        <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\"><a href=\"WelcomeCustomerPage.jsp\" ><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Home</button></a></td>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\"><a href=\"Logout.jsp\" ><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Logout</button></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("             <form action=\"ConstructionPage.jsp\" name=\"myform\" method=\"post\">\n");
      out.write("            <table cellspacing=\"+2\" cellpadding=\"+2\" border=\"black\">\n");
      out.write("                <tr>\n");
      out.write("                    <th><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Origin</button></th>\n");
      out.write("                    <th><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Destination</button></th>\n");
      out.write("                    <th><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Total Distance(km)</button></th>\n");
      out.write("                    <th><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Total Time(hrs)</button></th>\n");
      out.write("                    <th><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Bus Cost(Rs)</button></th>\n");
      out.write("                    <th><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Flight Cost(Rs)</button></th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Delhi</td>\n");
      out.write("                    <td> Lucknow</td>\n");
      out.write("                    <td> 900</td>\n");
      out.write("                    <td> 13:20</td>\n");
      out.write("                    <td> 2000</td>\n");
      out.write("                    <td> 8000</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Delhi</td>\n");
      out.write("                    <td> Mumbai</td>\n");
      out.write("                    <td> 1000</td>\n");
      out.write("                    <td>15:00 </td>\n");
      out.write("                    <td> 2000</td>\n");
      out.write("                    <td> 10000</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Delhi</td>\n");
      out.write("                    <td> Kolkata</td>\n");
      out.write("                    <td> 1600</td>\n");
      out.write("                    <td> 24:00</td>\n");
      out.write("                    <td> 2500</td>\n");
      out.write("                    <td> 11000</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Delhi</td>\n");
      out.write("                    <td> Banglore</td>\n");
      out.write("                    <td> 2500</td>\n");
      out.write("                    <td> 34:10</td>\n");
      out.write("                    <td> 4000</td>\n");
      out.write("                    <td> 15000</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Delhi</td>\n");
      out.write("                    <td> Chennai</td>\n");
      out.write("                    <td> 3898</td>\n");
      out.write("                    <td> 42:15</td>\n");
      out.write("                    <td> 4500</td>\n");
      out.write("                    <td> 16000</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Delhi</td>\n");
      out.write("                    <td> Hyderabad</td>\n");
      out.write("                    <td> 2200</td>\n");
      out.write("                    <td> 38:25</td>\n");
      out.write("                    <td> 3800</td>\n");
      out.write("                    <td> 15500</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Delhi</td>\n");
      out.write("                    <td> Gandhinagar</td>\n");
      out.write("                    <td> 1800</td>\n");
      out.write("                    <td> 25:00</td>\n");
      out.write("                    <td> 2650</td>\n");
      out.write("                    <td> 12200</td>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                   <td> <table cellspacing=\"10\" align=\"right\" border=\"+3\" bordercolor=\"black\">\n");
      out.write("           \n");
      out.write("                    <td bordercolor=\"white\" ><font color=\"darkblue\" size=\"+2\">Select Airline:</font></td>\n");
      out.write("                    <td bordercolor=\"white\" style=\"\" size=\"+4\">    \n");
      out.write("                        <select name=\"Airline\" >\n");
      out.write("                            <option value=\"British Airline\" size=\"+2\"><b>British Airline</b></option>\n");
      out.write("                            <option value=\"Cathay Pacific\">Cathay Pacific</option>\n");
      out.write("                            <option value=\"Australian Airways\">Australian Airways</option>\n");
      out.write("                            <option value=\"Us Airways\">Us Airways</option>\n");
      out.write("                        </select></td></tr></br></br>\n");
      out.write("                   <tr> <td bordercolor=\"white\" ><font color=\"darkblue\" size=\"+2\">Select Bus:</font></td>\n");
      out.write("                    <td bordercolor=\"white\" style=\"\" size=\"+4\">    \n");
      out.write("                        <select name=\"Airline\" >\n");
      out.write("                            <option value=\"British Airline\" size=\"+2\"><b>British Airline</b></option>\n");
      out.write("                            <option value=\"Cathay Pacific\">Cathay Pacific</option>\n");
      out.write("                            <option value=\"Australian Airways\">Australian Airways</option>\n");
      out.write("                            <option value=\"Us Airways\">Us Airways</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"hidden\" name=\"PageName\" value=\"FlightsServlet\"/>\n");
      out.write("                    </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td bordercolor=\"white\">\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      <input type=\"submit\" value=\"Next\" size=\"+4\"></input></a>\n");
      out.write("                  </td>\n");
      out.write("                  </tr>\n");
      out.write("             </table>\n");
      out.write("         ");
      out.write("\n");
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
