<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<main class="maincss">
    <section>    
<p>카테고리관리 페이지</p>
<div class="subpage_view">
	<cr:if test="${empty caresult}">
    <span>등록된 카테고리 0건</span>
    </cr:if>    
        <form id="casearch_frm">
    <span>
        <select class="p_select1" name="search_catepart">
            <option value="1">카테고리명</option>
            <option value="2">카테고리코드</option>
        </select>
        <input type="text" name="search_cateword" value="${search_cateword}" class="p_input1" placeholder="검색어를 입력해 주세요">
        <input type="submit" value="검색" title="카테고리 검색" class="p_submit" id="catesearch">
    </span>
        </form>
</div>
<form id="cateset_frm">
<div class="subpage_view2">
    <ul>
        <li><input type="checkbox" id="cackall"></li>
        <li>분류코드</li>
        <li>대메뉴 코드</li>
        <li>대메뉴명</li>
        <li>소메뉴 코드(사용안함)</li>
        <li>소메뉴명(사용안함)</li>
        <li>사용 유/무</li>
        <li>관리</li>
    </ul>
    <cr:forEach var="cateli" items="${caresult}">
    <ul>
        <li><input type="checkbox" value="${cateli.ca_idx}" name="ca_idx"></li>
        <li style="text-align: left; text-indent: 5px;">${cateli.cacode}</li>
        <li>${cateli.lcode}</li>
        <li style="text-align: left; text-indent: 5px;">${cateli.lname}</li>
        <li>-</li>
        <li style="text-align: left; text-indent: 5px;">-</li>
        <li>${cateli.ca_use}</li>
        <li>[수정]</li>
    </ul>
   </cr:forEach>
    
    <cr:if test="${empty caresult}">
    <ul>
        <li style="width: 100%;">등록된 카테고리가 없습니다.</li>
    </ul>
    </cr:if>
    
</div>
<div class="subpage_view3">
    <ul class="pageing">
        <li><img src="./ico/double_left.svg"></li>
        
        <li><a href="?page=${currentPage - 1}" 
        <cr:if test="${currentPage <= 1}">style="pointer-events: none; opacity: 0.5;"</cr:if>>
        <img src="./ico/left.svg" style="width: 20px; height: 20px;">
        </a></li>
        
        <cr:forEach var="i" begin="1" end="${totalPages}">
            <li>
                <a href="?page=${i}" <cr:if test="${i == currentPage}" >style="font-weight: bold; color:black; width: 20px; height: 20px;"</cr:if>>${i}</a> <!-- 현재 페이지는 강조 -->
            </li>
        </cr:forEach>
        
        <li><a href="?page=${currentPage + 1}" 
        <cr:if test="${currentPage >= totalPages}">style="pointer-events: none; opacity: 0.5;"</cr:if>>
        <img src="./ico/right.svg" style="width: 20px; height: 20px;">
        </a></li>
        
        <li><img src="./ico/double_right.svg"></li>
    </ul>
</div>
<div class="subpage_view4">
    <input type="button" value="카테고리 삭제" title="카테고리 삭제" class="p_button" id="cadel">
    <span style="float: right;">
    <input type="button" value="상품 리스트" title="상품 리스트" class="p_button p_button_color1" id="cago_pd">
    <input type="button" value="카테고리 등록" title="카테고리 등록" class="p_button p_button_color2" id="ca_set">
    </span>
</div>
</form>
</section>
</main>
<script type="module">
import {caset}from "./js/pd_ca.js?v=2";

const ca_idx= document.getElementsByName("ca_idx");
const search_cateword= document.getElementsByName("search_cateword");

document.querySelector("#catesearch").addEventListener("click",function(){
new caset().casearch(search_cateword);
});
document.querySelector("#ca_set").addEventListener("click",function(){
new caset().cateset();
});
document.querySelector("#cago_pd").addEventListener("click",function(){
new caset().cagopd();
});

document.querySelector("#cadel").addEventListener("click",function(){
new caset().ca_del(ca_idx);
});
document.querySelector("#cackall").addEventListener("click",function(){
new caset().cack_all(ca_idx);
});
document.querySelectorAll("[name='ca_idx']").forEach(function(ckbox){ckbox.addEventListener("click",function(){
new caset().each_cack(ckbox ,ca_idx);
});
});

</script>