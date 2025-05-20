<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action = "/ServletTest/servlet/siryouseikyuu" method = "POST">
	
	<p>氏名: <input type = "text" name = "name" required></p>
	<p>会社: <input type = "text" name = "company" ></p>
	<p>メールアドレス: <input type = "text" name = "email" required></p>
	<p>お問い合わせ内容: <br><textarea rows="6" cols="50" name = "contact" required></textarea></p>
	<p>メルマガ種類:</p>
	<p><input type = "checkbox" name = "merumagasyurui" value = "総合案内">総合案内</p>
	<p><input type = "checkbox" name = "merumagasyurui" value = "セミナー案内">セミナー案内</p>
	<p><input type = "checkbox" name = "merumagasyurui" value = "求人採用情報">求人採用情報</p>
	<p>資料請求希望</p>
	<p>Yes<input type = "radio" name = "hopeYesOrNo" value = "Yes"></p>
	<p>No<input type = "radio" name = "hopeYesOrNo" value = "No"></p>
	<input type = "submit" value = "送信">
	
	</form>


</body>
</html>