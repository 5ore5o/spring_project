/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2024-08-16 07:49:45 UTC
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

public final class cate_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/./footer_login.jsp", Long.valueOf(1722410901066L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1720402943772L));
    _jspx_dependants.put("/WEB-INF/views/./header_login.jsp", Long.valueOf(1722842928311L));
    _jspx_dependants.put("/WEB-INF/views/./cate_li.jsp", Long.valueOf(1723794554973L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcr_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcr_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fcr_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcr_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcr_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fcr_005fif_0026_005ftest.release();
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
      out.write("<main class=\"maincss\">\r\n");
      out.write("    <section>    \r\n");
      out.write("<p>카테고리관리 페이지</p>\r\n");
      out.write("<div class=\"subpage_view\">\r\n");
      out.write("    <span>등록된 카테고리 0건</span>\r\n");
      out.write("    <span>\r\n");
      out.write("        <form>\r\n");
      out.write("        <select class=\"p_select1\">\r\n");
      out.write("            <option>카테고리명</option>\r\n");
      out.write("            <option>카테고리코드</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <input type=\"text\" class=\"p_input1\" placeholder=\"검색어를 입력해 주세요\">\r\n");
      out.write("        <input type=\"submit\" value=\"검색\" title=\"카테고리 검색\" class=\"p_submit\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </span>\r\n");
      out.write("</div>\r\n");
      out.write("<form id=\"cateset_frm\">\r\n");
      out.write("<div class=\"subpage_view2\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><input type=\"checkbox\" id=\"cackall\"></li>\r\n");
      out.write("        <li>분류코드</li>\r\n");
      out.write("        <li>대메뉴 코드</li>\r\n");
      out.write("        <li>대메뉴명</li>\r\n");
      out.write("        <li>소메뉴 코드(사용안함)</li>\r\n");
      out.write("        <li>소메뉴명(사용안함)</li>\r\n");
      out.write("        <li>사용 유/무</li>\r\n");
      out.write("        <li>관리</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    ");
      if (_jspx_meth_cr_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_cr_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"subpage_view3\">\r\n");
      out.write("    <ul class=\"pageing\">\r\n");
      out.write("        <li><img src=\"./ico/double_left.svg\"></li>\r\n");
      out.write("        <li><img src=\"./ico/left.svg\"></li>\r\n");
      out.write("        <li>1</li>\r\n");
      out.write("        <li><img src=\"./ico/right.svg\"></li>\r\n");
      out.write("        <li><img src=\"./ico/double_right.svg\"></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"subpage_view4\">\r\n");
      out.write("    <input type=\"button\" value=\"카테고리 삭제\" title=\"카테고리 삭제\" class=\"p_button\" id=\"cadel\">\r\n");
      out.write("    <span style=\"float: right;\">\r\n");
      out.write("    <input type=\"button\" value=\"상품 리스트\" title=\"상품 리스트\" class=\"p_button p_button_color1\">\r\n");
      out.write("    <input type=\"button\" value=\"카테고리 등록\" title=\"카테고리 등록\" class=\"p_button p_button_color2\" id=\"ca_set\">\r\n");
      out.write("    </span>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</section>\r\n");
      out.write("</main>\r\n");
      out.write("<script>\r\n");
      out.write("var ca_idx= document.getElementsByName(\"ca_idx\");\r\n");
      out.write("var cackall= document.getElementById(\"cackall\");\r\n");
      out.write("function each_cack(z){\r\n");
      out.write("if(!z.checked){\r\n");
      out.write("\tcackall.checked=false;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
 Date catoday=new Date(); 
      out.write("\r\n");
      out.write("<script type=\"module\">\r\n");
      out.write("import {caset}from \"./js/pd_ca.js?v=");
      out.print(catoday);
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("document.querySelector(\"#ca_set\").addEventListener(\"click\",function(){\r\n");
      out.write("new caset().cateset();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("document.querySelector(\"#cadel\").addEventListener(\"click\",function(){\r\n");
      out.write("new caset().ca_del();\r\n");
      out.write("});\r\n");
      out.write("document.querySelector(\"#cackall\").addEventListener(\"click\",function(){\r\n");
      out.write("new caset().cack_all();\r\n");
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

  private boolean _jspx_meth_cr_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cr:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_cr_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fcr_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_cr_005fforEach_005f0_reused = false;
    try {
      _jspx_th_cr_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cr_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/./cate_li.jsp(51,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cr_005fforEach_005f0.setVar("cateli");
      // /WEB-INF/views/./cate_li.jsp(51,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_cr_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/./cate_li.jsp(51,4) '${cateli}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${cateli}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_cr_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_cr_005fforEach_005f0 = _jspx_th_cr_005fforEach_005f0.doStartTag();
        if (_jspx_eval_cr_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("    <ul>\r\n");
            out.write("        <li><input type=\"checkbox\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cateli.ca_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" name=\"ca_idx\" onclick=\"each_cack(this)\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cateli.ca_idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</li>\r\n");
            out.write("        <li style=\"text-align: left; text-indent: 5px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cateli.cacode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</li>\r\n");
            out.write("        <li>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cateli.lcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</li>\r\n");
            out.write("        <li style=\"text-align: left; text-indent: 5px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cateli.lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</li>\r\n");
            out.write("        <li>-</li>\r\n");
            out.write("        <li style=\"text-align: left; text-indent: 5px;\">-</li>\r\n");
            out.write("        <li>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cateli.ca_use}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</li>\r\n");
            out.write("        <li>[수정]</li>\r\n");
            out.write("    </ul>\r\n");
            out.write("   ");
            int evalDoAfterBody = _jspx_th_cr_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_cr_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_cr_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_cr_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_cr_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fcr_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_cr_005fforEach_005f0);
      _jspx_th_cr_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_cr_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_cr_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_cr_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cr:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_cr_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcr_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_cr_005fif_005f0_reused = false;
    try {
      _jspx_th_cr_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cr_005fif_005f0.setParent(null);
      // /WEB-INF/views/./cate_li.jsp(63,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cr_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cateli==null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_cr_005fif_005f0 = _jspx_th_cr_005fif_005f0.doStartTag();
      if (_jspx_eval_cr_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <ul>\r\n");
          out.write("        <li style=\"width: 100%;\">등록된 카테고리가 없습니다.</li>\r\n");
          out.write("    </ul>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_cr_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_cr_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fcr_005fif_0026_005ftest.reuse(_jspx_th_cr_005fif_005f0);
      _jspx_th_cr_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_cr_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_cr_005fif_005f0_reused);
    }
    return false;
  }
}
