<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>
Search
<table>
    <c:forEach var="i" begin="0" end="${length - 1}">  
 
  
<tr>
<td>
<b>${i}. SongName: ${songNameArray[i]} </b>
</td>
</tr>
<tr>
<td>
<b>Link: <a href ="${linkArray[i]}">${linkArray[i]}</a></b></td>
</tr>
    </c:forEach>
</table>
</body>
</html>