<%--
  Created by IntelliJ IDEA.
  User: Shahani
  Date: 28/11/2021
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String user = request.getParameter("name");
    String father = request.getParameter("father");
    String reg = request.getParameter("reg");
%>

<p>Student Name is: <%=user%></p>
<p> Father Name is: <%=father%></p>
<p>Registration Number is <%=reg%></p>
</body>
</html>
