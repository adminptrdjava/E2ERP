<%-- 
    Document   : fecrt
    Created on : 16 Apr, 2015, 7:09:24 PM
    Author     : DIPAK
--%>
<!--THIS IS FEE CREATE-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="fecreate.htm" modelAttribute="fs">
    
   Class:<input type="text"  name="class_" />
   Admission Fee:<input type="text" name="admissionFee" />
   Tution Fee:<input  type="text" name="tutionFee" />
   Computer Fee:<input type="text" name="computerFee" />
   Devlopment Fee:<input type="text" name="devlopmentFee" />
  Cauton Money:<input type="text" name="cautonMoney" />
   Anual Music:<input type="text" name="anualMusic" />
   Medical Fee:<input type="text" name="medicalFee" />
   Total:<input type="text" name="total" />
   CreatedBy<input type="text" name="createdBy" />   
   Created On:<input type="text"  name="createdOn" />
   Fees Is Active:<input type="text" name="feesIsactive" />
   
    <input type="Submit" value="Ok"/>
    </f:form>