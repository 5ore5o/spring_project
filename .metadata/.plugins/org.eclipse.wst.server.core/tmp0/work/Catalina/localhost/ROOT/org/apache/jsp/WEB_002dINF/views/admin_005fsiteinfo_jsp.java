/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2024-10-08 00:02:38 UTC
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

public final class admin_005fsiteinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/./section/footer_add.jsp", Long.valueOf(1722252631094L));
    _jspx_dependants.put("/WEB-INF/views/./code/add_siteinfo.jsp", Long.valueOf(1724120547155L));
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
      out.write("    <title>관리자 등록 페이지</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/basic.css?v=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/login.css?v=");
      out.print(today );
      out.write("\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/subpage.css?v=");
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
      out.write("<form id=\"adhomeset\">   \r\n");
      out.write("    <p>홈페이지 가입환경 설정</p>\r\n");
      out.write("<div class=\"subpage_view\">\r\n");
      out.write("<ul class=\"info_form\">\r\n");
      out.write("    <li>홈페이지 제목</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" value=\"\" class=\"in_form1\" name=\"hi_title\"> \r\n");
      out.write("    </li>\r\n");
      out.write("</ul>    \r\n");
      out.write("<ul class=\"info_form\">\r\n");
      out.write("    <li>관리자 메일 주소</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form2\" name=\"hi_ademail\"> ※ 관리자가 보내고 받는 용도로 사용하는 메일 주소를 입력합니다.(회원가입,인증메일,회원메일발송 등에서 사용)\r\n");
      out.write("    </li>\r\n");
      out.write("</ul> \r\n");
      out.write("<ul class=\"info_form\">\r\n");
      out.write("    <li>포인트 사용 유/무</li>\r\n");
      out.write("    <li class=\"checkcss\">\r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"hi_use\" value=\"Y\">포인트 사용</label></em> \r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"hi_use\" value=\"N\" checked>포인트 미사용</label></em>\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form2\" style=\"border-bottom:1px solid rgb(81, 61, 61);\">\r\n");
      out.write("    <li>회원가입시 적립금</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form3\" maxlength=\"5\" name=\"hi_point\"> 점\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>회원가입시 권한레벨</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form3\" maxlength=\"1\" name=\"hi_level\"> 레벨\r\n");
      out.write("    </li>\r\n");
      out.write("</ul> \r\n");
      out.write("</div>\r\n");
      out.write("<p>홈페이지 기본환경 설정</p>\r\n");
      out.write("<div class=\"subpage_view\">\r\n");
      out.write("<ul class=\"info_form2\">\r\n");
      out.write("    <li>회사명</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"hs_com\"> \r\n");
      out.write("    </li>\r\n");
      out.write("    <li>사업자등록번호</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"hs_bnum\"> \r\n");
      out.write("    </li>\r\n");
      out.write("</ul> \r\n");
      out.write("<ul class=\"info_form2\">\r\n");
      out.write("    <li>대표자명</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"hs_kname\"> \r\n");
      out.write("    </li>\r\n");
      out.write("    <li>대표전화번호</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"hs_knum\"> \r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form2\">\r\n");
      out.write("    <li>통신판매업 신고번호</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"hs_osnum\"> \r\n");
      out.write("    </li>\r\n");
      out.write("    <li>부가통신 사업자번호</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"hs_addnum\"> \r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form2\">\r\n");
      out.write("    <li>사업장 우편번호</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"hs_postal\"> \r\n");
      out.write("    </li>\r\n");
      out.write("    <li>사업장 주소</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form2\" name=\"hs_badd\"> \r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form2\" style=\"border-bottom:1px solid rgb(81, 61, 61);\">\r\n");
      out.write("    <li>정보관리책임자명</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"hs_adname\"> \r\n");
      out.write("    </li>\r\n");
      out.write("    <li>정보책임자 E-mail</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form1\" name=\"hs_ademail\"> \r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<p>결제 기본환경 설정</p>\r\n");
      out.write("<div class=\"subpage_view\">  \r\n");
      out.write("<ul class=\"info_form2\">\r\n");
      out.write("    <li>무통장 은행</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"pb_bk\"> \r\n");
      out.write("    </li>\r\n");
      out.write("    <li>은행계좌번호</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form1\" name=\"pb_bknum\" placeholder=\"-포함해주세요.\" maxlength=\"17\"> \r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form\">\r\n");
      out.write("    <li>신용카드 결제 사용</li>\r\n");
      out.write("    <li class=\"checkcss\">\r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"pb_card\" value=\"Y\"> 사용</label></em> \r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"pb_card\" value=\"N\" checked> 미사용</label></em> ※ 해당 PG사가 있을 경우 사용으로 변경합니다.\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form\">\r\n");
      out.write("    <li>휴대폰 결제 사용</li>\r\n");
      out.write("    <li class=\"checkcss\">\r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"pb_phone\" value=\"Y\"> 사용</label></em> \r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"pb_phone\" value=\"N\" checked> 미사용</label></em> ※ 주문시 휴대폰 결제를 가능하게 할 것인지를 설정합니다.\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form\">\r\n");
      out.write("    <li>도서상품권 결제사용</li>\r\n");
      out.write("    <li class=\"checkcss\">\r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"pb_bv\" value=\"Y\"> 사용</label></em> \r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"pb_bv\" value=\"N\" checked> 미사용</label></em> ※ 도서상품권 결제만 적용이 되며, 그 외에 상품권은 결제 되지 않습니다.\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form2\">\r\n");
      out.write("    <li>결제 최소 포인트</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" maxlength=\"5\" value=\"1000\" name=\"pb_min\"> 점\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>결제 최대 포인트</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" maxlength=\"5\" name=\"pb_max\"> 점\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form\">\r\n");
      out.write("    <li>현금 영수증 발급사용</li>\r\n");
      out.write("    <li class=\"checkcss\">\r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"pb_cash\" value=\"Y\"> 사용</label></em> \r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"pb_cash\" value=\"N\" checked> 미사용</label></em> ※ 현금영수증 관련 사항은 PG사 가입이 되었을 경우 사용가능 합니다.\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form2\">\r\n");
      out.write("    <li>배송업체명</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" name=\"de_name\"> \r\n");
      out.write("    </li>\r\n");
      out.write("    <li>배송비 가격</li>\r\n");
      out.write("    <li>\r\n");
      out.write("        <input type=\"text\" class=\"in_form0\" maxlength=\"7\" name=\"de_price\"> 원\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"info_form\" style=\"border-bottom:1px solid rgb(81, 61, 61);\">\r\n");
      out.write("    <li>희망배송일</li>\r\n");
      out.write("    <li class=\"checkcss\">\r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"de_date\" value=\"Y\"> 사용</label></em> \r\n");
      out.write("        <em><label><input type=\"radio\" class=\"ckclass\" name=\"de_date\" value=\"N\" checked> 미사용</label></em> ※ 희망배송일 사용시 사용자가 직접 설정 할 수 있습니다.\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"btn_div\">\r\n");
      out.write("    <button type=\"button\" class=\"sub_btn1\" title=\"설정 저장\" id=\"set_save\">설정 저장</button>\r\n");
      out.write("    <button type=\"button\" class=\"sub_btn2\" title=\"저장 취소\" id=\"set_cancle\">저장 취소</button>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</section>\r\n");
      out.write("<section></section>\r\n");
      out.write("<section></section>\r\n");
      out.write("</main>\r\n");
      out.write("<script type=\"module\">\r\n");
      out.write("import {homeset}from \"./js/adset.js\";\r\n");
      out.write("\r\n");
      out.write("document.querySelector(\"#set_save\").addEventListener(\"click\",function(){\r\n");
      out.write("new homeset().save();\r\n");
      out.write("});\r\n");
      out.write("document.querySelector(\"#set_cancle\").addEventListener(\"click\",function(){\r\n");
      out.write("new homeset().cancle();\r\n");
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
