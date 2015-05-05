<%-- 
    Document   : clsdtl
    Created on : 14 Apr, 2015, 11:59:13 AM
    Author     : DIPAK
--%>
<!--THIS IS CLASS DETAIL JSP-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<a href="clscrt.htm">Add new</a>
<table border="1">
    <thead>
        <tr>
            <th>Class ID</th>
            <th>Class Name</th>
            <th>Class Isactive</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
        <tr>
            <td>${u.classId}</td>
            <td>${u.className}</td>
            <td>${u.classIsactive}</td>
            <td><a href="clsdel.htm?id=${u.classId}">Delete</a></td>_
            <td><a href="clsedt.htm?id=${u.classId}">Edit</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
