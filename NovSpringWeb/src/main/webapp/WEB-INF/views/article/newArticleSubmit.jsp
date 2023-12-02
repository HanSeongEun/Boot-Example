<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>게시글 쓰기</title>
</head>
<body>
<%-- {"newArticleCommand" - NewArticleCommand객체}  -> MODEL --%>
<h4>게시글 쓰기 완료</h4>
title : ${newArticleCommand.title }<br>
content : ${ test.content }
</body>
</html>