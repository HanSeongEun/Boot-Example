<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>form</title>
</head>
<body>
	<form method="post">
		이름 : <input name="name" ><br>
		생일 : <input type="datetime-local" name="birth"><br>
		우편번호 : <input name="address.zipcode">
		주소 1 : <input name="address.address1">
		주소 2 : <input name="address.address2"><br>
		
		<input type="submit" value="전송">
	</form>
</body>
</html>