<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/6/006
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/statics/bootstrap-3.3.7-dist/js/bootstrap.min.js" />
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>

  </head>
  <body>
      <div class="container">
        <div class="row">
          <div class="col-md-2 col-md-offset-5">
            <button type="button" class="btn btn-success">(成功)success</button>

          </div>
          <div class="col-md-2 col-md-offset-4">
            <button type="button" class="btn btn-danger">警告</button>
          </div>
        </div>
      </div>
  </body>
</html>
