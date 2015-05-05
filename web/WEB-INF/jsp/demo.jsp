<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1">
    <thead>
        <tr>
            <th>Uid</th>
            <th>Pss</th>
            <th>Email</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="u">
        <tr>
            <td>${u.uid}</td>
            <td>${u.pass}</td>
            <td>${u.email}</td>
            <td><a href="del.htm?id=${u.id}">Delete</a></td>
            <td><a href="edt.htm?id=${u.id}">Edit</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
