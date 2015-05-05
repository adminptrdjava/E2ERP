<%-- 
    Document   : clscrt
    Created on : 14 Apr, 2015, 1:49:34 PM
    Author     : DIPAK
--%>
<!--THIS PAGE IS FOR CLASS DETAIL CREATE-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="clscreate.htm" modelAttribute="cm">
   
    Class Name:<input type="text" name="className" />
    Class Active:<input type="text"  name="classIsactive" />
    <input type="Submit" value="Ok"/>
</f:form>