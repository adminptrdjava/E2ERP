<%-- 
    Document   : Libreg_master
    Created on : Apr 16, 2015, 2:36:36 PM
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

<a href="lib_create.htm"> New Libreary Registration Details >></a><br><br>
<table id="lib" border="1" >
    <thead>
        <tr>
            <th>LIBRARY REGISTRATION SERIAL ID</th>
            <th>LIBRARY CARD NO.</th>
            <th>MEMBER TYPE ID</th>
            <th>STUDENT ID</th>
            <th>EMPLOYEE ID</th>
            <th>Action</th>
            
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
            <tr>
                <td>${u.libregSlid}</td>
                <td>${u.libCardNo}</td>
                <td>${u.memtypeId}</td>
                <td>${u.studentId}</td>
                <td>${u.empId}</td>

                <td><a href="dellib.htm?id=${u.libregSlid}">Delete</a>|
                    <a href="edtlib.htm?id=${u.libregSlid}">Edit</a></td>
                
        </tr>
    </tbody>
    </c:forEach>
</table>
