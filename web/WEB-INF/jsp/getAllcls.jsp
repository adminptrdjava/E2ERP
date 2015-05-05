<%-- 
    Document   : getAllcls
    Created on : 14 Apr, 2015, 1:11:42 AM
    Author     : Swarnendu
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



<table id="sales" class="display">
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
