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

appScope : <%Fruit f1 =  (Fruit)application.getAttribute("banana"); %>

<%if (f1 != null){ %>
<%= f1.getName() %>
<%} %>

sessionScope : <%Fruit f2 =  (Fruit)session.getAttribute("papaya"); %>
<%if (f2 != null){ %>
<%= f2.getName() %>
<%} %>

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