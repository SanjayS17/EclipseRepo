<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> send details of favourite person</h1>
<form action="crazy" method="post">
<pre>
first Name<input type="text" name="fName"/><br>
last Name<input type="text" name="lName"/><br>
gender<input type="radio" name="gender" value="male"/>
      <input type="radio" name="gender" value="female"/>
      <input type="radio" name="gender" value="others"/><br>
reason<textarea rows="4" col="10" name="reason" ></textarea><br>
address<textarea rows="4" col="10" name="address"></textarea><br>
     <input type="submit" value="send"/>
</pre>
</form>
</body>
</html>