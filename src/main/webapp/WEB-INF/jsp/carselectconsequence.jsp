<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.mycom.myapp.pojo.CustomerCar" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>客户车辆管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <style type="text/css">
        table {
            border-collapse: collapse;
            width: 100%;
            margin: 0 auto;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 0.5em;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #f5f5f5;
        }

        body {
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
        }

        .top {
            height: 35%;
            background-color: #f2f2f2;
        }

        .bottom {
            height: 80%;
            background-color: #d9d9d9;
        }

        .button {
            width: 100px;
            margin-top: 10px;
            margin-bottom: 20px;
            margin-left: 50px;
            margin-right: 50px;
            background: gainsboro;
        }

        .search-table {
            text-align: center;
        }
    </style>
</head>
<body>
<!-- 导航栏 -->
<%@ include file="navbar.jsp" %>
<div class="top">
    <table>
        <tr>
            <form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/consumptioninfo/select">
                <h1 style="text-align: center">客户-车辆信息</h1>
                <table class="search-table">
                    <label for="name">客户姓名:</label>
                    <input type="text" id="name" name="name" value="${name}">
                    <label for="cartype">车辆类型:</label>
                    <input type="text" id="cartype" name="cartype" value="${cartype}">
                    <label for="cartype">车牌号:</label>
                    <input type="text" id="carnumber" name="carnumber" value="${carnumber}">
                </table>
                <table>
                    <input class="button" type="submit" value="搜索">
                    <input class="button" type="submit" value="重置">
                </table>
                <p style="color:red">${errormsg}</p >
            </form>
        </tr>
    </table>
</div>
<div class="bottom">
    <button onclick="location.href='${pageContext.request.contextPath}/consumptioninfo/toInsert'">新增客户车辆信息</button>
    <table>
        <thead>
        <tr>
            <th><input type="checkbox" id="selectAll"></th>
            <th>客户姓名</th>
            <th>车辆类型</th>
            <th>车牌号</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerCarList}" var="customerCar">
            <tr>
                <td colspan="1">
                    <input type="checkbox" name="selectedIds" class="rowCheckbox" data-id="${customerCar.id}">
                </td>
                <td>
                    <span class="text-field" name="name" value="${customerCar.name}">${customerCar.name}</span>
                </td>
                <td>
                    <span class="text-field" name="sex" value="${customerCar.cartype}">${customerCar.cartype}</span>
                </td>
                <td>
                    <span class="text-field" name="carnumber" value="${customerCar.carnumber}">${customerCar.carnumber}</span>
                </td>
                <td colspan="2">
                    <form action="toUpdate" method="post" style="display: inline-block">
                        <input type="hidden" name="id" value="${customerCar.id}">
                        <input type="submit" value="更新" style="display: inline-block">
                    </form>
                    <form action="delete" method="post" style="display: inline-block">
                        <input type="hidden" name="id" value="${customerCar.id}">
                        <input type="submit" value="删除">
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


</body>
</html>
