<%--
  Created by IntelliJ IDEA.
  User: shawnhardin
  Date: 3/9/23
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Guessing Game</title>
</head>
<body>
<h1>Guess a Number between 1 and 3</h1>
<form action="/guess" method="POST">
  <input type="text" name="guess" />
  <input type="submit" value="Submit" />
</form>
</body>
</html>