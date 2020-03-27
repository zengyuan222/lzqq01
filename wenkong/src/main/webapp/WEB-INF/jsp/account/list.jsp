<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户列表jsp页面</title>
    <style>
        table {border:1px solid #000000}
        table th{border:1px solid #000000}
        table td{border:1px solid #000000}
    </style>
</head>
<body>
    账户列表：<a href="${pageContext.request.contextPath}/queryTemp.do" >添加账户</a>
    <table cellpadding="0" cellspacing="0" width="80%">
        <tr>
            <th>账户Id</th>
            <th>账户名称</th>
            <th>账户金额</th>
        </tr>
        <c:forEach items="${qqcMctList}" var="qqcMct">
            <tr>
                <td>${qqcMct.conTemp1}</td>
                <td>${qqcMct.conTemp2}</td>
                <td>${qqcMct.conTemp3}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

