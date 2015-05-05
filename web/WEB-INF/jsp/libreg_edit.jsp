<%-- 
    Document   : libreg_edit
    Created on : Apr 16, 2015, 2:39:16 PM
    Author     : Moumita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="updatelib.htm" modelAttribute="lib">
    <input type="hidden" name="libregSlid" value="${ur.libregSlid}"/><br>
    LIBRARY CARD NO.:<input type="text"  name="libCardNo" value="${ur.libCardNo}"/><br>
    MEMBER TYPE ID:<input type="text"  name="memtypeId" value="${ur.memtypeId}"/><br>
    STUDENT ID:<input type="text"  name="studentId" value="${ur.studentId}"/><br>
    EMPLOYEE ID:<input type="text"  name="empId" value="${ur.empId}"/><br>
    <input type="Submit" value="Ok"/>
</f:form>