<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>客户信息管理系统</title>
</head>
<body>
<!-- 导航栏 -->
<%@ include file="navbar.jsp" %>
<!-- 主要内容区域 -->
<div class="container-fluid mt-3">
    <div class="jumbotron" style="position: relative;height: 90vh;">
        <h2>你好，${username}</h2>
        <h1 class="display-4">欢迎使用客户管理系统！</h1>
        <p class="lead">请在上方单中选择需要管理的内容。</p>
        <hr class="my-4">
        <div class="bottom" style="position: absolute;bottom: 0;width: 100%;  text-align: center ">
            <p>如果您有任何问题或建议，请联系我们。</p>
        </div>
    </div>
</div>

</body>
</html>