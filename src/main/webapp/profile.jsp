<%--
  Created by IntelliJ IDEA.
  User: shawnhardin
  Date: 3/8/23
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>


<jsp:include page="partials/records.jsp" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String user = (String) session.getAttribute("user");
if (user == null) {response.sendRedirect("login");return;}%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="logout">Logout</a>
<p>You are currently logged in as <%= user %></p>
</body>
</html>
