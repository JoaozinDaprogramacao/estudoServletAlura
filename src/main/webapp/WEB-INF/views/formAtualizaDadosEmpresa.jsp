<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada?acao=AlteraDados" var="linkServletAlteraEmpresa"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/formEstilo.css" />
	</head>
	<body>
	
		<form action="${linkServletAlteraEmpresa }" method="post">
		<input value="${empresa.id}" type="hidden" name="id"/>
		<div>
			<label for="nome">Nome</label>
			<input value="${empresa.nome}" type="text" name="nome" id="nome"/>
		</div>
		<div>
			<label for="dataAbertura">DataAbertura</label>
			<input value="<fmt:formatDate value='${empresa.dataAbertura }' pattern='dd/MM/yyyy'/>"
			type="text" name="data"  id="dataAbertura"/>
		</div>
		<div>
			<input type="submit"  class="button"/>
		</div>
		</form>
	
	</body>
</html>