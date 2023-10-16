<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- navbar.jsp -->
<!-- 引入Bootstrap框架 -->
<link rel="stylesheet" href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item ">
                <a class="nav-link" type="button" onclick="location.href='${pageContext.request.contextPath}/index/toGuide'">首页</a>
            </li>
            <li class="nav-item">
                <a class="nav-link"  type="button" onclick="location.href='${pageContext.request.contextPath}/basicinfo/toSelect'">客户基本管理</a>
            </li>
            <li class="nav-item">
                <a class="nav-link"  type="button" onclick="location.href='${pageContext.request.contextPath}/consumptioninfo/toSelect'">客户车辆管理</a>
            </li>
            <li class="nav-item">
                <a class="nav-link"  type="button" onclick="location.href='${pageContext.request.contextPath}/feedback/toSelect'">客户留言反馈管理</a>
            </li>
            <li class="nav-item">
                <a class="nav-link"  type="button" onclick="location.href='${pageContext.request.contextPath}/maintain/toSelect'">维护功能管理</a>
            </li>
            <li class="nav-item" style="position: absolute;right: 20px">
                <a class="nav-link"   type="button" onclick="location.href='${pageContext.request.contextPath}/index/toLogin'">登出</a>
            </li>
        </ul>
    </div>
</nav>

<!-- 引入Bootstrap框架的JavaScript文件 -->
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.bootcdn.net/ajax/libs/popper.js/2.9.3/umd/popper.min.js"></script>
<script src="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>