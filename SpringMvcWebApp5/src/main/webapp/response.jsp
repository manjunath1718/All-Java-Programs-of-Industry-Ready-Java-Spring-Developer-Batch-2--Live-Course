<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response</title>
</head>
<body>
    <center>
        <h1>Displaying Data from Array</h1>
        <b> Name of Book </b>
        <c:forEach var="bookName" items="${books}" >${bookName}</c:forEach>
    </center>
</body>
</html>