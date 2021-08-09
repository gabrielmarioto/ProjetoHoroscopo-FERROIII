package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlets.ControleLogin;

public final class paginasecreta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- evita o acesso direto sem login -->\n");
      out.write("<!-- coloque o código abaixo em todos os módulos JSP do seu projeto -->\n");
      out.write("\n");
 if (!ControleLogin.testaAcesso(request, response))
    {
        response.sendRedirect("."); // volta ao login
    }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Horoscopo Diario</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: #C0C0C0; color: white; text-align: center\">\n");
      out.write("        <h1><strong>Por favor, informe sua data de nascimento!</strong></h1>\n");
      out.write("        <div >\n");
      out.write("            <form action=\"ControleLogin\">\n");
      out.write("            <p><label>Data Nascimento: </label><br><input type=\"text\" name=\"dataNasc\"/></p>\n");
      out.write("            <p><input type=\"submit\" value=\"Selecionar\"></p>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <h3><a href=\"ControleLogin?acao=logout\">Clique aqui para deslogar</a></h3>\n");
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
