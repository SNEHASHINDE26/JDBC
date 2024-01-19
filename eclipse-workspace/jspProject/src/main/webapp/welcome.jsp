<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
      <%
        String user = request.getParameter("username");
      %>
      <h1 style = "color:red">Welcome <%= user %></h1>
</body>
</html>