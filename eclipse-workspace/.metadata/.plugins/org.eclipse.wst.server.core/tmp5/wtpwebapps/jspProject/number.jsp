<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Number Page</title>
</head>
<body>
       <%
            String start = request.getParameter("startpoint");
            String end  = request.getParameter("endpoint");
        
            //parsing
            int startpoint = Integer.parseInt(start);
            int endpoint = Integer.parseInt(end);
        
        %>
        
          <h3 style = "color:red">Even and Odd Numbers</h3>
          <h2 style = "color:green">between <%=startpoint %> And <%=endpoint%></h2>
         
         
          
          <table border = "1px" style= "float:left; margin-right:10px; margin-top:18px; background-color: cyan;">
              <tr> 
                   <th style = "background-color:yellow">Even</th>
              </tr>
           
             <%   
                 for(int i=startpoint; i<=endpoint; i++){
        	     if(i%2==0){        		               
             %>
          
              <tr>
                   <td><%= i %></td>
              <tr>
              
              <%   
        	         }
                  }
              %>
          </table>
                   
          <table border = "1px" style = "float:left; margin-right:10px; margin-top :18px; background-color: cyan;">
              <tr>
                   <th style = "background-color:yellow">Odd</th>
              </tr>
          
             <%
       	         for(int i = startpoint; i<=endpoint; i++){
       		       if(i%2!=0){     			 
             %>
               <tr>
                     <td><%=i %></td>
               </tr>
             <%     
       	            }
                 }
             %>		
          </table>
          
       	 
</body>
</html>