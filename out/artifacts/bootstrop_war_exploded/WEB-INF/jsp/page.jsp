<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 2017/12/12
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    $(function () {
        $("li>a").click(function () {
            var no=$(this).attr("no");
            var url=location.href.split("?")[0]+"?pageNum="+no+"&pageSize=3";
            location.href =url;
        })
    })
</script>
<div class="row">
    <div class="col-lg-4 col-lg-offset-2">
        <h5>共：${pageInfo.total}条记录 共${pageInfo.pages}页</h5>
    </div>
    <div class="col-lg-6">
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li <c:if test="${pageInfo.isFirstPage}">class="disabled"</c:if>><%--分页样式的禁用--%>
                    <c:if test="${pageInfo.isFirstPage}"><span>首页</span></c:if><%--分页点击的禁用--%>
                    <c:if test="${pageInfo.isFirstPage==false}">
                        <a href="#" no="1">首页</a>
                    </c:if>
                </li>

                <li <c:if test="${pageInfo.isFirstPage}" >class="disabled"</c:if>>
                    <c:if test="${pageInfo.isFirstPage}">
                        <span aria-hidden="true">&laquo;</span>
                    </c:if>
                    <c:if test="${pageInfo.isFirstPage==false}">
                        <a href="#" aria-label="Previous" no="${pageInfo.prePage}">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>

                </li>
                <c:forEach items="${pageInfo.navigatepageNums}" var="no">
                    <li <c:if test="${no==pageInfo.pageNum}">class="active"</c:if> >
                        <a href="#" no="${no}">${no}</a>
                    </li>
                </c:forEach>
                <li <c:if test="${pageInfo.hasNextPage==false}" >class="disabled"</c:if>>
                    <c:if test="${pageInfo.hasNextPage==false}">
                        <span aria-hidden="true">&raquo;</span>
                    </c:if>
                    <c:if test="${pageInfo.hasNextPage}">
                        <a href="#" aria-label="Next" no="${pageInfo.nextPage}">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </c:if>
                </li>
                <li <c:if test="${pageInfo.isLastPage}">class="disabled"</c:if>>
                    <c:if test="${pageInfo.isLastPage}">
                        <span>末页</span>
                    </c:if>
                    <c:if test="${pageInfo.isLastPage==false}">
                        <a no="${pageInfo.pages}">末页</a>
                    </c:if>
                </li>
            </ul>
        </nav>
    </div>
</div>