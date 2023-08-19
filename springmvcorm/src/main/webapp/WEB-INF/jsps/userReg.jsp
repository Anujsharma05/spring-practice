<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script>
$(document).ready(function() {
	console.log('inside user reg');
	$("#id").change(function(){
		$.ajax({
			url: 'validate-email',
			data: {
				id: $("#id").val()
			},
			success: function(responseText) {
				$("#errorMsg").text(responseText);
				
				if(responseText != '') {
					$("#id").focus();
				}
			}
		
		})
	});
	
});


</script>
</head>
<body>
	<form action="register-user" method="post">
		<pre>
			ID: <input type="number" name="id" id="id" /> <span id="errorMsg"></span>
			Name: <input type="text" name="name" id="name" />
			Email: <input type="email" name="email" id="email" />
		<input type="submit" name="register" />
		</pre>
	</form>
	
	<br /> ${result}
</body>
</html>