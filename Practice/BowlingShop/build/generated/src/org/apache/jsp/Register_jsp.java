package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <body style=\"margin: 0%\">\n");
      out.write("        <div class=\"header\" style=\"background-color: gold;padding: 10px\">\n");
      out.write("            <a style=\"font-size: 25px\">BowlingShop</a>\n");
      out.write("            <a style=\"font-size: 21px\">Register</a>\n");
      out.write("        </div>\n");
      out.write("   <center>\n");
      out.write("       <div class=\"middle\" style=\"background-color: lightgoldenrodyellow; margin-left: 250px; margin-right: 250px;margin-top: 25px; padding: 25px;border-radius: 25px\">\n");
      out.write("           <form action=\"Register\" method=\"post\" >\n");
      out.write("           Firstname\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Register.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           Lastname\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"text\" name=\"lastname\" required>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           Email\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"email\" name=\"email\" required>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           Password\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"password\" name=\"password\" required>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           Address\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"text\" name=\"address\" requried>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"submit\">\n");
      out.write("           </form>\n");
      out.write("       </div>\n");
      out.write("   </center>\n");
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
