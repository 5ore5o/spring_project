<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
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
    
    <cr:forEach var="listdata" items="${adin_data}" varStatus="status">
     <form id="adminfrm${status.index}">
        <input type="hidden" name="adYN" value="${listdata.adYN}">
        <input type="hidden" name="adidx" value="${listdata.adidx}">
    <ol class="new_admin_lists2">
        <li>${listdata.adidx}</li>
        <li>${listdata.adname}</li>
        <li>${listdata.adid}</li>
        <li>${listdata.adnum1}${listdata.adnum2}${listdata.adnum3}</li>
        <li>${listdata.ademail}</li>
        <li>${listdata.addepart}</li>
        <li>${listdata.adposition}</li>
        <li>${listdata.addate}</li>
        <li>
     	<cr:if test="${listdata.adYN!=null&&listdata.adYN.equals('미승인')}">
            <input type="button" value="승인" class="new_addbtn1" title="승인" onclick="adok('${status.index}')">
        </cr:if>
     	<cr:if test="${listdata.adYN!=null&&listdata.adYN.equals('승인')}">
            <input type="button" value="미승인" class="new_addbtn2" title="미승인" onclick="adno('${status.index}')">
        </cr:if>
        </li>
    </ol>
    </form>
    </cr:forEach>
</section>
<section></section>
<section></section>
</main>
<script>
function adok(index){
	var form=document.getElementById("adminfrm"+index);
	if(confirm("관리자 승인을 진행 하시겠습니까?")){
		alert("관리자 승인되었습니다.");
		form.method="post";
		form.action="./YN_up.do";
		form.submit();
		}else{
			alert("승인이 취소되었습니다.");
		}
}
function adno(index){
	var form=document.getElementById("adminfrm"+index);
	if(confirm("관리자 승인해제 하시겠습니까?")){
		alert("승인해제 되었습니다.");
		form.method="post";
		form.action="./YN_up.do";
		form.submit();
		}else{
			alert("해제가 취소되었습니다.");
		}
}
</script>