<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1> /views/member/join.jsp </h1>

	<h2> 회원가입 </h2>

	<fieldset>
		<form action="/member/join" method="post">
			아이디 : <input type="text" name="member_id"><br>	
			비밀번호 : <input type="password" name="member_pw"><br>	
			이름 : <input type="text" name="member_name"><br>	
			이메일 : <input type="email" name="member_email"><br>
			휴대폰번호 : <input type="text" name="member_phone"><br>
			닉네임 : <input type="text" name="member_nick"><br>
			주소 : <input type="text" name="member_address"><br> 
			<hr>
			<input type="submit" value="회원가입">
			
			
		
		</form>
	</fieldset>


</body>
</html>