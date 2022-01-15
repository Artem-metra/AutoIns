<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.sql.Connection" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 11.12.2021
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
String header = "Инфорамция о клиенте";
%>

<html>
<head>
    <title><%= header %></title>
    <link rel="stylesheet" href="style.css">
</head>
<body>


<c:forEach var="allInformation" items="${allInformation}">
  <p><c:out value="${allInformation.byState_number}"/>/p>
</c:forEach>




</body>
</html>
