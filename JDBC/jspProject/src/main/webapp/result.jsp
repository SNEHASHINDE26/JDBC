<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body> 
        <%
            String num1 = request.getParameter("num1");
            String num2 = request.getParameter("num2");

             //parsing
             double n1 = Double.parseDouble(num1);
             double n2 = Double.parseDouble(num2);
                
             double add = n1 + n2;        
             double sub = n1 - n2;        
             double mul = n1 * n2;        
             double div = n1 / n2;                
         %>

        <button><a href="#sub1">Add</a></button> 
         <h2 id ="add1" style="color:red; margin:10px;">Addition is: <%=add %></h1><a href="#result1">Go Back</a><br><br><br><hr>
        
        <button><a href="#sub1">Sub</a></button> 
         <h2 id ="sub1" style="color:brown; margin:10px;">Substraction is: <%=sub %></h1><a href="#result1">Go Back</a><br><br><br><hr>
        
        <button><a href="#mul1">Mul</a></button> 
         <h2 id ="mul1" style="color:green; margin:10px;">Multiplication is: <%=mul %></h1><a href="#result1">Go Back</a><br><br><br><hr>

        <button style="background-color:yellow; color:black; margin:10px;"><a href="#div1">Div</a></button>
         <h2 id ="div1" style="color:black; margin:10px;">Division is: <%=div %></h1><br><a href="#result1">Go Back</a>


</body>
</html>