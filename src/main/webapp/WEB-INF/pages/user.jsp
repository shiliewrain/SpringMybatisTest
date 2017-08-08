<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
  <title></title>
</head>
<body>
<c:out value="${list}"/>
<c:forEach items="${list}" var="item">
  <c:out value="${item.id}"/>
  <c:out value="${item.name}"/>
  <c:out value="${item.password}"/>
</c:forEach>
</body>
</html>