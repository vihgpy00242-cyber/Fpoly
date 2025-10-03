<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<ul>
    <li>Title: ${fn:toUpperCase(item.title)}</li>
    <li>Content:
        <c:choose>
            <c:when test="${fn:length(item.content) > 100}">
                ${fn:substring(item.content, 0, 100)}...
            </c:when>
            <c:otherwise>
                ${item.content}
            </c:otherwise>
        </c:choose>
    </li>
</ul>
