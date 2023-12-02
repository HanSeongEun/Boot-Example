<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>info</title>
</head>
<body>
	info.jsp입니다 <br>
	이름 : ${infoCommand.name }<br>
	사용한 언어 : 
	<c:forEach items="${infoCommand.lang }" var="lang">
		${lang }
	</c:forEach><br>
	선호 날짜 : <fmt:formatDate value="${infoCommand.resevation}" 
				pattern="yyyy년 MM월 dd일"/><br>
	숫자 : ${infoCommand.number}		
</body>
</html>






