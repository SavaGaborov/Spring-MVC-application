/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M22
 * Generated at: 2017-06-28 21:13:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/stajl.css\" title=\"style\" />\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${greeting}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("  <title>About us</title>\r\n");
      out.write("  <meta name=\"description\" content=\"website description\" />\r\n");
      out.write("  <meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("  <meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/stil.css\" title=\"style\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"main\">\r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("      <div id=\"logo\">\r\n");
      out.write("        <div id=\"logo_text\">\r\n");
      out.write("          <h1><a href=\"index.html\">your<span class=\"logo_colour\">ticket</span>store</a></h1>\r\n");
      out.write("          <h2>Collect moments, not things.</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"menubar\">\r\n");
      out.write("        <ul id=\"menu\">\r\n");
      out.write("          <li class=\"selected\"><a href=\"aboutus.html\">About us</a></li>\r\n");
      out.write("          <li><a href=\"Probaexamples.html\">Music</a></li>\r\n");
      out.write("          <li><a href=\"sport.html\">Sport</a></li>\r\n");
      out.write("          <li><a href=\"Probaanother_page.html\">Arts/Theater</a></li>\r\n");
      out.write("          <li><a href=\"ProbaContact.html\">Familiy</a></li>\r\n");
      out.write("\t\t  <li><a href=\"Probaanother_page.html\">VIP</a></li>\r\n");
      out.write("          <li><a href=\"ProbaContact.html\" >Other</a></li>\r\n");
      out.write("          <li><a href=\"contactus.html\" >Contac us</a></li>\r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"site_content\">\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        \r\n");
      out.write("        <h3>My account</h3>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"#\" method=\"post\">\r\n");
      out.write("          <div class=\"form_settings\">\r\n");
      out.write("            <p><span>Username</span><input class=\"contact\" placeholder=\"Enter username\" type=\"text\" name=\"your_username\" /></p>\r\n");
      out.write("            <p><span>Password</span><input class=\"contact\" placeholder=\"Enter password\" type=\"text\" name=\"your_password\" /></p>\r\n");
      out.write("            \r\n");
      out.write("            <p><span>&nbsp;</span><input class=\"submit\" type=\"submit\" name=\"contact_submitted\" value=\"Log in\" /></p>\r\n");
      out.write("            <p><span>&nbsp;</span><input class=\"submit\" type=\"submit\" name=\"contact_submitted\" value=\"Registration\" /></p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <br>\r\n");
      out.write("        <h3>News</h3>\r\n");
      out.write("        <h4>Last minute offers</h4>\r\n");
      out.write("        <h5>May 22th, 2017</h5>\r\n");
      out.write("        <p>Take a look for the new last minute offers. Grab the last few remaining tickets for some entertainment and enjoy.<a href=\"#\">Read more</a></p>\r\n");
      out.write("        <p></p>\r\n");
      out.write("        <h4>Cash back</h4>\r\n");
      out.write("        <h5>May 27th, 2017</h5>\r\n");
      out.write("        <p>If an event is delayed or canceled, we will return some amount of money, between 50% to 95% value of your ticket.<a href=\"#\">Read more</a></p>\r\n");
      out.write("        <h3>Useful Links</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"https://www.tripping.com/explore/7-best-and-biggest-music-festivals-in-the-world?cam=477&gclid=CLaP4JGs4dQCFQa2GAod_p8PYA\">Best music festivals</a></li>\r\n");
      out.write("          <li><a href=\"https://www.pledgesports.org/2017/04/these-are-the-5-biggest-sporting-events-in-the-world/\">Best sport events</a></li>\r\n");
      out.write("          <li><a href=\"https://www.thebalance.com/top-international-fine-art-fairs-1295289\">Best art events </a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("        <br/>\r\n");
      out.write("        <h1>Welcome</h1>\r\n");
      out.write("        <br/><br/>\r\n");
      out.write("        <p><strong>Thank you for visiting our web site </strong>. You are half way from your great new experience.\r\n");
      out.write("         All you need to do is to look at our offers from article for which you are most interested in. Afterwards you need to <strong>login</strong>, of course if you are registered on our web site, thereafter then you have the possibility to book a ticket you want. <br/>\r\n");
      out.write("        <p>If you are not registered you can register <a href=\"registracija.html\">here</a>. Each our dear customer can book a <strong>maximum five tickets</strong>, type of entertainment are not important. In this way we want to protect ourselves and also to protect you from malicious buyers, petty thieves(scalpers) and give\r\n");
      out.write("         everyone chance to book precious tickets, which are limited.<p/>\r\n");
      out.write("        <p>Our association are <strong> successfully operate </strong> for many years, proofs for that are our <strong>satisfied clients</strong>, you can read impressions at the following link. <a href=\"http://www.html5webtemplates.co.uk\">Book of impressions</a><br>\r\n");
      out.write("        <p>We also have our <strong> LOYALITY CLUB </strong>, and we know to appreciate our loyal customers and for them we have special offers. To become part of the club you must to do business with us for at least five times, more about club of loyal customers you can find at following link. <a href=\"loyalityClub.html\">We respect loyalty!</a></p><br/><br/>\r\n");
      out.write("        <h2>Tickets are limited!</h2><br>\r\n");
      out.write("        <marquee direction=\"left\"> <h2>Grab your ticket now!</h2></marquee>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("      Copyright &copy; 2017 Sava Gaborov. All Rights Reserved | <a href=\"http://validator.w3.org/check?uri=referer\">Privacy Policy</a> | <a href=\"aboutus.html\">About us</a> | <a href=\"contactus.html\">Contact us</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
