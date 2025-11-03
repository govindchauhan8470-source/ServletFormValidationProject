<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <center>
       <%
          String name=(String)request.getAttribute("name");
          String gender=(String)request.getAttribute("gender");
          
          
          if(gender.equalsIgnoreCase("male"))
          {
        	  out.println("<h1 style='color:blue;'>Mr. <u style='color:black;'>"+name+"</u> Eligible for marrieage Think one<br> more time before taking decision!</h1>");
          }
          else
          {
        	  out.println("<h1 style='color:blue;'>Ms. <u style='color:black;'>"+name+"</u> Eligible for marrieage Think one<br> more time before taking decision!</h1>");
          }
          
          
       %>
       <jsp:include page="index.html"/>
</body>
</html>