<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="struts-html"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="struts-logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="struts-bean"%>
<fmt:setBundle basename="Traducciones" var="trad" />
<html>
<head>
<title><struts-bean:message  key="helloWorld" /></title>
</head>
<body>
<p>Yo te conozco ${requestScope.saludoForm.nombre} ${requestScope.saludoForm.apellidos}!</p>
</body>
</html>