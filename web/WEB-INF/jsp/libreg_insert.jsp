<%-- 
    Document   : libreg_insert
    Created on : Apr 16, 2015, 2:38:19 PM
    Author     : Moumita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="libcreat.htm" modelAttribute="libIns">
    
    LIBRARY CARD NO.:<input type="text"  name="libCardNo" /><br>
    MEMBER TYPE ID:<input type="text"  name="memtypeId" /><br>
    STUDENT ID:<input type="text"  name="studentId" /><br>
    EMPLOYEE ID:<input type="text"  name="empId" /><br>
    <input type="Submit" value="Ok"/>   
</f:form>
