package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaymentPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Payment Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>\n");
      out.write("            <tr>\n");
      out.write("            <td bgcolor='#000080' align=\"center\" >\n");
      out.write("            <font style=\"font-family: 'Arial Rounded MT Bold' , Gadget, sans-serif;\" size='+4' color='FFE4B5'><center>Exotica Travels</center></font>\n");
      out.write("            </td>\n");
      out.write("            <td bgcolor='#000080' align='left' width='150' height=\"200\">\n");
      out.write("                <img src='Images/exotica.png' width='250' height='150' align='right'/>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            </table></br></br>\n");
      out.write("            <form name=\"Payment\" action=\"ConstructionPage.jsp\">\n");
      out.write("                 <table cellspacing=\"10\" align=\"center\" border=\"+2\" bordercolor=\"black\">\n");
      out.write("              <tr>\n");
      out.write("                    <td bordercolor=\"white\" ><font color=\"darkblue\">Select Bank ATM:</font></td>\n");
      out.write("                    <td bordercolor=\"white\">    \n");
      out.write("                        <select name=\"Payment\">\n");
      out.write("                            <option value=\"icici\">ICICI BANK</option>\n");
      out.write("                            <option value=\"sbi\">SBI</option>\n");
      out.write("                            <option value=\"pnb\">PNB</option>\n");
      out.write("                            <option value=\"ald\">ALLAHABAD BANK</option>\n");
      out.write("                        </select>\n");
      out.write("                 </table></br>\n");
      out.write("             <table cellspacing='10' align='center' border='2' bordercolor='black'>\n");
      out.write("            <tr><td bordercolor='white'>Card Number:<td COLSPAN='2' bordercolor='white'><input type='number' name='card' minlength=\"16\" required>\n");
      out.write("            <tr><td bordercolor='white'>Expiry Date:<td COLSPAN='2' bordercolor='white' > <input type='date' name='exdate' required>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td bordercolor='white'>CVV Number:<td COLSPAN='2' bordercolor='white' > <input type='number' name='cvv'  required>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td bordercolor='white'>ATM PIN:<td COLSPAN='2' bordercolor='white'><input type='password' name='pin' minlength=\"4\" required>\n");
      out.write("            <tr><td bordercolor='white'><input type='Submit' value='Submit'>\n");
      out.write("            <td bordercolor='white'><input type='RESET' text='Reset'>\n");
      out.write("             </table>\n");
      out.write("            </form>>\n");
      out.write("            \n");
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
