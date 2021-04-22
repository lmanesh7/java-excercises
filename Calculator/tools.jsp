<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {background-color: powderblue;}
h4   {color: blue;}
p    {color: purple;}
</style>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body>

<h5>Login Successful</h5>&nbsp;<br>
<h4> Welcome: <%= request.getParameter("login_uname")%></h4>

<h2>Calculator</h2>
<form name="login" action="Operate.jsp" method="post">
            <p>Enter input1 : <input type="text" name="input1" value=""><br>
                Enter input2 : <input type="text" name="input2" value=""><br>
                Enter operation : <input type="text" name="op" value=""><br>
                <input type="submit" value="Calculate">
        </form>
<h2>Age Calculator</h2>
<form action="/age.jsp">
  <label for="birthday">date of birth:</label>
  <input type="date" id="birthday" name="birthday">
  <input type="submit" value = "check age">
</form>
</body>
</html>