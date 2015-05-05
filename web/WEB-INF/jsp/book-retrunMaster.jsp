<%-- 
    Document   : book-retrunMaster
    Created on : Apr 16, 2015, 6:03:34 PM
    Author     : Moumita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="<c:url value="/resources/assets/GRID/css/demo_page.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/demo_table.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/demo_table_jui.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/jquery-ui-1.8.24.custom.css"/>" rel="stylesheet" />
<script src="<c:url value="/resources/assets/GRID/js/jquery-min.js"/>" type="text/javascript"></script>
 <script src="<c:url value="/resources/assets/GRID/js/jquery.dataTables.js"/>" type="text/javascript"></script>


 
 <script type="text/javascript">
var j = jQuery.noConflict();
	    j(document).ready(function () {

	            j("#sales").DataTable({

	                "sPaginationType": "full_numbers",

	                "bJQueryUI": true              

	            });

	        });

	 </script>


<a href="retrun_create.htm"> New BOOK Details >></a><br><br>
<table border="1">
    <thead>
        <tr>
            <th>Return ID</th>
            <th>Book Id</th>
            <th>Member Id</th>
            <th>return Date</th>
            <th>Fine</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
        <tr>
            <td>${u.returnId}</td>
            <td>${u.bookId}</td>
            <td>${u.memberId}</td>
            <td>${u.returnDate}</td>
            <td>${u.fine}</td>
            
            <td><a href="retrun_del.htm?id=${u.returnId}">Delete</a>|
                 <a href="retrun_edt.htm?id=${u.returnId}">Edit</a></td>
        </tr>
    </c:forEach>
        </tbody>
    
</table>
 </tbody>
    