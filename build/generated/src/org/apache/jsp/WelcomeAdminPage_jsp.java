package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WelcomeAdminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("        <td valign=\"top\" rowspan=\"200\" colspan=\"80\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                <td><font color=\"darkblue\" size=\"+1\"><a href=\"");
out.println(response.encodeURL("DomesticPage.jsp").toString());
      out.write("\"><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Manage Domestic Flights</button></a></td>\n");
      out.write("                <td><font color=\"darkblue\" size=\"+1\"><a href=\"");
out.println(response.encodeURL("InternationalPage.jsp").toString());
      out.write("\"><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Manage International Flights</button></a></td>\n");
      out.write("                <td><font color=\"darkblue\" size=\"+1\"><a href=\"");
out.println(response.encodeURL("HotelPage.jsp").toString());
      out.write("\"><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Manage Hotels</button></a></td>\n");
      out.write("                <td><font color=\"darkblue\" size=\"+1\"><a href=\"");
out.println(response.encodeURL("CarRentalPage.jsp").toString());
      out.write("\"><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Manage Car Rentals</button></a></td>\n");
      out.write("                <td><font color=\"darkblue\" size=\"+1\"><a href=\"");
out.println(response.encodeURL("TourPackage.jsp").toString());
      out.write("\"><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Manage Tour Package</button></a></td>\n");
      out.write("                <td><font color=\"darkblue\" size=\"+1\"><a href=\"");
out.println(response.encodeURL("GetLogDetails").toString());
      out.write("\"><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Get Log Details</button></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br></br>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"200\" rowspan=\"80\">\n");
      out.write("                        <font color=\"brown\"size=\"+2\"><marquee>Welcome To Exotica Travels Website!!\n");
      out.write("                        <font color=\"brown\"size=\"+2\"></marquee><iframe  src=\"frame.html\" height=\"400\" width=\"320\"></iframe> </br>\n");
      out.write("                                 ");

                                java.util.Date date1=new java.util.Date();
                                out.println(date1.toString());
                                
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                      \n");
      out.write("        </table>\n");
      out.write("                      \n");
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
