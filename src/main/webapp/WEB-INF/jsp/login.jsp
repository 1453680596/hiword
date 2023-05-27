<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>客户管理系统</title>
    <style>
        .form-group {
            margin-bottom: 1rem;
        }

        .error-message {
            color: red;
            font-size: 0.8rem;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 80vh;
        }
    </style>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/login">
    <h1>客户管理系统</h1>
    <div class="form-group">
        <label for="username">账号:</label>
        <input type="text" id="username" name="username" value="${user.username}">
    </div>
    <div class="form-group">
        <label for="password">密码:</label>
        <input type="password" id="password" name="password">
    </div>
    <div class="form-group">
        <button type="submit" style="margin-right: 10px">登录</button>
        <button type="button" style="margin-left: 110px" onclick="location.href='${pageContext.request.contextPath}/index/toRegister'">注册
        </button>
    </div>
    <c:if test="${not empty errormsg}">
        <div class="error-message">${errormsg}</div>
    </c:if>
</form>
</body>
</html>