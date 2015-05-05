<%-- 
    Document   : feedtl
    Created on : 16 Apr, 2015, 4:51:34 PM
    Author     : DIPAK
--%>
<!--THIS IS FEES DETAILS JSP PAGE-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<a href="fecrt.htm">Add new</a>
<table border="1">
    <thead>
        <tr>
            <th>Fees Id</th>
            <th>Class</th>
            <th>Admission Fee</th>
            <th>Tution Fee</th>
            <th>Computer Fee</th>
            <th>Devlopment Fee</th>
            <th>Cauton Money</th>
            <th>Anual Music</th>
            <th>Medical Fee</th>
            <th>Total</th>
            <th>Created By</th>
            <th>Created On</th>
            <th>Fees Is Active</th>
            
           
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
        <tr>
            <td>${u.feesId}</td>
            <td>${u.class_}</td>
            <td>${u.admissionFee}</td>
            <td>${u.tutionFee}</td>
            <td>${u.computerFee}</td>
            <td>${u.devlopmentFee}</td>
            <td>${u.cautonMoney}</td>
            <td>${u.anualMusic}</td>
            <td>${u.medicalFee}</td>
            <td>${u.total}</td>
            <td>${u.createdBy}</td>
            <td>${u.createdOn}</td>
            <td>${u.feesIsactive}</td>
           <td><a href="fedel.htm?id=${u.feesId}">Delete</a></td>
           <td><a href="feedt.htm?id=${u.feesId}">Edit</a></td>
           
           
        </tr>
        </c:forEach>
    </tbody>
</table>
