<%--
  Created by IntelliJ IDEA.
  User: main
  Date: 2017/12/9·
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理系统</title>
    <%@include file="basic.jsp"%>
</head>
<body>
    <div class="container" >
        <div class="row">
            <div class="col-md-offset-4">
            <div class="page-header">
                <h1>学生管理系统 <small>欢迎${user.nickName}登录<a href="${pageContext.request.contextPath}/user/login">注销</a></small></h1>
            </div>
            </div>
        </div>

    </div>

</body>
</html>
