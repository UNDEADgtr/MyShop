<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Магазин электроники</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap-responsive.css">
</head>
<body>
<div class="container">
    <br>
    <jsp:include page="/WEB-INF/jsp/part/user_header.jsp"></jsp:include>

    <div class="row">
        <div class="span10">
            <ul class="breadcrumb">
                <li><a href="#">Главная</a> <span class="divider">/</span></li>
                <li><a href="#">Товары</a> <span class="divider">/</span></li>
                <li class="active">${product.title}</li>
            </ul>
        </div>
    </div>

    <div class="row">
        <div class="span9">
            <jsp:include page="/WEB-INF/jsp/part/error.jsp"></jsp:include>
        </div>
    </div>

    <div class="row">
        <div class="span4">
            <h5>
                ${product.title}
            </h5>
            <h5>
                ${product.price}
            </h5>
            <h5>
                ${product.discription}
            </h5>
        </div>
        <div class="span4">
             <c:forEach var="detail" items="${product.details}">
                 <h5>
                     ${detail.title}
                 </h5>
                 <h5>
                     ${detail.value}
                 </h5>
             </c:forEach>
        </div>
    </div>

    <jsp:include page="/WEB-INF/jsp/part/footer.jsp"></jsp:include>
</div>

</body>
</html>