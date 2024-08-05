<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String adid=(String)session.getAttribute("adid");
%>
<nav class="navcss">
    <div class="nav_div">
        <ol>
        	<%if(adid.equals("master")&&adid!=null){ %>
            <li title="쇼핑몰 상품관리">쇼핑몰 관리자 리스트</li>
            <%}%>
            <li title="쇼핑몰 회원관리">쇼핑몰 회원관리</li>
            <li title="쇼핑몰 상품관리">쇼핑몰 상품관리</li>
            <li title="쇼핑몰 기본설정">쇼핑몰 기본설정</li>
            <li title="쇼핑몰 공지사항">쇼핑몰 공지사항</li>
        </ol>
    </div>

</nav>
<main class="maincss">
<section>
    <p>신규등록 관리자</p>
    <ol class="new_admin_title2">
        <li>NO</li>
        <li>관리자명</li>
        <li>아이디</li>
        <li>전화번호</li>
        <li>이메일</li>
        <li>담당부서</li>
        <li>담당직책</li>
        <li>가입일자</li>
        <li>승인여부</li>
    </ol>
    <cr:if test="${adin_data==null}">
    <ol class="new_admin_none">
        <li>신규 등록된 관리자가 없습니다.</li>
    </ol>
    </cr:if>
    <cr:forEach var="listdata" items="${adin_data}">
    <ol class="new_admin_lists2">
        <li>${listdata.adidx}</li>
        <li>${listdata.adname}</li>
        <li>${listdata.adid}</li>
        <li>${listdata.adnum1}${listdata.adnum2}${listdata.adnum3}</li>
        <li>${listdata.ademail}</li>
        <li>${listdata.addepart}</li>
        <li>${listdata.adposition}</li>
        <li>2024-07-29</li>
        <li>
     	<cr:if test="${listdata.adYN!=null&&listdata.adYN=='Y'}">
            <input type="button" value="승인" class="new_addbtn1" title="승인" onclick="adok()">
        </cr:if>
     	<cr:if test="${listdata.adYN!=null&&listdata.adYN=='N'}">
            <input type="button" value="미승인" class="new_addbtn2" title="미승인" onclick="adno()">
        </cr:if>
        </li>
    </ol>
    </cr:forEach>
</section>
<section></section>
<section></section>
</main>
<script>


</script>