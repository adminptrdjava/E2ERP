<%-- 
    Document   : sdfdtl
    Created on : 14 Apr, 2015, 4:08:39 PM
    Author     : DIPAK
--%>
<!--THIS IS STUDENT DETAIL JSP-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<a href="stfcrt.htm">Add new</a>
<table border="1">
    <thead>
        <tr>
            <th>student Fees Details id</th>
            <th>student Id</th>
            <th>payment Mode</th>
            <th>payment Amount</th>
            <th>due Date</th>
            <th> payment Option</th>
            <th>cheque No</th>
            <th>cheque Date</th>
            <th>due Amount</th>
            <th>created By</th>
            <th>created On</th>
            <th>feesIsactive</th
            
           
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
        <tr>
            <td>${u.studentFeesDetailsid}</td>
            <td>${u.studentId}</td>
            <td>${u.paymentMode}</td>
            <td>${u.paymentAmount}</td>
            <td>${u.dueDate}</td>
            <td>${u.paymentOption}</td>
            <td>${u.chequeNo}</td>
            <td>${u.chequeDate}</td>
            <td>${u.dueAmount}</td>
            <td>${u.createdBy}</td>
            <td>${u.createdOn}</td>
            <td>${u.feesIsactive}</td>
            <td><a href="stfdel.htm?id=${u.studentFeesDetailsid}">Delete</a></td>
            <td><a href="stfedt.htm?id=${u.studentFeesDetailsid}">Edit</a></td>
           
        </tr>
        </c:forEach>
    </tbody>
</table>
 <!--private Integer studentFeesDetailsid;
     private int studentId;
     private String paymentMode;
     private BigDecimal paymentAmount;
     private String dueDate;
     private int paymentOption;
     private String chequeNo;
     private String chequeDate;
     private BigDecimal dueAmount;
     private Integer createdBy;
     private Date createdOn;
     private String feesIsactive;-->