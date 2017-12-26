<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 2017/12/13
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-lg-4 col-lg-offset-2">
        <h5>共${pageInfo.total}条记录,共${pageInfo.pages}页</h5>
    </div>
    <div class="col-lg-6">
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li <c:if test="${pageInfo.isFirstPage}">class="disabled" </c:if>>
                    <c:if test="${pageInfo.isFirstPage}"><span>首页</span></c:if>
                    <c:if test="${pageInfo.isFirstPage}==false">
                    <a href="#" no="${no}">${no} </a>
                    </c:if>
                </li>

                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li>
                    <a href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>
</div>
