<%-- 
    Document   : edit
    Created on : 10 Apr, 2015, 5:28:50 PM
    Author     : DIPAK
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="update.htm" modelAttribute="usr">
    <input type="hidden" name="id" value="${ur.id}"/>
    Uid:<input type="text" name="uid" value="${ur.uid}"/>
    Email:<input type="text"  name="Email" value="${ur.email}"/>
    <input type="Submit" value="Ok"/>
</f:form>