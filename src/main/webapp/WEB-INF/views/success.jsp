<%--
  Created by IntelliJ IDEA.
  User: NChaurasia
  Date: 2024-07-24
  Time: 12:35 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h4 class="text-center">${Title}</h4>
<P class="text-center">${Desc}</P>
<hr/>
<h1> Welcome : ${user.userName} </h1>
<h1> Your email address is : ${user.email} </h1>
<h1> Your Password is : ${user.password} try to secure password </h1>

</body>
</html>
