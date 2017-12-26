<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User:
  Date: 2017/12/11
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学员信息列表</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript">
        function back(){
            window.location.href='${pageContext.request.contextPath}/student/list';

        }
        function check() {
            var name = $("#name").val();
            var gender = $("#gender").val();
            var age = $("#age").val();
            var tel = $("#tel").val();
            var email = $("#email").val();
            var classid = $("#classId").val();
            var reg =/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
            if(name==''){
                alert("姓名不能为空");
                return false;
            }
            if(gender==''){
                alert("性别不能为空");
                return false;
            }
            if(age==''){
                alert("年龄不能为空");
                return false;
            }
            if(tel==''){
                alert("电话不能为空");
                return false;
            }
            if(email==''){
                alert("邮箱不能为空");
                return false;
            }
            if(reg.test(email)==false){
                alert("邮箱格式不正确");
                return false;
            }
            if(classid==0){
                alert("请选择年级");
                return false;
            }
            return true;

        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/add" method="post" onsubmit="return check()" l>

    <div align="center" style="color:red;">学员信息添加</div>
    <table border="1" align="center">
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" name="name" id="name" required>
            </td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input type="text" name="gender" id="gender">
            </td>
        </tr>
        <tr>
            <td>年龄</td>
            <td>
                <input type="text" name="age" id="age">
            </td>
        </tr>
        <tr>
            <td>电话</td>
            <td>
                <input type="text" name="tel" id="tel">
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input type="email" name="email" id="email">
            </td>
        </tr>
        <tr>
            <td>班级</td>
            <td>
                <select name="classId" id="classId">
                    <option value="0">请选择</option>
                    <c:forEach items="${classesList}" var="classes">

                        <option value="${classes.id}">${classes.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="添加" id="submitId"/>
                <input type="button" value="返回" onclick="back()"/>
            </td>
        </tr>
    </table>
</form>



</body>
</html>
