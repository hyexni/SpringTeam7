<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 템플릿 해더 추가 -->
<!-- ./  상대주소 ./views <=> /webapp/WEB-INF/views -->
<!-- ../ 절대주소 상위폴더로 이동-->

<%-- <%@include file="../include/header.jsp" %> --%>
 <html>
<head>
    <title>업로드된 파일 목록</title>
</head>
<body>
<h2>파일 목록</h2>

<c:if test="${not empty files}">
    <ul>
        <c:forEach var="file" items="${files}">
            <li>${file}</li>
        </c:forEach>
    </ul>
</c:if>

<c:if test="${empty files}">
    <p>업로드된 파일이 없습니다.</p>
</c:if>

<p><a href="${pageContext.request.contextPath}/upload">← 파일 업로드로 돌아가기</a></p>
</body>
</html>
	
<%-- <%@include file="../include/footer.jsp" %> --%>
<!-- 템플릿 푸터 추가 -->