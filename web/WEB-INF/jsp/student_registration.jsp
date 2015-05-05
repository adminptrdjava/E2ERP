<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="<c:url value="/resources/assets/GRID/css/demo_page.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/demo_table.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/demo_table_jui.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/assets/GRID/css/jquery-ui-1.8.24.custom.css"/>" rel="stylesheet" />
<script src="<c:url value="/resources/assets/GRID/js/jquery-min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/assets/GRID/js/jquery.dataTables.js"/>" type="text/javascript"></script>



<script type="text/javascript">
    var j = jQuery.noConflict();
    j(document).ready(function () {

        j("#sales").DataTable({
            "sPaginationType": "full_numbers",
            "bJQueryUI": true

        });

    });

</script>



<table id="stu_regs" class="display">
    <thead>
        <tr>
            <th>REGISTRATION ID</th>
            <th>SERIAL ID</th>
            <th>ENQUARY ID</th>
            <th>BLOOD GROUP</th>
            <th>PHYSICALLY CHALLENGED</th>
            <th>CHALLENGE TYPE</th>
            <th>NATIONALITY</th>
            <th>REMARK</th>
            <th>PICTURE</th>
            <th>REGISTRATION DATE</th>
            <th>ADMISSION STATUS</th>

        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lst}" var="st">
            <tr>
                <td>${st.regid}</td>
                <td>${st.slid}</td>
                <td>${st.enqid}</td>
                <td>${st.bloodgroup}</td>
                <td>${st.physicallychallnged}</td>
                <td>${st.challengetype}</td>
                <td>${st.nationality}</td>
                <td>${st.region}</td>
                <td>${st.remark}</td>
                <td>${st.picture}</td>
                <td>${st.regdate}</td>
                <td>${st.admissionstatus}</td>
                <td>${st.enqIsactive}</td>


            </c:forEach>
        </tr>
    </tbody>
</table>
