/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-07-19 15:54:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminshow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t.sau\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tbackground-color:white;\r\n");
      out.write("\t\t\tfont-size:80px;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.vic\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfont-size:50px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Admin show</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body  bgcolor:\"87CEEB\">\r\n");
      out.write("<center><form>\r\n");
      out.write("<div class=\"sau\">REGISTRATION FORMS</div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("  <div class=\"vic\"><b>Name:</b></div>\r\n");
      out.write("  <input type=\"text\" name=\"Name\" placeholder=\"First Name\">\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"vic\"><b>USERNAME:</b></div>\r\n");
      out.write("  <input type=\"text\" name=\"username\" placeholder=\"username\">\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"vic\"><b>Phone Number:</b></div>\r\n");
      out.write("  <input type=\"text\" name=\"Phone Number\" placeholder=\"Phone Number\" >\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"vic\"><b>Email:</b></div>\r\n");
      out.write("  <input type=\"text\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"vic\"><b>Gender:</b></div>\r\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"male\" > Male\r\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"female\"> Female\r\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"other\"> Other  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"vic\"><b>Password:</b></div>\r\n");
      out.write("  <input type=\"password\" name=\"t5\" placeholder=\"***********\">\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"vic\"><input type=\"submit\" value=\"Submit\"></div>\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("</form></center>\r\n");
      out.write("</body>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}