<%-- 
    Document   : getAllcls
    Created on : 14 Apr, 2015, 1:11:42 AM
    Author     : Swarnendu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   



<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>ACTIVE/OR NOT</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="cls">
        <tr>
            <td>${cls.classId}</td>
            <td>${cls.className}</td>
            <td>${cls.classIsactive}</td>
            </c:forEach>
        </tr>
    </tbody>
</table>
