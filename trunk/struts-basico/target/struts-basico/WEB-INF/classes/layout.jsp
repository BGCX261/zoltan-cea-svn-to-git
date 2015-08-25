<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><decorator:title default="{ Unknown Page - shouldn't see this, since
    pages should define title }" /></title>
    <link href="<%= request.getContextPath() %>/css/main.css" TYPE="text/css" rel="stylesheet"/>
    <%--pulls the header from the page we are decorating and inserts it here --%>
    <decorator:head />
</head>

<body >
<table width="100%" height="100%" class="tablita">
    <tr>
        <td id="header" colspan="2">
           <bean:message key="label.header" />
        </td>
    </tr>
    <tr>
        <td valign="top" width="200">
            <%-- grabs the navigation.jsp page and decorates with the
            panel decorator and puts it here --%>
        </td>
        <td>
        <table width="100%" height="100%">
            <tr>
                <td id="pageTitle">
                    <span class="pageTitle">
                        <%--pulls the title from the page we are
                        decorating and inserts it here --%>
                        <decorator:title />
                    </span>
                </td>
            </tr>
            <tr>
                <td valign="top" height="100%">
                    <%--pulls the body from the page we are
                    decorating and inserts it here --%>
                    <decorator:body />
                </td>
            </tr>
        </table>
        </td>
    </tr>
    <tr>
        <td id="footer" colspan="2">
            <bean:message key="label.footer" />
        </td>
    </tr>
</table>
</body>
</html>