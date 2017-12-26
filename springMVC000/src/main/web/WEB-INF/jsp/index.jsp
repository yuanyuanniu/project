<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 2017/12/2
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script
            type="text/javascript"
            src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"/>



</head>
<body>
hello springmvc
<form action="${pageContext.request.contextPath}/index" method="post">
<input type="text" name="userName"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
