<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>부서 수정</title>
</head>
<body>
<h3>부서 정보 - 부서명, 근무지를 수정할 수 있습니다.</h3>
<form method="post" action="/dept/update">
	<input type="hidden" name="_method" value="put">
	<input type="hidden" name="deptno" value="${dept.deptno }">
	부서명 <input name="dname" value="${dept.dname }"><br>
	근무지 <input name="loc" value="${dept.loc }"><br>
	<input type="submit" value="수정">
</form>
</body>
</html>