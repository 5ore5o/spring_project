/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2024-08-07 08:03:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class add_005fmaster_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/./header_add.jsp", Long.valueOf(1722252488448L));
    _jspx_dependants.put("/WEB-INF/views/./admin_add.jsp", Long.valueOf(1723017782750L));
    _jspx_dependants.put("/WEB-INF/views/./footer_add.jsp", Long.valueOf(1722252631094L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>관리자 등록 페이지</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/basic.css?v=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/login.css?v=1\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/logo.png\" sizes=\"128x128\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/logo.png\" sizes=\"64x64\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/logo.png\" sizes=\"32x32\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/logo.png\" sizes=\"16x16\">\r\n");
      out.write("    <script src=\"./js/jquery.js?v=1\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 상단 시작 -->\r\n");
      out.write("\r\n");
      out.write("    <header class=\"admin_title_add\">\r\n");
      out.write("        <p><img src=\"./img/logo.png\" class=\"logo_sm\"> ADMINISTRATOR ADD</p>\r\n");
      out.write("    </header>");
      out.write("\r\n");
      out.write("<!-- 상단 끝 -->\r\n");
      out.write("<!-- 중단 시작 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section class=\"admin_bgcolor_add\">\r\n");
      out.write("        <div class=\"admin_login_add\">\r\n");
      out.write("            <form id=\"adminfrm2\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"font_color1\">아이디 및 패스워드 정보</li>\r\n");
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("                <input type=\"text\" class=\"add_input1\" placeholder=\"생성할 관리자 아이디를 입력하세요\" name=\"adid\" id=\"adid\">\r\n");
      out.write("                <button type=\"button\"  class=\"btn_button\" id=\"btn\">중복체크</button>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <input type=\"password\" class=\"add_input1\" placeholder=\"접속할 패스워드를 입력하세요\" name=\"adpw\">\r\n");
      out.write("                    <input type=\"password\" class=\"add_input1\" placeholder=\"동일한 패스워드를 입력하세요\" id=\"adpwck\">\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"font_color1\">관리자 기본정보 입력</li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <input type=\"text\" class=\"add_input1\" placeholder=\"담당자 이름을 입력하세요\" name=\"adname\">\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                <input type=\"text\" class=\"add_input1 emails\" placeholder=\"담당자 이메일을 입력하세요\" name=\"ademail\">\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"font_color1\">\r\n");
      out.write("                <input type=\"text\" class=\"add_input1 hp1\" placeholder=\"HP\" value=\"010\" maxlength=\"3\" name=\"adnum1\">\r\n");
      out.write("                -\r\n");
      out.write("                <input type=\"text\" class=\"add_input1 hp2\" placeholder=\"1234\" maxlength=\"4\" name=\"adnum2\">\r\n");
      out.write("                -\r\n");
      out.write("                <input type=\"text\" class=\"add_input1 hp2\" placeholder=\"5678\" maxlength=\"4\" name=\"adnum3\">\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"font_color1\">관리자 담당부서 및 직책</li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <select class=\"add_select1\" name=\"addepart\">\r\n");
      out.write("                        <option value=\"\">담당자 부서를 선택하세요</option>\r\n");
      out.write("                        <option value=\"임원\">임원</option>\r\n");
      out.write("                        <option value=\"전산팀\">전산팀</option>\r\n");
      out.write("                        <option value=\"디자인팀\">디자인팀</option>\r\n");
      out.write("                        <option value=\"CS팀\">CS팀</option>\r\n");
      out.write("                        <option value=\"MD팀\">MD팀</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <select class=\"add_select1\" name=\"adposition\">\r\n");
      out.write("                        <option value=\"\">담당자 직책을 선택하세요</option>\r\n");
      out.write("                        <option value=\"대표\">대표</option>\r\n");
      out.write("                        <option value=\"부장\">부장</option>\r\n");
      out.write("                        <option value=\"팀장\">팀장</option>\r\n");
      out.write("                        <option value=\"과장\">과장</option>\r\n");
      out.write("                        <option value=\"대리\">대리</option>\r\n");
      out.write("                        <option value=\"사원\">사원</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"font_color1\">※ 가입완료 후 전산 담당자가 확인 후 로그인 할 수 있습니다.</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            </form>\r\n");
      out.write("            <span class=\"admin_addbtn\">\r\n");
      out.write("                <button type=\"button\" class=\"btn_button btncolor1\" title=\"관리자 등록\" id=\"adbtn\">관리자 등록</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn_button btncolor2\" title=\"관리자 취소\" id=\"adbtn2\">등록 취소</button>\r\n");
      out.write("            </span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
Date today = new Date(); 
      out.write("\r\n");
      out.write("<script type=\"module\">\r\n");
      out.write("import {login}from \"./js/addouble.js?v=");
      out.print(today);
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("document.querySelector(\"#adbtn\").addEventListener(\"click\",function(){\r\n");
      out.write("new login().login_check();\r\n");
      out.write("});\r\n");
      out.write("document.querySelector(\"#adbtn2\").addEventListener(\"click\",function(){\r\n");
      out.write("new login().login_no();\r\n");
      out.write("});\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<!-- 중단 끝 -->\r\n");
      out.write("<!-- 푸터 시작 -->\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"admin_copy\">\r\n");
      out.write("        <div>\r\n");
      out.write("            Copyright ⓒ 2024 shopbag All rights reserved.\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>");
      out.write("\r\n");
      out.write("<!-- 푸터 끝 -->\r\n");
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