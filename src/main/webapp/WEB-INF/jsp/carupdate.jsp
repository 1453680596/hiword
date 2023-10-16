<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/26
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>汽车信息更新</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="${pageContext.request.contextPath}/consumptioninfo/update">
    <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;"><tr>
        <td><input type = "text" style="visibility:hidden" name = "id" value="${customerCar.id}"></td>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">客户姓名：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="name" type="text" size="10" value="${customerCar.name}"/></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">车辆类型：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="cartype" type="text" size="10" value="${customerCar.cartype}"/></td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">车牌号：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input name="carnumber" type="text" size="10" value="${customerCar.carnumber}"/></td>
        </tr>

            <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">
                <input type="submit" name="update" value="更新" formaction="${pageContext.request.contextPath}/consumptioninfo/update"/>&nbsp;&nbsp;
                <input type="submit" name="return" value="返回" formaction="${pageContext.request.contextPath}/consumptioninfo/toSelect"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
