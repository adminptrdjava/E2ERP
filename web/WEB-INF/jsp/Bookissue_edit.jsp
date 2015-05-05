<%-- 
    Document   : Bookissue_edit
    Created on : Apr 16, 2015, 4:32:59 PM
    Author     : Moumita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="update_bookissue.htm" modelAttribute="bookissueid">
    <input type="hidden" name="issueId" value="${ur.issueId}"/><br>
  
    BOOK-ID: <select name="bookId">

        <option value="">${ur.bookId}</option>
        <c:forEach   items="${lst2}" var="op">
            <option >${op.bookId}</option>
        </c:forEach> 
    </select><br>
    MEMBER_ID:<input type="text"  name="memberId" value="${ur.memberId}"/><br>
    ISSUE_DATE:<input type="text"  name="issueDate"value="${ur.issueDate}" /><br>
    DUE_DATE:<input type="text"  name="dueDate" value="${ur.dueDate}" /><br>
    IS_ISSUED <select name="isIssued" value="${ur.isIssued}">

        <option>${ur.isIssued}</option>
        <option >Yes</option>
        <option >No</option>

    </select><br>
    <input type="Submit" value="Ok"/>   
</f:form>
