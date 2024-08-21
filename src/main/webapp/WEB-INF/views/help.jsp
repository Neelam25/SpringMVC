<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.List" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NChaurasia
  Date: 2024-07-22
  Time: 5:00 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Help</title>
</head>
<body>
    <h1> For any assistance please follow our page.</h1>
    <%
       String name =(String) request.getAttribute("name");
        Integer rno = (Integer) request.getAttribute("rollNo");
        LocalDate date = (LocalDate) request.getAttribute("date");
        List<Integer> marks = (List<Integer>) request.getAttribute("marks");
    %>
    <c:forEach var="item" items="${marks}">
        <c:out value="${item}"/>
    </c:forEach>
<%--    <h3>Name : <%=name%></h3>--%>
    <%--    <h3>Rno : <%=rno%></h3>--%>
    <%--    <h3>Date : <%=date%></h3>--%>

        <h3>Name : ${name}</h3>
        <h3>Rno : ${rno}</h3>
        <h3>Date : ${date}</h3>
        <h3>Marks: ${marks}</h3>

</body>
</html>
