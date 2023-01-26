<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada?acao=NovaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/formEstilo.css" />
	</head>
	<body>
	
		<form action="${linkServletNovaEmpresa }" method="post">
		
		<div>
			<label for="nome">Nome</label>
			<input type="text" name="nome" id="nome"/>
		</div>
		<div>
			<label for="dataAbertura">DataAbertura</label>
			<input type="text" name="data"  id="dataAbertura"/>
		</div>
		<div>
			<input type="submit"  class="button"/>
		</div>
		</form>
	
	</body>
</html>