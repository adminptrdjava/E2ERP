<%-- 
    Document   : stfcrt
    Created on : 14 Apr, 2015, 7:14:15 PM
    Author     : DIPAK
--%>
<!--THIS IS THE CREATE JSP FOR STUDENT FEES DETAILS-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="stfcreate.htm" modelAttribute="sd">
    
    Student ID:<input type="text" name="studentId"/>
   Payment Mode:<input type="text"  name="paymentMode" />
   Payment Amount:<input type="text" name="paymentAmount" />
   Due Date:<input  type="text" name="dueDate"/>
   Payment Option:<input type="text" name="paymentOption"/>
   Cheque No:<input type="text" name="chequeNo" />
   Cheque Date:<input type="text" name="chequeDate"/>
   Due Amount:<input type="text" name="dueAmount" />
   Created By:<input type="text" name="createdBy" />
   Created On:<input type="text" name="createdOn" />
   Fees Isactive:<input type="text" name="feesIsactive"/>

    <input type="Submit" value="Ok"/>
</f:form>