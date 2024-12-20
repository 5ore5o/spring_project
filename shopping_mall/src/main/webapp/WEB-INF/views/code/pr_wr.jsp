<%@page import="java.util.Random"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<%
Random rd= new Random();
String pd_code="";
int w=0;
while(w<7){
	pd_code+=rd.nextInt(10);
	w++;
}
request.setAttribute("pd_code", pd_code);
%>
<main class="maincss">
<section>
<p>상품 등록 페이지</p>
<form id="pd_frm" enctype="multipart/form-data">
<div class="product_insert">
    <ul>
        <li>대메뉴 카테고리</li>
        <li>
            <select class="product_input1" name="pd_lname">
            <cr:forEach var="lnameli" items="${lnameli}">
                <option value="${lnameli}">${lnameli}</option>
            </cr:forEach>    
            </select><input type="button" value="카테고리 등록" title="카테고리 등록" class="product_btn" id="pdcate"> <span class="help_text">※ 해당 카테고리가 없을 경우 신규 등록하시길 바랍니다.</span>
        </li>
    </ul>
    <ul>
        <li>상품코드</li>
        <li>
            <input type="text" class="product_input1" name="pd_code" value="<%=pd_code%>" readonly>
            <input type="button" value="중복확인" title="중복확인" class="product_btn" id="pdcode_dupli"> <span class="help_text">※ 상품코드는 절대 중복되지 않도록 합니다.</span>
        </li>
    </ul>
    <ul>
        <li>상품명</li>
        <li>
            <input type="text" class="product_input2" maxlength="100" name="pd_name"> <span class="help_text">※ 상품명은 최대 100자까지만 적용할 수 있습니다.</span>
        </li>
    </ul>
    <ul>
        <li>상품 부가설명</li>
        <li>
            <input type="text" class="product_input4" maxlength="200" name="pd_addinfo"> <span class="help_text">※ 상품명은 최대 200자까지만 적용할 수 있습니다.</span>
        </li>
    </ul>
    <ul>
        <li>판매가격</li>
        <li>
            <input type="text" class="product_input3" maxlength="7" name="pd_cash" id="pd_cash"> <span class="help_text">※ , 없이 숫자만 입력하세요 최대 7자리</span>
        </li>
    </ul>
    <ul>
        <li>할인율</li>
        <li>
            <input type="text" class="product_input3" maxlength="2" value="0" name="pd_dcr" id="pd_dcr">% <span class="help_text">※ 숫자만 입력하세요</span>
        </li>
    </ul>
    <ul>
        <li>할인가격</li>
        <li>
            <input type="text" class="product_input3" maxlength="7" value="0" name="pd_dcp" id="pd_dcp" readonly> <span class="help_text">※ 할인율이 0%일 경우 할인가격은 0으로 처리 합니다.</span>
        </li>
    </ul>
    <ul>
        <li>상품재고</li>
        <li>
            <input type="text" class="product_input3" maxlength="4" value="0" name="pd_ea">EA <span class="help_text">※ 숫자만 입력하세요. 재고가 0일 경우 soldout이 됩니다.</span>
        </li>
    </ul>
    <ul>
        <li>판매 유/무</li>
        <li>
            <label class="product_label">
            <input type="radio" name="pd_oyn" value="Y" style="vertical-align:-1px;" checked> 판매시작
            </label>
            <label class="product_label">
            <input type="radio" name="pd_oyn" value="N" style="vertical-align:-1px;"> 판매종료
            </label> <span class="help_text">※ 숫자만 입력하세요. 재고가 0일 경우 soldout이 됩니다.</span>
        </li>
    </ul>
    <ul>
        <li>조기품절</li>
        <li>
            <label class="product_label">
                <input type="radio" name="pd_xyn" value="Y" style="vertical-align:-1px;"> 사용
            </label>
            <label class="product_label">
                <input type="radio" name="pd_xyn" value="N" style="vertical-align:-1px;" checked> 미사용
            </label>
        </li>
    </ul>
    <ul style="height: 160px;">
        <li>상품 대표이미지</li>
        <li>
            <ol style="width:100%; height: auto;">
            <li style="width:100%; height:45px;">
            <input type="file" name="pdfile">
            <span class="help_text">※ 상품 대표이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>
            </li>
            <li style="height:45px;">
            <input type="file" name="pdfile">
            <span class="help_text">※ 추가 이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>
            </li>
            <li style="height:45px;">
            <input type="file" name="pdfile">
            <span class="help_text">※ 추가 이미지 이며, 이미지 용량은 2MB 까지 입니다.</span>
            </li>
            </ol>
        </li>
    </ul>
    <ul style="height: 400px;">
        <li>상품 상세설명</li>
        <li>
            <textarea class="product_text1" name="pd_info"></textarea>
        </li>
    </ul>
</div>
</form>
<div class="subpage_view4" style=" text-align:center; margin-bottom: 100px;">
    <input type="button" value="상품 리스트" title="상품 리스트" class="p_button p_button_color1" style="margin-right: 5px;" id="backlist">
    <input type="button" value="상품 등록" title="상품 등록" class="p_button p_button_color2" id="prin">
</div>
</section>
</main>
<script type="module">
import {pdset}from "./js/pd_ca.js?v=1";

document.querySelector("#pdcate").addEventListener("click",function(){
new pdset().pdcate();
});
document.querySelector("#backlist").addEventListener("click",function(){
new pdset().back();
});
document.querySelector("#prin").addEventListener("click",function(){
new pdset().productin();
});

const calDcPrice=()=>{
const pd_cash= parseInt(document.getElementById("pd_cash").value);
const pd_dcr= parseInt(document.getElementById("pd_dcr").value);

const pd_dcp= document.getElementById("pd_dcp");

if(pd_dcr==0){
pd_dcp.value=0;
}else{
let cal_dcp= pd_cash-(pd_cash*(pd_dcr/100));

if(cal_dcp % 1 == 0.5){
cal_dcp=Math.floor(cal_dcp);
}else{
cal_dcp=Math.round(cal_dcp);
}

pd_dcp.value=cal_dcp;

}
};

document.getElementById("pd_cash").addEventListener("input", calDcPrice);
document.getElementById("pd_dcr").addEventListener("input",calDcPrice);

</script>