<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>a</title>
</head>
<body>
	<h1>A 입니다.</h1>
	<form method="post">
		이름 : <input name="name"><br>
		사용해본 언어 : 
		<input type="checkbox" name="lang" value="java"> java
		<input type="checkbox" name="lang" value="html"> html
		<input type="checkbox" name="lang" value="sql"> sql
		<input type="checkbox" name="lang" value="python"> python
		<br>
		원하는 날짜 :
		<input name="resevation" placeholder="yyyyMMdd"><br>
		좋아하는 숫자 : 
		<input name="number"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>

