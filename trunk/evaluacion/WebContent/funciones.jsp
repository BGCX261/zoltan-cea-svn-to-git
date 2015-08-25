<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %> 
<%@ taglib uri="/evaluacion" prefix="p" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>funciones</title>
	</head>
	<body>
		<c:set scope="request" var="text1" value="un texto de prueba"></c:set>
		<c:set scope="request" var="text2" value="otro texto de prueba"></c:set>
		
		<h3>fn:contains()</h3>
		<c:if test="${fn:contains(requestScope.text1,'prueba')}">
		<p>Es true y no </c:if>false.</p>
		
		<hr><h3>fn:containsIgnoreCase()</h3>
		<c:if test="${fn:containsIgnoreCase(requestScope.text2,'TExTO')}">
		<p>Es true y no </c:if>false.</p>
		
		<hr><h3>fn:endsWith()</h3>
		<c:if test="${fn:endsWith(requestScope.text1, 'eba')}">
		<p>Mi texto finaliza en 'eba'</p></c:if>
		
		<hr><h3>fn:escapeXml()</h3>
		${fn:escapeXml('<br> text1 </br>')}
		
		<hr><h3>fn:indexOf()</h3>
		La posición tras la cuál se encuentra la 1ª e es: ${fn:indexOf(requestScope.text1, 'e')}
		
		<hr><h3>fn:join()</h3>
		<c:set scope='request' var='miArray' value="${fn:split(requestScope.text1 ,';')}"></c:set>
		${fn:join(requestScope.miArray, ';')}
		
		<hr><h3>fn:length()</h3>
		Hay ${fn:length(requestScope.text2)} caracteres en la 2ª cadena de texto.
		
		<hr><h3>fn:replace()</h3>
		Reemplazo espacios: ${fn:replace(requestScope.text1, ' ', '_')}
		
		<hr><h3>fn:split()</h3>
		El numero de palabras de mi texto son 
		${fn:length(fn:split(requestScope.text2 ,' '))}
		
		<hr><h3>fn:startsWith()</h3>
		<c:if test="${fn:startsWith(requestScope.text1, 'un')}">
		<p>El texto empieza por un</p></c:if>
		
		<hr><h3>fn:substring()</h3>
		Un cacho de mi frase: ${fn:substring(requestScope.text1, 6, -1)}
		
		<hr><h3>fn:substringAfter()</h3>
		El cacho posterior a 'un ': ${fn:substringAfter(requestScope.text1, 'un ')}
		
		<hr><h3>fn:substringBefore()</h3>
		El cacho anterior a 'prueba': ${fn:substringBefore(requestScope.text1, 'prueba')}
		
		<hr><h3>fn:toLowerCase()</h3>
		Minusculas: ${fn:toLowerCase(requestScope.text1)}
		
		<hr><h3>fn:toUpperCase()</h3>
		Mayusculas: ${fn:toUpperCase(requestScope.text1)}
		
		<hr><h3>fn:trim()</h3>
		Esta es mi frase: ${fn:trim(requestScope.text1)}
		
	</body>
</html>