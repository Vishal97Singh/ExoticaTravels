package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Template_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>\n");
      out.write("            <tr>\n");
      out.write("            <td bgcolor='#000080' align=\"center\" >\n");
      out.write("            <font style=\"font-family: 'Arial Rounded MT Bold' , Gadget, sans-serif;\" size='+4' color='FFE4B5'><center>Exotica Travels</center></font>\n");
      out.write("            </td>\n");
      out.write("            <td bgcolor='#000080' align='left' width='150' height=\"200\">\n");
      out.write("                <img src='Images/exotica.png' width='250' height='150' align='right'/>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\"><a href=\"WelcomeCustomerPage.jsp\" ><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Home</button></a></td>\n");
      out.write("                    <td><font color=\"darkblue\" size=\"+1\"><a href=\"Logout.jsp\" ><button onmouseover=\"style.color='red',style.fontSize='40',style.fontStyle='bold'\">Logout</button></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table bgcolor=\"white\" border=\"0\" align='top' width='90%' style=\"height:200px\">\n");
      out.write("            <tr>\n");
      out.write("            <td style=\"width:216px\" colspan=\"1\" rowspan=\"4\"> <img src='Images/travel.jpg' width='310' height='450' align='left'/>\n");
      out.write("                ");
      out.write("\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Template Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
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
