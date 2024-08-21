<%@ page language="java" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Accessing Request Attribute</title>
</head>
<body>
<%
    String username = (String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");
%>
<p>Welcome, <%= username %>!
    Id: <%=id%>
</p>
<%
    List<String> friends = (List<String>) request.getAttribute("friends");
    for(String friend: friends){


%>
<h5> <%=friend%></h5>
<%
    }
%>
<p>Hello testing</p>
<h1>Again testing</h1>
</body>
</html>