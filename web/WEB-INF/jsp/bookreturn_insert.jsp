<%-- 
    Document   : bookreturn_insert
    Created on : Apr 16, 2015, 6:04:18 PM
    Author     : Moumita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<link href="<c:url value="/resources/assets/jsDatePick_ltr.min.css" />" rel="stylesheet" media="all">
<script src="<c:url value="/resources/assets/jsDatePick.min.1.3.js" />"></script>
<script src="<c:url value="/resources/assets/jquery.1.4.2.js" />"></script>
<script type="text/javascript">
	window.onload = function(){
               // alert("hi");
		new JsDatePick({
			useMode:2,
			target:"calField",
			dateFormat:"%Y-%m-%d"
			/*selectedDate:{				This is an example of what the full configuration offers.
				day:5,						For full documentation about these settings please see the full version of the code.
				month:9,
				year:2006
			},
			yearsRange:[1978,2020],
			limitToToday:false,
			cellColorScheme:"beige",
			dateFormat:"%m-%d-%Y",
			imgPath:"/rs/img/",
			weekStartDay:1*/
		});
	};
        
</script>
<title>New Return Book Details>>...</title>
   

    
 <div class="panel-body">
     <div class="table-responsive">
                                
      <f:form action="insert_return.htm" modelAttribute="bookretrnIns">
          <table class="table" border="1" width="0" cellspacing="4">
       
     <tbody>
            
            <tr>
                <td>BOOK ID:</td>
                <td><input  type="text" name="bookId" ></td>
            </tr>
            <tr>
                <td>MEMBER ID:</td>
                <td><input    type="text" name="memberId" ></td>
            </tr>
            <tr>
                <td>RETURN DATE:</td>
                <td><input  type="text"  name="returnDate"></td>
            </tr>
           <tr>
                <td>FINE:</td>
                <td><input  type="text"  name="fine" ></td>
            </tr>
                
            </tr>
        </tbody>
    </table>
    <input type="Submit" value="Ok"/>   
            
        </f:form>
         
         </div>
 </div>
