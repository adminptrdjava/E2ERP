<%-- 
    Document   : fncrt
    Created on : 16 Apr, 2015, 4:20:02 PM
    Author     : DIPAK
--%>
<!--THIS IS CREATE PAGE FOR FINE SETTING-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="fncreate.htm" modelAttribute="fs">
    
     Member Type:<input type="text" name="memberType" />
   Due Day:<input type="text"  name="dueDay"/>
   Fine Per Day:<input type="text" name="finePerday" />
   
    <input type="Submit" value="Ok"/>
</f:form>