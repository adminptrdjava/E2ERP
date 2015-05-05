<%-- 
    Document   : feedt
    Created on : 16 Apr, 2015, 6:41:06 PM
    Author     : DIPAK
--%>
<!--FEES EDIT PAGE-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="feupdt.htm" modelAttribute="fs">
    <input type="hidden" name="feesId" value="${fs.feesId}"/>
   Class:<input type="text"  name="class_" value="${fs.class_}"/>
   Admission Fee:<input type="text" name="admissionFee" value="${fs.admissionFee}"/>
   Tution Fee:<input  type="text" name="tutionFee" value="${fs.tutionFee}"/>
   Computer Fee:<input type="text" name="computerFee" value="${fs.computerFee}"/>
   Devlopment Fee:<input type="text" name="devlopmentFee" value="${fs.devlopmentFee}"/>
  Cauton Money:<input type="text" name="cautonMoney" value="${fs.cautonMoney}"/>
   Anual Music:<input type="text" name="anualMusic" value="${fs.anualMusic}"/>
   Medical Fee:<input type="text" name="medicalFee" value="${fs.medicalFee}"/>
   Total:<input type="text" name="total" value="${fs.total}"/>
   CreatedBy<input type="text" name="createdBy" value="${fs.createdBy}"/>   
   Created On:<input type="text"  name="createdOn" value="${fs.createdOn}"/>
   Fees Is Active:<input type="text" name="feesIsactive" value="${fs.feesIsactive}"/>
   
    <input type="Submit" value="Ok"/>
</f:form>