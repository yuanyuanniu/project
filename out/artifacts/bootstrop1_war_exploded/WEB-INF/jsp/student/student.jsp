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
                    studentIds=studentIds+$(this).val()+",";
                }
                
            })
            if(studentIds==""){
                alert ("");
                return;
            }
            if(confirm()){
                $.post("${pageContext.request.contextPath}/student/deleteStrudentByIds",{"ids":studnetIds}
            ,function(data) {
                    alert(data.msg)
                    location.href=location.href
                })
            }
            //显示添加的模态框
            $("#addStudentButton").click(function () {
                $("#addStudentGradeSelect").empty();
                $.get("${pageContext.request.contextPath}/grade/queryAllGrade",function (data) {
                    for(var i=0;i<data.length;i++){
                        $("#addStudentGradeSelect").append("<option value="+data[i].id+">"+data[i].grade.grade_name+"</option>");
                    }
                    
                })
                $("#addStudentModel").modal("show");
                
            })
            //添加学生保存按钮
            $("#addStudent").click(function () {
                var student=$("#addstudentform").serialize();
                $.post("${pageContext.request.contextPath}/student/addStudent",student,function (data) {
                    alert(data.msg);
                    $("#addStudentModel").modal("hide");
                    location.href=location.href;
                    
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
            <h3>学生管理</h3>
        </div>
        <div class="col-lg-2 col-lg-offset-2">
            <button class="btn btn-danger" id="deleteGradeByIdsButton">删除</button>
            <button class="btn btn-info" id="addStudentButton">添加</button>
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
                            <button type="button" class="btn btn-info btn " name="updateStudentButton" studentId="${student.id}">修改</button>
                            <button type="button" class="btn btn-danger btn" name="deleteGradeButton" gradeId="${grade.id}">删除</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </div>
    <%@include file="../page.jsp"%>
//添加学生模态框
    <div class="modal fade" tabindex="-1" role="dialog" id="addStudentModel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">添加学生</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="addStudentForm">

                        <div class="form-group">
                            <label  class="col-sm-2 control-label">学生名称：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control"  placeholder="学生名称" name="studentName">
                            </div>
                        </div>
                        <div class="form-group">
                        <label  class="col-sm-2 control-label">年龄：</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control"  placeholder="年龄" name="age">
                        </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">性别：</label>
                            <div class="col-sm-10">
                                <select class="form-control"  name="gender">
                                    <option value="男">男</option>
                                    <option value="女">女</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">班级：</label>
                            <div class="col-sm-10">
                                <select class="form-control" name="grade.id" id="addStudentGradeSelect">
                                </select>
                                <input type="hidden" id="addGradeName" name="grade.gradeName">
                            </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">学生编号：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" placeholder="学生编号"  readonly name="studentNum">
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="addStudent">保存</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    //修改学生模态框
    <div class="modal fade" tabindex="-1" role="dialog" id="updateStudentModel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">修改学生</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="updateStudentForm">
                        <input type="hidden" id="updateStudentId" name="id">
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">学生名称：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="updateStudentName"  placeholder="学生名称" name="studentName">
                            </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">年龄：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="updateAge" placeholder="年龄" name="age">
                            </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">性别：</label>
                            <div class="col-sm-10">
                                <select class="form-control" id="updateGender" name="gender">
                                    <option value="男">男</option>
                                    <option value="女">女</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">班级：</label>
                            <div class="col-sm-10">
                                <select class="form-control" name="grade.id" id="updateStudentGradeSelect">
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">学生编号：</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="updateStudentNum" placeholder="学生编号" name="studentNum">
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="updateStudent">保存</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</div>
</body>
</html>
