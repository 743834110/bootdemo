<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/27
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring Boot jsp测试页面</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="alert alert-success text-center" role="alert">Sptring Boot学习资源大奉送，爱我就关注嘟嘟公众号：嘟爷java超神学堂</div>
    <table class="table table-striped table-bordered">
        <tr>
            <td>作者</td>
            <td>教程名称</td>
            <td>地址</td>
        </tr>
        <c:forEach var="learn" items="${learnList}">
            <tr class="text-info">
                <td th:text="">${learn.author}</td>
                <td th:text="${learn.title}">${learn.title}</td>
                <td><a href="${learn.url}" th:href="${learn.url}" class="btn btn-search btn-green" target="_blank"><span>点我</span></a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
