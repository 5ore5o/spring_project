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