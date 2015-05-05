<%-- 
    Document   : getAllstd
    Created on : 16 Apr, 2015, 7:38:12 AM
    Author     : Swarnendu
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  <link href="<c:url value="/resources/assets/GRID/css/demo_page.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/demo_table.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/demo_table_jui.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/jquery-ui-1.8.24.custom.css"/>" rel="stylesheet" />
<script src="<c:url value="/resources/assets/GRID/js/jquery-min.js"/>" type="text/javascript"></script>
 <script src="<c:url value="/resources/assets/GRID/js/jquery.dataTables.js"/>" type="text/javascript"></script>


 
 <script type="text/javascript">
var j = jQuery.noConflict();
	    j(document).ready(function () {

	            j("#stud").DataTable({

	                "sPaginationType": "full_numbers",

	                "bJQueryUI": true              

	            });

	        });

	 </script>



<table id="stud" class="display">
    <thead>
    <th>ID</th>
     <th>ADMISION ON</th>
      <th>Student ID</th>
       <th>Student Reg ID</th>
        <th>ID</th>
         <th>ID</th>
          <th>ID</th>
           <th>ID</th>
            <th>ID</th>
            
    </thead>
    <c:forEach items="${lst}" var="st">
        <tr>
            <td> ${st.stuSeriId}</td>
            <td> ${st.stuAdmissionno}</td>
            <td> ${st. stuStudentid}</td>
            <td> ${st.stuRegistrationid}</td>  
            <td> ${st.stuAdmissiondate}</td>  
            <td> ${st.stuAdmissionstatus}</td>  
            <td> ${st.stuStudentname}</td>  
            <td> ${st.stuDob}</td>  
            <td> ${st.stuGender}</td>  
             
   
        </tr>
    </c:forEach>
    
</table>