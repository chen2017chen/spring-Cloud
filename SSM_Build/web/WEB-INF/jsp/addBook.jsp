<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WW
  Date: 2020/11/3
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>添加书籍</title>
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

            <form action="${ctx}/book/addBook" method="post">
                <div class="form-group">
                    <label for="bookName">书籍名称</label>
                    <input type="text" class="form-control" id="bookName" name="bookName" required>
                </div>

                <div class="form-group">
                    <label for="bookCounts">书籍数量</label>
                    <input type="text" class="form-control" id="bookCounts" name="bookCounts" required>
                </div>

                <div class="form-group">
                    <label for="detail">书籍描述</label>
                    <input type="text" class="form-control" id="detail" name="detail" required>
                </div>
                <div class="form-group">
                    <input type="submit" class="form-control" value="添加" >
                </div>
            </form>
        </div>
</body>
</html>
