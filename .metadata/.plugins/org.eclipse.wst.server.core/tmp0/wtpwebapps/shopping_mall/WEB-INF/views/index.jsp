<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Date intoday=new Date(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지</title>
    <link rel="stylesheet" type="text/css" href="./css/basic.css">
    <link rel="stylesheet" type="text/css" href="./css/mainlogin.css?v=<%=intoday %>">
    <link rel="icon" href="./img/logo.png" sizes="128x128">
    <link rel="icon" href="./img/logo.png" sizes="64x64">
    <link rel="icon" href="./img/logo.png" sizes="32x32">
    <link rel="icon" href="./img/logo.png" sizes="16x16">
<script src="./js/jquery.js?v=<%=intoday %>"></script>
</head>
<body>
<!-- 상단 시작 -->
<%@include file="./section/header.jsp" %>
<!-- 상단 끝 -->
<!-- 중단 시작 -->
<%@include file="./code/add_index.jsp" %>
<!-- 중단 끝 -->
<!-- 푸터 시작 -->
<%@include file="./section/footer.jsp" %>
<!-- 푸터 끝 -->
</body>
</html>