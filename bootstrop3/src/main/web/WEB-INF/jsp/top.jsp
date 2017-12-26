<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 2017/12/9
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-lg-12">
        <div class="page-header">
            <h1>学生管理系统</h1>
            <small>欢迎：${user.nickName}
            <a href="${pageContext.request.contextPath}/user/loginOut">退出</a>
        </small>
        </div>
    </div>
</div>
