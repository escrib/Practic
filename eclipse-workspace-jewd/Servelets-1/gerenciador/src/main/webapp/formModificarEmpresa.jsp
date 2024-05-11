<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<%-- c:url es lo que viene luego del contexto--%>
<%-- c:url conecta el JSP con el SERVlet --%>
<c:url value="/modificarEmpresa" var="LinkServletNuevaEmpresa"/> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="${LinkServletNuevaEmpresa}" method="post">
	
		Nombre empresa: <input type="text" name="nombre" value="${empresa.nombre }"/> <br><br> <%-- //value ingresa valor de variable --%>
		Fecha Abertura: <input type="text" name="fecha" value="<fmt:formatDate value="${empresa.fechaAbertura }" pattern="dd/MM/yyyy"/>"/><br><br>
		id: <input type="hidden" name="id" value="${empresa.id}"/><br><br>
		
		<input type="submit"/>
	
	</form>

</body>
</html>