<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account </title>
</head>
<body>

<%@ page import="java.util.Date" %>
<%@ page errorPage="error.jsp" %>

<%
String appName = getServletContext().getInitParameter("appName");
String pageName = getServletConfig().getInitParameter("pageName");

request.getParameter("user");

int result = 10/0;


%>
<%! String globalVar = "Hello"; %>

<%= new Date() %>
<%= appName %>
<%= application.getInitParameter("appName") %>
<%= session.getAttribute("user") %>


</body>
</html>