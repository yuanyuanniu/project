<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 2017/12/9
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>登录页</title>

  <!-- Bootstrap -->
  <link
          href="${pageContext.request.contextPath}/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css"
          rel="stylesheet">
  <!-- Font Awesome -->
  <link href="${pageContext.request.contextPath}/statics/gentelella-master/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <!-- NProgress -->
  <link
          href="${pageContext.request.contextPath}/statics/gentelella-master/vendors/nprogress/nprogress.css" rel="stylesheet">
  <!-- Animate.css -->
  <link
          href="${pageContext.request.contextPath}/statics/gentelella-master/documentation/css/animate.min.css" rel="stylesheet">
  <!-- Custom Theme Style -->
  <link
          href="${pageContext.request.contextPath}/statics/gentelella-master/build/css/custom.min.css" rel="stylesheet">
</head>

<body class="login">


  <a class="hiddenanchor" id="signup"></a>
  <a class="hiddenanchor" id="signin"></a>

  <div class="login_wrapper">
    <div class="animate form login_form">
      <section class="login_content">
        <form action="${pageContext.request.contextPath}/user/login" method="post" >
          <h1>登录页</h1>
          <div>
            <input type="text" class="form-control" placeholder="用户名：" required="" name="userName"/>
          </div>
          <div>
            <input type="password" class="form-control" placeholder="密码：" required="" name="password" />
          </div>

            <input class="btn btn-default submit" type="submit" value="登录" ></input>


          <div class="clearfix"></div>


        </form>
      </section>
    </div>
  </div>


</div>
</body>
</html>