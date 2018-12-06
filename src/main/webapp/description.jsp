<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm demo</title>
</head>
<body>

Hello SSM!

<c:if test="${not empty description}">
    ${description.description}
</c:if>

<c:if test="${empty description}">
    数据为空，请检查数据！
</c:if>
</body>
</html>