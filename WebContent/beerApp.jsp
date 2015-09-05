<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="myTags" uri="beerAppTags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="BeerAppSubmitServlet">

<p> Select Beer Characteristics</p>

 Color : 
  
  <myTags:formTag size="" name="options" optionsList="${requestScope.optionsList}"/>
   
  <input type="submit"/>

 </form>

</body>
</html>