<%-- 
    Document   : bookissue_master
    Created on : Apr 16, 2015, 4:31:54 PM
    Author     : Moumita
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<a href="bookissue_create.htm"> New BOOK Issue Details >></a><br><br>
Book Details
<table border="1">
    <thead>
        <tr>
            <th>ISSUE_ID</th>
            <th>BOOK-ID</th>
            <th>MEMBER_ID</th>
            <th>ISSUE_DATE</th>
            <th>DUE_DATE</th>
            <th>IS_ISSUED</th>            
            <th>ACTION</th> 

        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
            <tr>
                <td>${u.issueId}</td>
                <td>${u.bookId}</td>
                <td>${u.memberId}</td>
                <td>${u.issueDate}</td>
                <td>${u.dueDate}</td>
                <td>${u.isIssued}</td>


                <td><a href="bookissue_del.htm?id=${u.issueId}">Delete</a>|
                    <a href="bookissue_edt.htm?id=${u.issueId}">Edit</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
