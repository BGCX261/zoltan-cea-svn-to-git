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
<p>Bienvenido ${requestScope.clubForm.nick}.</p>
</body>
</html>