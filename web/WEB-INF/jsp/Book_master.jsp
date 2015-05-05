<%-- 
    Document   : Book_master
    Created on : Apr 14, 2015, 4:02:45 PM
    Author     : Moumita
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<a href="create.htm"> New BOOK Details >></a><br><br>
Book Details
<table border="1">
    <thead>
        <tr>
            <th>BOOK-ID</th>
            <th>BOOK-SUB_ID</th>
            <th>BOOK-TITLE</th>
            <th>BOOK-AUTHOR</th>
            <th>BOOK-PUBLISHER</th>
            <th>BOOK-ISBN</th> 
            <th>BOOK-RACK_NO</th> 
            <th>PRICE</th>
            <th>PURCHES-DATE</th>
            <th>BOOK-VOLUME</th>
            <th>BOOK-CREATEDBY</th> 
            <th>BOOK-CREATEDDT</th>
            <th>BOOK-ISACTIVE</th>
            <th>ACTION</th> 

        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
            <tr>
                <td>${u.bookId}</td>
                <td>${u.bookSubId}</td>
                <td>${u.bookTitle}</td>
                <td>${u.bookAuthor}</td>
                <td>${u.bookPublisher}</td>
                <td>${u.bookIsbn}</td>
                <td>${u.bookRackNo}</td>
                <td>${u.bookPrice}</td>
                <td>${u.bookPurDate}</td>
                <td>${u.bookVolume}</td>
                <td>${u.bookCreatedby}</td>
                <td>${u.bookCreateddt}</td>
                <td>${u.bookIsactive}</td>

                <td><a href="dell.htm?id=${u.bookId}">Delete</a>|
                    <a href="edtt.htm?id=${u.bookId}">Edit</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
