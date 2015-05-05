<%-- 
    Document   : bookinsert
    Created on : Apr 14, 2015, 6:50:29 PM
    Author     : Moumita
--%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="creat.htm" modelAttribute="bookIns">
    BOOK-Subtitle:<input type="text"  name="bookSubId" /><br>
    BOOK-TITLE:<input type="text" name="bookTitle" /><br>
    BOOK-AUTHOR:<input type="text"  name="bookAuthor" /><br>
    BOOK-PUBLISHER:<input type="text"  name="bookPublisher" /><br>
    BOOK-ISBN:<input type="text"  name="bookIsbn" /><br>
    BOOK-RACK_NO:<input type="text"  name="bookRackNo" /><br>
    PRICE:<input type="text"  name="bookPrice" /><br>
    PURCHES-DATE:<input type="text"  name="bookPurDate" /><br>
    BOOK-VOLUME:<input type="text"  name="bookVolume" /><br>
    BOOK-CREATEDBY:<input type="text"  name="bookCreatedby" /><br>
    BOOK-CREATEDDT:<input type="text"  name="bookCreateddt" /><br>
    BOOK-ISACTIVE:<input type="text"  name="bookIsactive"/><br>

    <input type="submit" value="SAVE"/>
   
</f:form>