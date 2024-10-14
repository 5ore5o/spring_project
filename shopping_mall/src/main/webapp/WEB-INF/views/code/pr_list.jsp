<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<main class="maincss">
<section>
<p>상품관리 페이지</p>
<div class="subpage_view">
    <cr:if test="${empty productlist}">
    <span>등록된 상품 0건</span>
    </cr:if>
        <form id="pdsearch_frm">
    <span>
        <select class="p_select1" name="search_pdpart">
            <option value="1">상품명</option>
            <option value="2">상품코드</option>
        </select>
        <input type="text" name="search_pdword" value="${search_pdword}" class="p_input1" placeholder="검색어를 입력해 주세요">
        <input type="submit" value="검색" title="상품검색" class="p_submit" id="pdsearch">
    </span>
        </form>
</div>
<form id="pdset_frm">
<div class="subpage_view2">
    <ul>
        <li><input type="checkbox" id="pdall"></li>
        <li>코드</li>
        <li>이미지</li>
        <li>상품명</li>
        <li>카테고리 분류</li>
        <li>판매가격</li>
        <li>할인가격</li>
        <li>할인율</li>
        <li>재고현황</li>
        <li>판매유/무</li>
        <li>품절</li>
        <li>관리</li>
    </ul>
    <cr:forEach var="pdli" items="${productlist}">
    <ul>
        <li><input type="checkbox" value="${pdli.pd_idx}" name="pd_idx"></li>
        <li>${pdli.pd_code}</li>
        <li>${pdli.pdfile}</li>
        <li>${pdli.pd_name}</li>
        <li>${pdli.pd_lname}</li>
        <li>${pdli.pd_cash}</li>
        <li>${pdli.pd_dcp}</li>
        <li>${pdli.pd_dcr}</li>
        <li>${pdli.pd_ea}</li>
        <li>${pdli.pd_oyn}</li>
        <li>${pdli.pd_xyn}</li>
        <li>관리</li>
    </ul>
    </cr:forEach>
    <cr:if test="${empty productlist}">
    <ul>
        <li style="width: 100%;">등록된 상품이 없습니다.</li>
    </ul>
    </cr:if>
</div>
<div class="subpage_view3">
    <ul class="pageing">
        <li><img src="./ico/double_left.svg"></li>
        <li><img src="./ico/left.svg"></li>
        <li>1</li>
        <li><img src="./ico/right.svg"></li>
        <li><img src="./ico/double_right.svg"></li>
    </ul>
</div>
<div class="subpage_view4">
    <input type="button" value="선택상품 삭제" title="선택상품 삭제" class="p_button" id="pddel">
    <span style="float: right;">
    <input type="button" value="신규상품 등록" title="신규상품 등록" class="p_button p_button_color1" id="pd_wr">
    <input type="button" value="카테고리 등록" title="카테고리 등록" class="p_button p_button_color2" id="ca_li">
    </span>
</div>
</form>
</section>
</main>
<script type="module">
import {pdset}from "./js/pd_ca.js?v=3";

const pd_idx= document.getElementsByName("pd_idx");
const search_pdword= document.getElementsByName("search_pdword");

document.querySelector("#pd_wr").addEventListener("click",function(){
new pdset().pdwr();
});

document.querySelector("#ca_li").addEventListener("click",function(){
new pdset().cali();
});

document.querySelector("#pdsearch").addEventListener("click",function(event){
new pdset().productsearch(search_pdword);
});

document.querySelector("#pddel").addEventListener("click",function(){
new pdset().pd_del(pd_idx);
});

document.querySelector("#pdall").addEventListener("click",function(){
new pdset().pd_all(pd_idx);
});
document.querySelectorAll("[name='pd_idx']").forEach(function(pdbox){pdbox.addEventListener("click",function(){
new pdset().each_pdck(pdbox ,pd_idx);
});
});

</script>