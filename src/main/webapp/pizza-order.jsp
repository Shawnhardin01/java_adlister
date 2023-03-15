<%@ page import="org.w3c.dom.ls.LSOutput" %><%--
  Created by IntelliJ IDEA.
  User: shawnhardin
  Date: 3/9/23
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Pizza Topings</h1>

<form action="pizza-order.jsp" method = "POST" >
    <input type="checkbox" id="topping1" name="topping1" value="Pepperoni">
    <label for="topping1">Pepperoni</label><br>
    <input type="checkbox" id="topping2" name="topping2" value="Sausage">
    <label for="topping2">Sausage</label><br>
    <input type="checkbox" id="topping3" name="topping3" value="Mushrooms">
    <label for="topping3">Mushrooms</label><br>
    <input type="checkbox" id="topping4" name="topping4" value=" Pineapple">
    <label for="topping4">Pineapple</label><br>
    <h1>Pizza crust</h1>
    <select name="crust" id="crust">
        <option value="hand tossed">hand tossed</option>
        <option value="thin crust">thin crust</option>
        <option value="deep dish">deep dish</option>
    </select>
    <h1>Pizza sauce</h1>
    <select name="sauce" id="sauce">
        <option value="Marinara Sauce">Marinara Sauce</option>
        <option value="White Garlic Sauce">White Garlic Sauce</option>
        <option value="Garlic Ranch Sauce">Garlic Ranch Sauce</option>
    </select>
    <h1>Pizza size</h1>
    <select name="size" id="size">
        <option value="8 inches">8 inches</option>
        <option value="10 inches">10 inches</option>
        <option value="16 inches">16 inches</option>
    </select>
<br>
    <br>
    <input type="submit" value="Submit">
</form>\
</body>
</html>
