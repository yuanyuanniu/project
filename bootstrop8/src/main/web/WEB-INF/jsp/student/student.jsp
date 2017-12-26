<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 2017/12/9
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>学生管理界面</title>
    <%@include file="../basic.jsp"%>
    <script type="text/javascript">
        $(function () {
            var studentIds="";
            $.each($("input:checkbox"),function () {
                if(this.checked){
                    studentIds=studentIds+$(this).val()+","
                }
                
            })
            if(studentIds==""){
                alert("")
                return;
            }
            of(confirm()){
                $.post("${pageContext.request.contextPath}/student/deleteStudentByIds",{"ids":studentIds},
                function () {
                    alert(data.msg)
                    location.href=location.href;
                    
                })
            }
            $("#addStuddentButton").click(function () {
                $("#addStudentGradeSelect").empty();
                $.get("${pageContext.requst.contextPath}/grade/queryAllGrade",function (data) {
                    for(var i=0;i<data.length;i++){
                        $("#addStudentGradeSelect").append("<option value="+data[i].id+">"+data[i].grade.grade_name+"</option>")
                    }
                    
                })
                $("#addStudentModel").modal("show");
            })
            $("#addStudent").click(function () {
                var stdent=$("#addStudentForm").serialize();
                $.post("${pageContext.request.contextPath}/student/addStudent",student,
                function (data) {
                    alert(data.msg)
                    $("#addStudentModel").modal("hide")
                    location.href=location.href

                    
                    
                })
                
            })
            
        })
    </script>
</head>
<body>
<div class="container">
    <%@include file="../top.jsp"%>
    <div class="row">
        <%@include file="../left.jsp"%>
        <div class="col-lg-4 col-lg-offset-2">
            <h3>班级管理</h3>
        </div>
        <div class="col-lg-2 col-lg-offset-2">
            <button class="btn btn-danger" id="deleteGradeByIdsButton">删除</button>
            <button class="btn btn-info" id="addGradeButton">添加</button>
        </div>


    </div>
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2" >
            <table class="table table-striped">
                <tr>
                    <td>学生编号</td>
                    <td>姓名</td>
                    <td>性别</td>
                    <td>年龄</td>
                    <td>班级</td>
                    <td>操作</td>
                </tr>
                <c:forEach items="${pageInfo.list}" var="student">
                    <tr>
                        <td>
                            <input type="checkbox" name="deleteStudentCheckBox" value="${student.id}">
                        </td>
                        <td>${student.studentNum}</td>
                        <td>${student.studentName}</td>
                        <td>${student.gender}</td>
                        <td>${student.age}</td>
                        <td>${student.grade.gradeName}</td>
                        <td>
                            <button type="button" class="btn btn-info btn " name="updateGradeButton" gradeId="${grade.id}">修改</button>
                            <button type="button" class="btn btn-danger btn" name="deleteGradeButton" gradeId="${grade.id}">删除</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </div>
    <%@include file="../page.jsp"%>

</div>
</body>
</html>
