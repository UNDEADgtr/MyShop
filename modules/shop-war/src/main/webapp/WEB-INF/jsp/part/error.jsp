<%@ page pageEncoding="utf-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${MessageError != null}">
    <p class="text-error">${MessageError}</p>
</c:if>