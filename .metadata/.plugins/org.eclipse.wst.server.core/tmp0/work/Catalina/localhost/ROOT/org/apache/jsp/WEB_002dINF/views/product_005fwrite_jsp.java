/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2024-08-09 08:04:57 UTC
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

public final class product_005fwrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/./footer_login.jsp", Long.valueOf(1722410901066L));
    _jspx_dependants.put("/WEB-INF/views/./pr_wr.jsp", Long.valueOf(1723187263294L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1720402943772L));
    _jspx_dependants.put("/WEB-INF/views/./header_login.jsp", Long.valueOf(1722842928311L));
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
      out.write("    <title>상품 등록 페이지</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/basic.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/login.css?v=");
      out.print(today );
      out.write("\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/product.css?v=");
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
      out.write("</header>");
      out.write("\r\n");
      out.write("<!-- 상단 끝 -->\r\n");
      out.write("<!-- 중단 시작 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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
      out.write("</nav>\r\n");
      out.write("<main class=\"maincss\">\r\n");
      out.write("<section>\r\n");
      out.write("<p>상품 등록 페이지</p>\r\n");
      out.write("<div class=\"product_insert\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>대메뉴 카테고리</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <select class=\"product_input1\">\r\n");
      out.write("                <option></option>\r\n");
      out.write("            </select><input type=\"button\" value=\"카테고리 등록\" title=\"카테고리 등록\" class=\"product_btn\" id=\"pdcate\"> <span class=\"help_text\">※ 해당 카테고리가 없을 경우 신규 등록하시길 바랍니다.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>상품코드</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"text\" class=\"product_input1\"> \r\n");
      out.write("            <input type=\"button\" value=\"중복확인\" title=\"중복확인\" class=\"product_btn\" id=\"pdcode\"> <span class=\"help_text\">※ 상품코드는 절대 중복되지 않도록 합니다.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>상품명</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"text\" class=\"product_input2\" maxlength=\"100\"> <span class=\"help_text\">※ 상품명은 최대 100자까지만 적용할 수 있습니다.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>상품 부가설명</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"text\" class=\"product_input4\" maxlength=\"200\"> <span class=\"help_text\">※ 상품명은 최대 200자까지만 적용할 수 있습니다.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>판매가격</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"text\" class=\"product_input3\" maxlength=\"7\"> <span class=\"help_text\">※ , 없이 숫자만 입력하세요 최대 7자리</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>할인율</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"text\" class=\"product_input3\" maxlength=\"2\" value=\"0\">% <span class=\"help_text\">※ 숫자만 입력하세요</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>할인가격</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"text\" class=\"product_input3\" maxlength=\"7\" value=\"0\" readonly> <span class=\"help_text\">※ 할인율이 0%일 경우 할인가격은 0으로 처리 합니다.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>상품재고</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"text\" class=\"product_input3\" maxlength=\"4\" value=\"0\">EA <span class=\"help_text\">※ 숫자만 입력하세요. 재고가 0일 경우 soldout이 됩니다.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>판매 유/무</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <label class=\"product_label\">\r\n");
      out.write("            <input type=\"radio\" name=\"a\" style=\"vertical-align:-1px;\" checked> 판매시작\r\n");
      out.write("            </label>\r\n");
      out.write("            <label class=\"product_label\">\r\n");
      out.write("            <input type=\"radio\" name=\"a\" style=\"vertical-align:-1px;\"> 판매종료\r\n");
      out.write("            </label> <span class=\"help_text\">※ 숫자만 입력하세요. 재고가 0일 경우 soldout이 됩니다.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>조기품절</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <label class=\"product_label\">\r\n");
      out.write("                <input type=\"radio\" name=\"b\" style=\"vertical-align:-1px;\"> 사용\r\n");
      out.write("            </label>\r\n");
      out.write("            <label class=\"product_label\">\r\n");
      out.write("                <input type=\"radio\" name=\"b\" style=\"vertical-align:-1px;\" checked> 미사용\r\n");
      out.write("            </label>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul style=\"height: 160px;\">\r\n");
      out.write("        <li>상품 대표이미지</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <ol style=\"width:100%; height: auto;\">\r\n");
      out.write("            <li style=\"width:100%; height:45px;\">\r\n");
      out.write("            <input type=\"file\">\r\n");
      out.write("            <span class=\"help_text\">※ 상품 대표이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li style=\"height:45px;\">\r\n");
      out.write("            <input type=\"file\">\r\n");
      out.write("            <span class=\"help_text\">※ 추가 이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li style=\"height:45px;\">\r\n");
      out.write("            <input type=\"file\">\r\n");
      out.write("            <span class=\"help_text\">※ 추가 이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            </ol>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul style=\"height: 400px;\">\r\n");
      out.write("        <li>상품 상세설명</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <textarea class=\"product_text1\"></textarea>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"subpage_view4\" style=\"text-align:center; margin-bottom: 100px;\">\r\n");
      out.write("    <input type=\"button\" value=\"상품 리스트\" title=\"상품 리스트\" class=\"p_button p_button_color1\" style=\"margin-right: 5px;\">\r\n");
      out.write("    <input type=\"button\" value=\"상품 등록\" title=\"상품 등록\" class=\"p_button p_button_color2\">\r\n");
      out.write("    </span>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("</main>\r\n");
 Date prtoday=new Date(); 
      out.write("\r\n");
      out.write("<script type=\"module\">\r\n");
      out.write("import {pdset}from \"./js/pd_ca.js?v=");
      out.print(prtoday);
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("document.querySelector(\"#pdcate\").addEventListener(\"click\",function(){\r\n");
      out.write("new pdset().pdcate();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
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