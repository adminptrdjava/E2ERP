<%-- 
    Document   : fnedt
    Created on : 16 Apr, 2015, 4:03:22 PM
    Author     : DIPAK
--%>
<!--THIS IS EDIT PAGE FOR FINE SETTING-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="fnupdt.htm" modelAttribute="fs">
    <input type="hidden" name="memtypeId" value="${fs.memtypeId}"/>
    Member Type:<input type="text" name="memberType" value="${fs.memberType}"/>
   Due Day:<input type="text"  name="dueDay" value="${fs.dueDay}"/>
   Fine Per Day:<input type="text" name="finePerday" value="${fs.finePerday}"/>
   
    <input type="Submit" value="Ok"/>
</f:form>