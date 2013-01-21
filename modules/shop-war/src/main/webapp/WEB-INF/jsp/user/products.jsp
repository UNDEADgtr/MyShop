<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
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
    <jsp:include page="/WEB-INF/jsp/part/user_header.jsp"/>

    <div class="row">
        <div class="span10">
            <ul class="breadcrumb">
                <li><a href="#">Главная</a> <span class="divider">/</span></li>
                <li class="active">Товары</li>
            </ul>
        </div>
    </div>

    <div class="row" style="text-align: center">
        <c:forEach var="product" items="${products}">
            <div class="span5">
                <div class="row">
                    <div class="span2" style="text-align: right">
                        <a href="/products/${product.id}"/><img height="100px" src="/img/no_product_128.png"/> </a>
                    </div>
                    <div class="span3">
                        <h4>${product.title}<h4>
                                ${product.price} <a href="/products/${product.id}">подробнее</a>
                            <br>
                            <br>
                                ${product.discription}
                            <br>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <jsp:include page="/WEB-INF/jsp/part/footer.jsp"/>
</div>
</body>
</html>