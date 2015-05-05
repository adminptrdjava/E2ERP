<%-- 
    Document   : fndtl
    Created on : 16 Apr, 2015, 3:28:18 PM
    Author     : DIPAK
--%>
<!--THIS DETAIL PAGE FOR FINESETTING-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<a href="fncrt.htm">Add new</a>
<table border="1">
    <thead>
        <tr>
            <th>Member type Id</th>
            <th>Member Type</th>
            <th>Due Day</th>
            <th>Fine Per Day</th>
            
            
           
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
        <tr>
            <td>${u.memtypeId}</td>
            <td>${u.memberType}</td>
            <td>${u.dueDay}</td>
            <td>${u.finePerday}</td>
            <td><a href="fndel.htm?id=${u.memtypeId}">Delete</a></td>
            <td><a href="fnedt.htm?id=${u.memtypeId}">Edit</a></td>
          
           
        </tr>
        </c:forEach>
    </tbody>
</table>