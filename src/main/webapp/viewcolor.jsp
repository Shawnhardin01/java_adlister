<%--
  Created by IntelliJ IDEA.
  User: shawnhardin
  Date: 3/9/23
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Color</title>
    <style>
        body {
            background-color: <%= request.getParameter("color") %>;
        }
    </style>
</head>
<body>
<h1>View Color</h1>
<p>The selected color is <%= request.getParameter("color") %>.</p>
</body>
</html>
