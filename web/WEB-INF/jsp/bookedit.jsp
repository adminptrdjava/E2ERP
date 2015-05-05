<%-- 
    Document   : bookedit
    Created on : Apr 14, 2015, 6:46:22 PM
    Author     : Moumita
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f" %>
<p style="color: orangered">${EMsg}</p>
<f:form action="update1.htm" modelAttribute="bookid">
    BOOK_ID:<input type="hidden" name="bookId" value="${ur.bookId}"/><br>
    BOOK-Subtitle:<input type="text"  name="bookSubId" value="${ur.bookSubId}"/><br>
    BOOK-TITLE:<input type="text" name="bookTitle" value="${ur.bookTitle}"/><br>
   
    BOOK-AUTHOR:<input type="text"  name="bookAuthor" value="${ur.bookAuthor}"/><br>
    BOOK-PUBLISHER:<input type="text"  name="bookPublisher" value="${ur.bookPublisher}"/><br>
    BOOK-ISBN:<input type="text"  name="bookIsbn" value="${ur.bookIsbn}"/><br>
    BOOK-RACK_NO:<input type="text"  name="bookRackNo" value="${ur.bookRackNo}"/><br>
    PRICE:<input type="text"  name="bookPrice" value="${ur.bookPrice}"/><br>
    PURCHES-DATE:<input type="text"  name="bookPurDate" value="${ur.bookPurDate}"/><br>
    BOOK-VOLUME:<input type="text"  name="bookVolume" value="${ur.bookVolume}"/><br>
    BOOK-CREATEDBY:<input type="text"  name="bookCreatedby" value="${ur.bookCreatedby}"/><br>
    BOOK-CREATEDDT:<input type="text"  name="bookCreateddt" value="${ur.bookCreateddt}"/><br>
    BOOK-ISACTIVE:<input type="text"  name="bookIsactive" value="${ur.bookIsactive}"/><br>
      
    
    <input type="Submit" value="Ok"/>
</f:form>