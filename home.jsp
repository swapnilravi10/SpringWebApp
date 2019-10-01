<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Add	<form action="addStudent">
		<pre>
		Student Id<input type="text" name="id">
		Student Name<input type="text" name="name">
		Student Course<input type="text" name="course">
		<input type="submit">
		</pre>
	</form>
__________________________________________________________
Find<form action="getStudent">
		<pre>
		Student Id<input type="text" name="id">
		<input type="submit">
		</pre>
	</form>
___________________________________________________________
Delete<form action="deleteStudent">
		<pre>
		Student Id<input type="text" name="id">
		<input type="submit">
		</pre>
	</form>	
___________________________________________________________


Update<form action="updateStudent">
		<pre>
		Student Id<input type="text" name="id">
		Student Name<input type="text" name="name">
		Student Course<input type="text" name="course">
		<input type="submit">
		</pre>
	</form>		
</body>
</html>