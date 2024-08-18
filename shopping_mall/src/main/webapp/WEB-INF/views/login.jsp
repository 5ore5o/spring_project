<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Date today = new Date(); %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <title>Shop Bag</title>
    <meta charset="utf-8" />
    <link href="./index.css?v=<%=today%>" rel="stylesheet" />
    <link href="./subpage.css?v=<%=today%>" rel="stylesheet" />
  </head>
<body>
<!-- 상단 시작 -->
<%@include file="./header_mall.jsp" %>
<!-- 상단 끝 -->
<!-- 중단 시작 -->
<%@include file="./mall_login.jsp" %>
<!-- 중단 끝 -->
<!-- 푸터 시작 -->
<%@include file="./footer_mall.jsp" %>
<!-- 푸터 끝 -->
</body>
</html>