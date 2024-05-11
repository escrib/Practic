<%-- Comentario en JSP
<%
	//Scriplet
	String empresa = (String)request.getAttribute("empresa");
	System.out.println(empresa);
%> --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<!-- ${Expression-Lenguaje} -->


<body>
		
		<c:if test="${not empty empresa }">
			Empresa ${ empresa } registrada!
		</c:if>
		<c:if test="${empty empresa }">
			Ninguna empresa registrada!
		</c:if>
		


</body>
</html>

