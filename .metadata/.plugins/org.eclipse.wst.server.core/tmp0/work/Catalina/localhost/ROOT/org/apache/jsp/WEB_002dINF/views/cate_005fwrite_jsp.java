/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2024-10-10 02:12:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.Date;

public final class cate_005fwrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/./code/cate_wr.jsp", Long.valueOf(1728518509894L));
    _jspx_dependants.put("/WEB-INF/views/./section/footer_login.jsp", Long.valueOf(1722410901066L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1720402943772L));
    _jspx_dependants.put("/WEB-INF/views/./section/header_login.jsp", Long.valueOf(1724138482709L));
    _jspx_dependants.put("jar:file:/D:/spring_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shopping_mall/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
      out.write("\r\n");
 Date today = new Date(); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>상품등록 페이지</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/basic.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/login.css?v=");
      out.print(today );
      out.write("\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/category.css?v=");
      out.print(today );
      out.write("\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/logo.png\" sizes=\"128x128\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/logo.png\" sizes=\"64x64\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/logo.png\" sizes=\"32x32\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/logo.png\" sizes=\"16x16\">\r\n");
      out.write("    <script src=\"./js/jquery.js?v=");
      out.print(today );
      out.write("\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 상단 시작 -->\r\n");
      out.write("\r\n");
      out.write("<header class=\"headercss\">\r\n");
      out.write("    <div class=\"header_div\">\r\n");
      out.write("        <p><img src=\"./img/logo.png\" class=\"logo_sm\"> ADMINISTRATOR</p>\r\n");
      out.write("        <p>\r\n");
      out.write("        ");

        String adname=(String)session.getAttribute("adname");
        if(session==null||adname==null){
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \t<script>\r\n");
      out.write("        \talert('로그인을 해야 이용가능합니다.');\r\n");
      out.write("        \twindow.location.href=\"./\";\r\n");
      out.write("        \t</script>\r\n");
      out.write("        \r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(adname );
      out.write(" 관리자 <a href=\"#\">[개인정보 수정]</a> <a href=\"./admin_logout.do\">[로그아웃]</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");

String adid=(String)session.getAttribute("adid");
String adYN=(String)session.getAttribute("adYN");

      out.write("\r\n");
      out.write("<nav class=\"navcss\">\r\n");
      out.write("    <div class=\"nav_div\">\r\n");
      out.write("        <ol>\r\n");
      out.write("        \t");
if("master".equals(adid)){ 
      out.write("\r\n");
      out.write("            <li title=\"쇼핑몰 상품관리\"><a href=\"./admin_list.do\">쇼핑몰 관리자 리스트</a></li>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            ");
if(adid !=null){ 
      out.write("\r\n");
      out.write("            <li title=\"쇼핑몰 회원관리\"><a href=\"./shop_member_list.do\">쇼핑몰 회원관리</a></li>\r\n");
      out.write("            <li title=\"쇼핑몰 상품관리\"><a href=\"./product_list.do\">쇼핑몰 상품관리</a></li>\r\n");
      out.write("\t\t\t<li title=\"쇼핑몰 기본설정\"><a href=\"./admin_siteinfo.do\">쇼핑몰 기본설정</a></li>\r\n");
      out.write("            <li title=\"쇼핑몰 공지사항\"><a href=\"./notice_list.do\">쇼핑몰 공지사항</a></li>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("        </ol>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("<!-- 상단 끝 -->\r\n");
      out.write("<!-- 중단 시작 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<main class=\"maincss\">\r\n");
      out.write("<section>\r\n");
      out.write("    <p>카테고리 등록 페이지</p>\r\n");
      out.write("    <form id=\"cawr_frm\">\r\n");
      out.write("    <div class=\"cate_insert\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>분류코드</li>\r\n");
      out.write("            <li><input type=\"text\" class=\"cate_input1\" name=\"cacode\" id=\"cacode\" maxlength=\"5\"></li>\r\n");
      out.write("            <li>※ 분류코드는 대메뉴 코드와 소메뉴 코드를 합쳐서 자동 입력 됩니다.</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>대메뉴 코드</li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <input type=\"text\" class=\"cate_input2\" list=\"lg_menu\" name=\"lcode\" maxlength=\"5\">\r\n");
      out.write("                <datalist id=\"lg_menu\">\r\n");
      out.write("\r\n");
      out.write("                    <option>01</option>\r\n");
      out.write("\r\n");
      out.write("                </datalist>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>※ 대메뉴에 사용할 코드 번호를 입력하세요 최소 2자 이상의 숫자로 입력하셔야 합니다.</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>대메뉴명</li>\r\n");
      out.write("            <li><input type=\"text\" class=\"cate_input3\" name=\"lname\" maxlength=\"20\"> <label><!--<input type=\"checkbox\" style=\"margin-left:10px; margin-right: 5px;\">대메뉴만 생성</label>--></li>\r\n");
      out.write("            <li>※ 소메뉴만 등록시 대메뉴 코드와 대메뉴명은 무조건 입력 되어야 합니다.</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>소메뉴 코드(사용안함)</li>\r\n");
      out.write("            <li>\r\n");
      out.write("\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>※ 소메뉴에 사용할 코드 번호를 입력하세요 최소 2자 이상의 숫자로 입력하셔야 합니다.</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>소메뉴명(사용안함)</li>\r\n");
      out.write("            <li></li>\r\n");
      out.write("            <li>※ 대메뉴만 등록시 소메뉴 코드 및 소메뉴명은 입력하지 않으셔도 됩니다.</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>사용 유/무</li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <label class=\"rmargin\"><input type=\"radio\" name=\"ca_use\" value=\"Y\" checked>사용함 </label>\r\n");
      out.write("                <label class=\"rmargin\"><input type=\"radio\" name=\"ca_use\" value=\"N\">사용안함</label>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>※ 카테고리 사용안함으로 설정시 쇼핑몰에 해당 메뉴는 생성 되지 않습니다.</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <div class=\"subpage_view4\" style=\"text-align:center;\">\r\n");
      out.write("        <input type=\"button\" value=\"카테고리 리스트\" title=\"카테고리 리스트\" class=\"p_button p_button_color1\" style=\"margin-right: 5px;\" id=\"ca_list\">\r\n");
      out.write("        <input type=\"button\" value=\"카테고리 생성\" title=\"카테고리 생성\" class=\"p_button p_button_color2\" id=\"cate_in\">\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("</main>\r\n");
      out.write("<script type=\"module\">\r\n");
      out.write("import {caset}from \"./js/pd_ca.js\";\r\n");
      out.write("\r\n");
      out.write("document.querySelector(\"#ca_list\").addEventListener(\"click\",function(){\r\n");
      out.write("new caset().catelist();\r\n");
      out.write("});\r\n");
      out.write("document.querySelector(\"#cate_in\").addEventListener(\"click\",function(){\r\n");
      out.write("new caset().catein();\r\n");
      out.write("});\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<!-- 중단 끝 -->\r\n");
      out.write("<!-- 푸터 시작 -->\r\n");
      out.write("\r\n");
      out.write("<footer class=\"main_copyright\">\r\n");
      out.write("    <div>\r\n");
      out.write("        Copyright ⓒ 2024 shopbag All rights reserved.\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>");
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
