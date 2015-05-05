<%-- 
    Document   : bookissue_insert
    Created on : Apr 16, 2015, 4:35:00 PM
    Author     : Moumita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="bookissue_creat.htm" modelAttribute="bookIssueIns">

   
     BOOK-ID: <select name="bookId">
            
                <option value="">Select book id</option>
                <c:forEach   items="${lst2}" var="op">
                <option >${op.bookId}</option>
            </c:forEach> 
     </select><br>
    MEMBER_ID:<input type="text"  name="memberId" /><br>
    ISSUE_DATE:<input type="text"  name="issueDate" /><br>
    DUE_DATE:<input type="text"  name="dueDate" /><br>
    
       IS_ISSUED <select name="isIssued">
            
                <option value="">---</option>
                <option >Yes</option>
                <option >No</option>
            
       </select><br>
    <input type="Submit" value="Ok"/>   
</f:form>
