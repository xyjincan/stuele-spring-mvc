<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@ page isELIgnored="false" %><%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html>
<head>
    <title>Welcome to Watchers!</title>
    <style>
        body {
            width: 35em;
            margin: 0 auto;
            font-family: Tahoma, Verdana, Arial, sans-serif;
        }
    </style>
</head>
<body>

    <p>这里是SpringMVC list页</p>
    <p>Welcome to Watchers!</p>
	<p>count substudent: ${count} </p>
	<p>findStudentById 6 : ${findone6} </p>
	<p>findAllstudent1 : ${findAllstudent1} </p>
	<p>findAllstudent2 : ${findAllstudent2} </p>
	
	<p>findByName : ${findByName} </p>
	<p>findByInf : ${findByInf} </p>
    <p><em>Thank you for using.</em></p>
    
</body>
</html>