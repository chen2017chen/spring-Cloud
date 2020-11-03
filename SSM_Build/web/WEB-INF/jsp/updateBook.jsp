<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WW
  Date: 2020/11/3
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>修改书籍</title>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-12-md column">
            <div class="page-header">
                <h1>
                    <small>添加书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${ctx}/book/updateBook" method="post">
        <%--出现的问题：提交了修改的SQL请求，但是修改失败,没有传递ID，无法根据ID修改--%>
        <%--解决：前段传递隐藏域--%>
            <input type="hidden" name="bookID" value="${QueryBook.bookID}">
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" class="form-control"  name="bookName" value="${QueryBook.bookName}" required>
        </div>

        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" class="form-control"  name="bookCounts" value="${QueryBook.bookCounts}" required>
        </div>

        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" class="form-control"  name="detail" value="${QueryBook.detail}" required>
        </div>
        <div class="form-group">
            <tr>
                <th>
                    <input type="submit" class="btn btn-primary" value="修改" >
                </th>
                <th>
                    <a class="btn btn-primary" href="${ctx}/book/allBook">返回</a>
                </th>
            </tr>

        </div>
    </form>
</div>
</body>
</html>
