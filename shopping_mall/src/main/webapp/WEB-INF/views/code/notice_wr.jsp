<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String noticeadname = (String)session.getAttribute("adname");
	if (noticeadname == null) {
%>
	 <script>
        alert('로그인을 해야 이용가능합니다.');
        window.location.href="./";
     </script>
<% } %>        

<main class="maincss">
<section>
    <p>공지사항 등록페이지</p>
<div class="write_view">
<ul>
    <li>공지사항 여부</li>
    <li>
        <label class="label_notice"><em class="cbox"><input type="checkbox" name="noYN" value="1" ></em> 공지 출력</label> ※ 공지출력을 체크할 시 해당 글 내용은 최상단에 노출 되어 집니다.
    </li>
</ul>
<ul>
    <li>공지사항 제목</li>
    <li>
        <input type="text" class="notice_input1" name="notitle"> ※ 최대 150자까지 입력이 가능
    </li>
</ul>
<ul>
    <li>글쓴이</li>
    <li>
        <input type="text" class="notice_input2" name="adname" value="<%= noticeadname%>" readonly> ※ 관리자 이름이 노출 됩니다.       
    </li>
</ul>
<ul>
    <li>첨부파일</li>
    <li>
        <input type="file" name="nofile"> ※ 첨부파일 최대 용량은 2MB 입니다.       
    </li>
</ul>
<ul class="ul_height">
    <li>공지내용</li>
    <li>
        <textarea class="notice_input3" name="noinfo" placeholder="공지내용을 입력하세요!"></textarea>
    </li>
</ul>
</div>
<div class="board_btn">
    <button class="border_del" id="wrNoticelist">공지목록</button>
    <button class="border_add" id="wrNoticesave">공지등록</button>
</div>
</section>
</main>
<script type="module">
import {noset}from "./js/notice.js";

document.querySelector("#wrNoticelist").addEventListener("click",function(){
new noset().backnoticelist();
});

document.querySelector("#wrNoticesave").addEventListener("click",function(){
new noset().savenotice();
});
</script>