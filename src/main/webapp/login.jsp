<%--
  Created by IntelliJ IDEA.
  User: shawnhardin
  Date: 3/8/23
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="partials/navbar.jsp" />



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action = "login" method = "POST">
    Username:<label>
    <input type = "text" id="username" name = "username">
</label>
    <br />
    Password: <label>
    <input type = "text" id="password" name = "password" />
</label>
    <br>
    <input type = "submit" value = "Submit" />

</form>

<%--<%--%>
<%--    String username = request.getParameter("username");--%>
<%--    String password = request.getParameter("password");--%>
<%--    if ("admin".equals(username) && "password".equals(password)) {--%>
<%--        response.sendRedirect("profile.jsp");--%>
<%--    } else if (username != null || password != null) {--%>
<%--        response.sendRedirect("login.jsp");--%>
<%--    }--%>
<%--%>--%>
</body>
</html>
