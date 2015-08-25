<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="struts-html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="struts-logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="struts-bean"%>
<html>
<head>
<title><struts-bean:message  key="helloClub" /></title>
</head>
<body>
<h1><struts-bean:message  key="bienvenido" /></h1>

<struts-html:form action="/helloClub">
<font style="color:red">
<struts-html:errors property="nick"/> 
<struts-html:errors property="edad"/> 
</font>

	<struts-html:text property="nick" /><br/>
	<struts-html:text property="edad" />
	<struts-html:submit value="Entrar" />
</struts-html:form>
</body>
</html>