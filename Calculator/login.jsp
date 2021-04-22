<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%    String s1 = request.getParameter("login_uname");
        String s2 = request.getParameter("login_pwd");
        if (s1.equals("lakshman") && s2.equals("test")) {%>
        <jsp:forward page="tools.jsp"/>
<%    } else {%>
        <h5>Login failed</h5>
        <jsp:include page="Login.html"/>
<%    }%>

</body>
</html> 