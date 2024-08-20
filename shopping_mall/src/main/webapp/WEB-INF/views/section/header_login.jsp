<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header class="headercss">
    <div class="header_div">
        <p><img src="./img/logo.png" class="logo_sm"> ADMINISTRATOR</p>
        <p>
        <%
        String adname=(String)session.getAttribute("adname");
        if(session==null||adname==null){
        %>
        
        	<script>
        	alert('로그인을 해야 이용가능합니다.');
        	window.location.href="./";
        	</script>
        
        <%
        }
        %>
        <%=adname %> 관리자 <a href="#">[개인정보 수정]</a> <a href="./admin_logout.do">[로그아웃]</a></p>
    </div>
</header>
<%
String adid=(String)session.getAttribute("adid");
String adYN=(String)session.getAttribute("adYN");
%>
<nav class="navcss">
    <div class="nav_div">
        <ol>
        	<%if("master".equals(adid)){ %>
            <li title="쇼핑몰 상품관리"><a href="./admin_list.do">쇼핑몰 관리자 리스트</a></li>
            <%}%>
            <%if(adid !=null){ %>
            <li title="쇼핑몰 회원관리"><a href="./shop_member_list.do">쇼핑몰 회원관리</a></li>
            <li title="쇼핑몰 상품관리"><a href="./product_list.do">쇼핑몰 상품관리</a></li>
			<li title="쇼핑몰 기본설정"><a href="./admin_siteinfo.do">쇼핑몰 기본설정</a></li>
            <li title="쇼핑몰 공지사항"><a href="./notice_list.do">쇼핑몰 공지사항</a></li>
            <%} %>
        </ol>
    </div>
</nav>