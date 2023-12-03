<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>검색 결과</title>
</head>
<body>
<div>
<form action="result">
사원 검색 : <input type="search" name="ename" placeholder="이름을 검색하세요">
	<input type="submit" value="검색">
</form>
</div>
<div>
	<c:forEach items="${elist }" var="emp">
		사원번호 : ${emp.empno } <br>
		이름 : ${emp.ename }<br>
		부서명 : ${emp.dept.dname }<br>
		근무지 : ${emp.dept.loc }
		<hr>
	</c:forEach> 

</div>
</body>
</html>