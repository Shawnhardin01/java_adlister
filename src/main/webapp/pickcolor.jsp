<%--
  Created by IntelliJ IDEA.
  User: shawnhardin
  Date: 3/9/23
  Time: 1:46 PM
  To change this template use File | Settings | File Temp lates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            background-color: <%= request.getAttribute("color") %>;
        }
    </style>
</head>
<body>
<form action="viewcolor.jsp" method="post">
    Enter a color: <input type="text" name="color"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
