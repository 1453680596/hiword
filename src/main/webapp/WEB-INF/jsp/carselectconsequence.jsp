<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/26
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车辆查询结果</title>
</head>
<body>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
< 点击查找可查看所有车辆类型 >

<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/consumptioninfo/select">
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <tr>
            <td width="150" height="30" align="right" valign="middle" bgcolor="#FFFFFF">按车辆类型分类：</td>
            <td width="250" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="cartype" type="text" size="10" /></td>
        </tr>

        <tr>
            <td height="30" colspan="3" align="center" valign="middle" bgcolor="#FFFFFF">
                <input type="submit" name="button" id="button" value="查找" />&nbsp;&nbsp;
                <input type="reset" name="button2" id="button2" value="重置" />
            </td>
        </tr>
    </table>
    <label style="color: red">${errormsg}</label>
</form>

<table border="1" collspacing="0" collpadding="0" align="center">
    <tr>
        <th colspan="6">客户信息</th>
    </tr>
    <tr>
        <th>客户姓名</th>
        <th>车辆类型</th>
    </tr>


    <c:forEach items="${customerCarList}" var="customerCar">
        <tr align="center">
            <td> ${customerCar.name}</td>
            <td> ${customerCar.cartype}</td>
            <td>
                <input type="button" name="return"
                       onclick="window.location.href=
                               '${pageContext.request.contextPath}/consumptioninfo/toUpdate?name=${customer.name}&cartype=${customerCar.cartype}'"
                       value="修改">
                <input type="button" name="return"
                       onclick="window.location.href='${pageContext.request.contextPath}/consumptioninfo/delete?cartype=${customerCar.cartype}&customerId=${customerCar.customerId}'"
                       value="删除">
            </td>
        </tr>
    </c:forEach>


</table>
<input type="button" name="return"
       onclick="window.location.href='${pageContext.request.contextPath}/consumptioninfo/toConsumptionInfo'" value="返回">
</body>
</html>

