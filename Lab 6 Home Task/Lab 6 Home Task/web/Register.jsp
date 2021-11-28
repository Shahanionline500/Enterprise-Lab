<%--
  Created by IntelliJ IDEA.
  User: Shahani
  Date: 26/11/2021
  Time: 12:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Data</title>
</head>
<style>
    head{
        background: grey;
    }
</style>
<body>

<div class="ex">
    <form action="RegisterServlet" method="post" >
        <div class="container">
           <h1>Sign Up</h1>

            <label for="fname"><b>First Name</b></label>
            <input type="text" placeholder="Enter First Name..." id="fname" name="fname" required>

            <label for="lname"><b>Last Name</b></label>
            <input type="text" placeholder="Enter Last Name..." id="lname" name="lname" required>
            <div class="input_field radio_option">
                <input type="radio" name="rd1" id="rd1">
                <label for="rd1">Male</label>
                <input type="radio" name="rd2" id="rd2">
                <label for="rd2">Female</label>
            </div>
            <label for="city"><b>City</b></label>
            <input type="text" placeholder="Enter City..." id="city" name="city" required>
            <div class="input_field select_option">
                <select>
                    <option>Country</option>
                    <option>Paksitan</option>
                    <option>USA</option>
                </select>
                <div class="select_arrow"></div>
            </div>
            <div class="container1">
                <label>
                    <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Accept Agreement
                </label>
            </div>



        </div>
        <div class="clearfix">
            <button type="button" class="cancelbtn">Cancel</button>
            <button type="submit" class="signupbtn">Sign Up</button>
        </div>

    </form>
</div>
</body>
</html>