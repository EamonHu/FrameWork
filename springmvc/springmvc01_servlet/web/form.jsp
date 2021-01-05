<%--
  Created by IntelliJ IDEA.
  User: Eamon
  Date: 2021/1/5
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/hello" method="post">
    <label>
        <input type="text" name="method">
    </label>
    <input type="submit">
</form>

</body>
</html>
