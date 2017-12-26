<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 2017/12/11
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>学生管理系统首页</title>
</head>
<body>

<h1 align="center" style="color:red">学院信息列表</h1>
<table align="center" border="1">
  <tr>
    <td colspan="7" align="right">
      <a href="${pageContext.request.contextPath}/student/showAdd">添加学员</a>
    </td>
  </tr>
  <tr style="background-color: blue">
    <td>编号</td>
    <td>姓名</td>
    <td>性别</td>
    <td>年龄</td>
    <td>电话</td>
    <td>email</td>
    <td>班级</td>
  </tr>
  <c:forEach items="${studentList}" var="student" varStatus="status">
    <tr <c:if test="${status.index % 2 != 0}">style="background-color: red"</c:if>>
      <td>${student.id}</td>
      <td>${student.name}</td>
      <td>${student.gender}</td>
      <td>${student.age}</td>
      <td>${student.telephone}</td>
      <td>${student.email}</td>
      <td>${student.className}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>