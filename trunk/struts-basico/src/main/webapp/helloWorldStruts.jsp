<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="struts-html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="struts-logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="struts-bean"%>
<html>
<head>
<title><struts-bean:message  key="helloWorld" /></title>
</head>
<body>
<h1><struts-bean:message  key="bienvenido" /></h1>

<struts-html:form action="/helloWorld">
<font style="color:red">
<struts-html:errors property="nombre"/> 
<struts-html:errors property="apellidos"/> 
</font>

	<struts-html:text property="nombre" /><br/>
	<struts-html:text property="apellidos" />
	<struts-html:submit value="saludar!" />
</struts-html:form>

<struts-html:form action="/helloBook">
	<struts-html:text property="titulo" />
	<struts-html:submit value="incluir" />
</struts-html:form>
</body>
</html>