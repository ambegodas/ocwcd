<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ocwcd.Fruit" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
 Fruit banana = new Fruit("bananaAppScope");
 getServletContext().setAttribute("banana", banana);
 
 Fruit papaya = new Fruit("papayaSessionScope");
 session.setAttribute("papaya", papaya);
 
 Fruit mango = new Fruit("mangoReqScope");
 request.setAttribute("mango", mango);
 
 Fruit apple = new Fruit("applePageScope");
 pageContext.setAttribute("apple", apple);
 
%>

requestScope : <%Fruit f3 =  (Fruit)request.getAttribute("mango"); %>
<%if (f3 != null){ %>
<%= f3.getName() %>
<%} %>

pageScope : <%Fruit f4 =  (Fruit)pageContext.getAttribute("apple"); %>
<%if (f4 != null){ %>
<%= f4.getName() %>
<%} %>

</body>
</html>