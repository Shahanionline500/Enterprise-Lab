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
    <title></title>
</head>
<body>
<form action="show.jsp" method="post">
    <div>
        <table>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="name"/><br><br></td>
            </tr>
            <tr>
                <td> Father Name :</td>
                <td><input type="text" name="father"/><br><br></td>
            </tr>
            <tr>
                <td>Registration Number :</td>
                <td><input type="text" name="reg"/><br><br></td>
            </tr>
            <tr>
                <td><input type="submit" value="Show" name="buttonshow"/></td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>