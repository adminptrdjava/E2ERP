<%-- 
    Document   : create
    Created on : 13 Apr, 2015, 1:07:06 PM
    Author     : DIPAK
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="create.htm" modelAttribute="usr">
   
    Uid:<input type="text" name="uid" />
    Email:<input type="text"  name="email" />
    <input type="Submit" value="Ok"/>
</f:form>