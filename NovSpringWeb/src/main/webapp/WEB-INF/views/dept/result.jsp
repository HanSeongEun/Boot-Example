<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>검색 결과</title>
</head>
<body>
 <p>[ ${ search } ] 검색 결과 입니다.</p>
 
 <c:if test="${ dlist.size() == 0 }">
 	검색 조건에 맞는 결과가 없습니다.
 </c:if>
 <c:if test="${ dlist.size() != 0 }">
 	<c:forEach items="${dlist}" var="dept">
 		<div>${dept.deptno}. ${dept.dname } - ${dept.loc } 
 		<button onclick="location.href='/dept/update/${dept.deptno}'">수정</button>
 		</div>
 	</c:forEach>
 </c:if>

</body>
</html>