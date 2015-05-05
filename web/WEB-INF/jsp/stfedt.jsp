<%-- 
    Document   : stfedt
    Created on : 14 Apr, 2015, 6:40:05 PM
    Author     : DIPAK
--%>
<!--THIS IS STUDENT FEES EDIT JSP PAGE-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="stfupdt.htm" modelAttribute="sd">
    <input type="hidden" name="studentFeesDetailsid" value="${sd.studentFeesDetailsid}"/>
    Student ID:<input type="text" name="studentId" value="${sd.studentId}"/>
   Payment Mode:<input type="text"  name="paymentMode" value="${sd.paymentMode}"/>
   Payment Amount:<input type="text" name="paymentAmount" value="${sd.paymentAmount}"/>
   Due Date:<input  type="text" name="dueDate" value="${sd.dueDate}"/>
   Payment Option:<input type="text" name="paymentOption" value="${sd.paymentOption}"/>
   Cheque No:<input type="text" name="chequeNo" value="${sd.chequeNo}"/>
   Cheque Date:<input type="text" name="chequeDate" value="${sd.chequeDate}"/>
   Due Amount:<input type="text" name="dueAmount" value="${sd.dueAmount}"/>
   Created By:<input type="text" name="createdBy" value="${sd.createdBy}"/>
   Created On:<input type="text" name="createdOn" value="${sd.createdOn}"/>
   Fees Isactive:<input type="text" name="feesIsactive" value="${sd.feesIsactive}"/>

    <input type="Submit" value="Ok"/>
</f:form>