<%-- 
    Document   : clsedt
    Created on : 14 Apr, 2015, 1:16:10 PM
    Author     : DIPAK
--%>
<!--THIS IS FOR CLASS DETAIL EDIT JSP-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="clsupdt.htm" modelAttribute="cm">
    <input type="hidden" name="classId" value="${cm.classId}"/>
    Class Name:<input type="text" name="className" value="${cm.className}"/>
    Class Active:<input type="text"  name="classIsactive" value="${cm.classIsactive}"/>
    <input type="Submit" value="Ok"/>
</f:form>