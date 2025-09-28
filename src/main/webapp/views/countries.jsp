<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Country Select Box</title>
</head>
<body>
    <h2>Chọn quốc gia</h2>
    <form>
        <select name="country">
            <c:forEach var="ct" items="${countries}">
                <option value="${ct.id}">${ct.name}</option>
            </c:forEach>
        </select>
    </form>
</body>
</html>
