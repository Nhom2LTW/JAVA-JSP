/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-10-15 17:00:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doimk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"angular-validate/font-awesome-4.6.3/css/font-awesome.css\">\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"angular-validate/angular.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$('#calendar').fullCalendar({\r\n");
      out.write("\t\t\ttheme : true,\r\n");
      out.write("\t\t\theader : {\r\n");
      out.write("\t\t\t\tleft : 'prev,next today',\r\n");
      out.write("\t\t\t\tcenter : 'title',\r\n");
      out.write("\t\t\t\tright : 'month,agendaWeek,agendaDay,listWeek'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tnavLinks : true, // can click day/week names to navigate views\r\n");
      out.write("\t\t\teditable : true,\r\n");
      out.write("\t\t\teventLimit : true, // allow \"more\" link when too many events\r\n");
      out.write("\t\t\tlang : 'vi'\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"main-container\">\r\n");
      out.write("\t\t\t<div id=\"main-user\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: 60px; background-color: #2F4F4F\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"button-TAO\" type=\"button\" class=\"btn btn-danger\" onclick=\"location.href='taosukien.jsp'\">TẠO</a></button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\" style=\"background-color: #2F4F4F\">\r\n");
      out.write("\t\t\t\t\t<form style=\"margin-left: 266px\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/main-user.png\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-success\">Đức Việt</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-success dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"caret\"></span> <span class=\"sr-only\">Toggle\r\n");
      out.write("\t\t\t\t\t\t\t\t\tDropdown</span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Thông Tin Tài Khoản</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Đổi Mật Khẩu</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"DangNhap.html\">Đăng Xuất</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"main-menu\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<form class=\"navbar-form\" role=\"search\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"form-search\" class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"input-search\" type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Search...\" name=\"q\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"main-form\" ng-app=\"demoApp\" ng-controller=\"RegisterCtrl\">\r\n");
      out.write("\t\t\t\t<h1>Đổi Mật Khẩu</h1>\r\n");
      out.write("\t\t\t\t<div id=\"form-dangki\">\r\n");
      out.write("\t\t\t\t\t<form id=\"register-form\" class=\"form-horizontal\" name=\"form\"\r\n");
      out.write("\t\t\t\t\t\tng-submit=\"register()\" novalidate>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"oldpassword\" class=\"col-xs-3 control-label\">Mật\r\n");
      out.write("\t\t\t\t\t\t\t\tkhẩu Cũ</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"oldpassword\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-model=\"oldpassword\" type=\"password\" placeholder=\"Mật khẩu\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-minlength=\"6\" ng-maxlength=\"30\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-check text-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.oldpassword.$dirty && form.oldpassword.$valid\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.oldpassword.$dirty && form.oldpassword.$invalid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-times text-danger\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.oldpassword.$error.required\">Nhập Mật\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tKhẩu Cũ</span> <span ng-show=\"form.oldpassword.$error.minlength\">Mật\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tkhẩu phải dài hơn 6 kí tự</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.oldpassword.$error.maxlength\">Mật khẩu\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tphải ngắn hơn 30 kí tự</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\" class=\"col-xs-3 control-label\">Mật\r\n");
      out.write("\t\t\t\t\t\t\t\tkhẩu Mới</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"password\" ng-model=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"password\" placeholder=\"Mật khẩu\" ng-minlength=\"6\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-maxlength=\"30\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-check text-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.password.$dirty && form.password.$valid\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"form.password.$dirty && form.password.$invalid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-times text-danger\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.password.$error.required\">Nhập Mật Khẩu\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tMới</span> <span ng-show=\"form.password.$error.minlength\">Mật\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tkhẩu phải dài hơn 6 kí tự</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.password.$error.maxlength\">Mật khẩu\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tphải ngắn hơn 30 kí tự</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"repassword\" class=\"col-xs-3 control-label\">Xác\r\n");
      out.write("\t\t\t\t\t\t\t\tNhận Mật Khẩu Mới</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"repassword\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-model=\"repassword\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Xác nhận mật khẩu\" password-match=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-check text-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.repassword.$dirty && form.repassword.$valid\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.repassword.$dirty && form.repassword.$invalid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-times text-danger\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.repassword.$error.required\">Xác nhận lại\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmật khẩu</span> <span ng-show=\"form.repassword.$error.unique\">Không\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tchính xác</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"button-dangnhap\" class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\"\r\n");
      out.write("\t\t\t\t\t\tng-disabled=\"!form.$dirty || (form.$dirty && form.$invalid)\">Đồng\r\n");
      out.write("\t\t\t\t\t\tÝ</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Trở Lại</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
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
