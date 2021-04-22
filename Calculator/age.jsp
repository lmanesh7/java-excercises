<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.text.SimpleDateFormat" %>
<%@ page import ="java.text.ParseException" %>
<%@ page import ="java.util.*" %>
<%@ page import ="java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Age Calculator</title>
</head>
<body>
<%
SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy"); 
java.util.Date date = new java.util.Date();
Date sysdate1 = date;
//String bdate = request.getParameter("birthday");
String bdate = "15-05-1999";
//Date date1 = obj.parse(sysdate);   
String sysdate = obj.format(sysdate1);
Date date2 = obj.parse(sysdate);
Date date1 = obj.parse(bdate); 
long time_difference = date2.getTime() - date1.getTime();  
long days_difference = (time_difference / (1000*60*60*24)) % 365;   
long years_difference = (time_difference / (1000l*60*60*24*365));  
 
long months = years_difference*12;
out.println("Age:");
out.println(years_difference+"Y");

out.println("\t"+"current date&time"+sysdate1.toString());

%>
	<jsp:include page="tools.jsp"/>
</body>
</html>