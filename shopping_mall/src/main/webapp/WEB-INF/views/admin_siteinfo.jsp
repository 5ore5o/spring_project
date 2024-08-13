<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Date today = new Date(); %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 등록 페이지</title>
    <link rel="stylesheet" type="text/css" href="./css/basic.css?v=1">
    <link rel="stylesheet" type="text/css" href="./css/login.css?v=<%=today %>">
    <link rel="stylesheet" type="text/css" href="./css/main.css">
    <link rel="stylesheet" type="text/css" href="./css/subpage.css?v=<%=today %>">
    <link rel="icon" href="./img/logo.png" sizes="128x128">
    <link rel="icon" href="./img/logo.png" sizes="64x64">
    <link rel="icon" href="./img/logo.png" sizes="32x32">
    <link rel="icon" href="./img/logo.png" sizes="16x16">
    <script src="./js/jquery.js?v=<%=today %>"></script>
</head>
<body>
<!-- 상단 시작 -->
<%@include file="./header_login.jsp" %>
<!-- 상단 끝 -->
<!-- 중단 시작 -->
<%@include file="./add_siteinfo.jsp" %>
<!-- 중단 끝 -->
<!-- 푸터 시작 -->
<%@include file="./footer_add.jsp" %>
<!-- 푸터 끝 -->
</body>
</html>