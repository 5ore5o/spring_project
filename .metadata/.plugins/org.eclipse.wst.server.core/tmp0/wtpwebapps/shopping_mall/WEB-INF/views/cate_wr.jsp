<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
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
<main class="maincss">
<section>
    <p>카테고리 등록 페이지</p>
    <form id="cawr_frm">
    <input type="hidden" name="ca_idx">
    <div class="cate_insert">
        <ul>
            <li>분류코드</li>
            <li><input type="text" class="cate_input1" name="cacode"></li>
            <li>※ 분류코드는 대메뉴 코드와 소메뉴 코드를 합쳐서 자동 입력 됩니다.</li>
        </ul>
        <ul>
            <li>대메뉴 코드</li>
            <li>
                <input type="text" class="cate_input2" list="lg_menu" name="lcode">
                <datalist id="lg_menu">
                    <option>01</option>
                    <option>02</option>
                </datalist>
            </li>
            <li>※ 대메뉴에 사용할 코드 번호를 입력하세요 최소 2자 이상의 숫자로 입력하셔야 합니다.</li>
        </ul>
        <ul>
            <li>대메뉴명</li>
            <li><input type="text" class="cate_input3" name="lname"> <label><!--<input type="checkbox" style="margin-left:10px; margin-right: 5px;">대메뉴만 생성</label>--></li>
            <li>※ 소메뉴만 등록시 대메뉴 코드와 대메뉴명은 무조건 입력 되어야 합니다.</li>
        </ul>
        <ul>
            <li>소메뉴 코드(사용안함)</li>
            <li>

            </li>
            <li>※ 소메뉴에 사용할 코드 번호를 입력하세요 최소 2자 이상의 숫자로 입력하셔야 합니다.</li>
        </ul>
        <ul>
            <li>소메뉴명(사용안함)</li>
            <li></li>
            <li>※ 대메뉴만 등록시 소메뉴 코드 및 소메뉴명은 입력하지 않으셔도 됩니다.</li>
        </ul>
        <ul>
            <li>사용 유/무</li>
            <li>
                <label class="rmargin"><input type="radio" name="ca_use" checked>사용함 </label>
                <label class="rmargin"><input type="radio" name="ca_use">사용안함</label>
            </li>
            <li>※ 카테고리 사용안함으로 설정시 쇼핑몰에 해당 메뉴는 생성 되지 않습니다.</li>
        </ul>
    </div>
    </form>
    <div class="subpage_view4" style="text-align:center;">
        <input type="button" value="카테고리 리스트" title="카테고리 리스트" class="p_button p_button_color1" style="margin-right: 5px;" id="ca_list">
        <input type="button" value="카테고리 생성" title="카테고리 생성" class="p_button p_button_color2" id="cate_in">
    </div>
</section>
</main>
<% Date prtoday=new Date(); %>
<script type="module">
import {caset}from "./js/pd_ca.js?v=<%=prtoday%>";

document.querySelector("#ca_list").addEventListener("click",function(){
new caset().catelist();
});
document.querySelector("#cate_in").addEventListener("click",function(){
new caset().catein();
});
</script>