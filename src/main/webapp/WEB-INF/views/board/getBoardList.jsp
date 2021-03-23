<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 전체 목록</h3>
<c:forEach items="${list }" var="board">
	<a href="getBoard?seq=${board.seq }"> 
		${board.seq} ${board.title }</a><br>
</c:forEach>
</body>
</html>