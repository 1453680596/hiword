<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2023/5/24
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
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
        <th>性别</th>
        <th>电话</th>
        <th>客户等级</th>
        <th>电子邮箱</th>
    </tr>
    <tr align="center">
<%--        <td><% out.print(bookList.get(i).getB_id()); %></td>--%>
<%--        <td><% out.print(bookList.get(i).getB_name()); %></td>--%>
<%--        <td><% out.print(bookList.get(i).getB_author()); %></td>--%>
<%--        <td><% out.print(bookList.get(i).getB_price()); %></td>--%>
<%--        <td><% out.print(bookList.get(i).getB_content()); %></td>--%>
        <td> <c:forEach items="${customerList}" var="customer">
                ${customer.name}<br/>
                ${customer.sex}<br/>
                ${customer.phone}<br/>
                ${customer.grade}<br/>
                ${customer.email}<br/>
        </c:forEach>
            <button>修改</button>
            <button>删除</button>
        </td>
    </tr>
    <tr>
        <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF"><input type="submit" name="update" value="信息更新" formaction="${pageContext.request.contextPath}/basicinfo/update"/>&nbsp;&nbsp;
            <input type="submit" name="delete" value="删除该用户" formaction="${pageContext.request.contextPath}/basicinfo/delete"/>
    </tr>
</table>
<input type="button" name="return" onclick="window.location.href='${pageContext.request.contextPath}/basicinfo/toBasicInfo';" value="返回">
</body>
</html>
