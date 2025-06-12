<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 템플릿 해더 추가 -->
<!-- ./  상대주소 ./views <=> /webapp/WEB-INF/views -->
<!-- ../ 절대주소 상위폴더로 이동-->

<%-- <%@include file="../include/header.jsp" %> --%>


 <%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>파일 업로드</title>
</head>
<body>
<h2>영수증파일을 업로드해주세요</h2>

<form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/upload">
    <input type="file" name="file"/>
    <button type="submit">업로드하기</button>
</form>

<c:if test="${not empty message}">
    <p style="color: green;">${message}</p>
</c:if>
</body>
</html>
	
<%-- <%@include file="../include/footer.jsp" %> --%>
<!-- 템플릿 푸터 추가 -->