/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-10-15 18:08:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class taosukien_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"angular-validate/font-awesome-4.6.3/css/font-awesome.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"angular-validate/angular.min.js\"></script>\r\n");
      out.write("<!-- bootstrap -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js/jquery-3.1.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"datepick/moment.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"datepick/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"datepick/vi.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"datepick/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("<!--  -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/Css.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "maincontainer.jsp", out, false);
      out.write("\r\n");
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
      out.write("\t\t\t\t<h1>Tạo Sự Kiện</h1>\r\n");
      out.write("\t\t\t\t<div id=\"form-taosk\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" name=\"form\" ng-submit=\"register()\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"col-xs-4 control-label\">Tên Sự Kiện</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"tensukien\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-model=\"tensukien\" type=\"text\" placeholder=\"Tên sự kiện\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-pattern=\"/^[a-zA-Z 0-9]+$/\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\" style=\"padding-top: 7px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-check text-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.tensukien.$dirty && form.tensukien.$valid\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"form.tensukien.$dirty && form.tensukien.$invalid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-times text-danger\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.tensukien.$error.required\">Tên Sự Kiện\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tkhông được bỏ trống</span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.tensukien.$error.pattern\">Chỉ bao gồm các\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tkí tự a-z 0-9</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"diadiem\" class=\"col-xs-4 control-label\">Địa\r\n");
      out.write("\t\t\t\t\t\t\t\tđiểm</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"diadiem\" ng-model=\"diadiem\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"Địa điểm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-pattern=\"/^[a-zA-Z 0-9]+$/\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\" style=\"padding-top: 7px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-check text-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.diadiem.$dirty && form.diadiem.$valid\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"form.diadiem.$dirty && form.diadiem.$invalid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-times text-danger\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.diadiem.$error.required\">Địa điểm không\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tđược bỏ trống</span> <span ng-show=\"form.diadiem.$error.pattern\">Chỉ\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbao gồm các kí tự a-z 0-9</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"thoigian\" class=\"col-xs-4 control-label\">Thời\r\n");
      out.write("\t\t\t\t\t\t\t\tGian</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-8 form-group\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"height: 36px; margin-bottom: 0px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class='col-xs-5' style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class='input-group date' id='datetimepicker6'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type='text' class=\"form-control\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-1 control-label\">Đến</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class='col-xs-5' style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class='input-group date' id='datetimepicker7'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type='text' class=\"form-control\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"nhac\" class=\"col-xs-4 control-label\">Chế độ\r\n");
      out.write("\t\t\t\t\t\t\t\tnhắc</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\">Môt lần</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span> <span class=\"sr-only\">Toggle\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tDropdown</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Một lần</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lặp</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"htlap\" class=\"col-xs-4 control-label\">Hình\r\n");
      out.write("\t\t\t\t\t\t\t\tthức Lặp</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\">Mỗi Ngày</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span> <span class=\"sr-only\">Toggle\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tDropdown</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Mỗi ngày</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Mỗi thứ-2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Mỗi thứ-3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Mỗi thứ-4</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Mỗi thứ-6</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Mỗi thứ-7</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Mỗi Chủ Nhật</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"htnhac\" class=\"col-xs-4 control-label\">Hình\r\n");
      out.write("\t\t\t\t\t\t\t\tthức nhắc</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\">Email</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span> <span class=\"sr-only\">Toggle\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tDropdown</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Email</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Số Điện Thoại</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"loinhac\" class=\"col-xs-4 control-label\">Lời\r\n");
      out.write("\t\t\t\t\t\t\t\tnhắc</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"loinhac\" ng-model=\"loinhac\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"Lời Nhắc\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-pattern=\"/^[a-zA-Z 0-9]+$/\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\" style=\"padding-top: 7px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-check text-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.loinhac.$dirty && form.loinhac.$valid\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"form.loinhac.$dirty && form.loinhac.$invalid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-times text-danger\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.loinhac.$error.required\">Lời Nhắc không\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tđược bỏ trống</span> <span ng-show=\"form.loinhac.$error.pattern\">Chỉ\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tbao gồm các kí tự a-z 0-9</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"ghichu\" class=\"col-xs-4 control-label\">Ghi\r\n");
      out.write("\t\t\t\t\t\t\t\tchú</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"ghichu\" ng-model=\"ghichu\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"Ghi Chú\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-pattern=\"/^[a-zA-Z 0-9]+$/\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-4\" style=\"padding-top: 7px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-check text-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tng-show=\"form.ghichu.$dirty && form.ghichu.$valid\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div ng-show=\"form.ghichu.$dirty && form.ghichu.$invalid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-times text-danger\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-show=\"form.ghichu.$error.pattern\">Chỉ bao gồm các kí\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttự a-z 0-9</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"button-dangnhap\" class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Calendar.html\"><button type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary\">Tạo</button></a> <a href=\"DangNhap.html\"><button\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"button\" class=\"btn btn-primary\">Trở Lại</button></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
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
