/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-10-15 18:07:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ngay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Calendar</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/Css.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js.js\"></script>\r\n");
      out.write("<!-- bootstrap -->\r\n");
      out.write("<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js/jquery-3.1.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- Plugin -->\r\n");
      out.write("<link href=\"plugin/fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"plugin/lib/cupertino/jquery-ui.min.css\">\r\n");
      out.write("<link href=\"plugin/fullcalendar.print.css\" rel=\"stylesheet\"\r\n");
      out.write("\tmedia=\"print\" />\r\n");
      out.write("<script src=\"plugin/lib/moment.min.js\"></script>\r\n");
      out.write("<script src=\"plugin/lib/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"plugin/fullcalendar.min.js\"></script>\r\n");
      out.write("<script src=\"plugin/lib/jquery-ui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plugin/locale/vi.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "maincontainer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<div id=\"main-menu\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<form class=\"navbar-form\" role=\"search\" style=\"margin-bottom: 10px\">\r\n");
      out.write("\t\t\t\t\t<div id=\"form-search\" class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"input-search\" type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Search...\" name=\"q\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"btn-group\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"margin-top: 20px; margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\">Hôm Nay</button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-default glyphicon glyphicon-chevron-left\"></button>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-default glyphicon glyphicon-chevron-right\"></button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t<h2 style=\"color: #003300\">10 Tháng-10 2016</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"btn-group\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"margin-top: 20px; margin-bottom: 10px;\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"location.href='ngay.jsp'\">Ngày</button>\r\n");
      out.write("\t\t\t\t\t\t  <button type=\"button\" class=\"btn btn-default\" onclick=\"location.href='tuan.jsp'\">Tuần</button>\r\n");
      out.write("\t\t\t\t\t\t  <button type=\"button\" class=\"btn btn-default\" onclick=\"location.href='thang.jsp'\">Tháng</button>\r\n");
      out.write("\t\t\t\t\t\t  <button type=\"button\" class=\"btn btn-default\">LịchBiểu</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<table id=\"tableday\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"time\"></th>\r\n");
      out.write("\t\t\t\t\t\t<th class=\"nameday-day\">Thứ-2</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">1am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">2am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">3am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">4am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">5am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">6am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">7am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">8am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">9am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">10am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">11am</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">12pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">1pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">2pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">3pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">4pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">5pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">6pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">7pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">8pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">9pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">10pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\">11pm</td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"time\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"day123\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
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
