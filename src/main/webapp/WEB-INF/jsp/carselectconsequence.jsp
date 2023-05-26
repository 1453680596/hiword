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
<h2>查询成功！</h2>

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
                       onclick="window.location.href='${pageContext.request.contextPath}/consumptioninfo/delete?cartype=${customerCar.cartype}'"
                       value="删除">
            </td>
        </tr>
    </c:forEach>


</table>
<input type="button" name="return"
       onclick="window.location.href='${pageContext.request.contextPath}/consumptioninfo/toConsumptionInfo'" value="返回">
</body>
</html>

