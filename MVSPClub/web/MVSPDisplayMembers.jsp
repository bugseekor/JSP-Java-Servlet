<%-- 
    Document   : MVSPDisplayMembers
    Created on : Apr 1, 2016, 2:30:43 PM
    Author     : spark1435
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="includes/MVSPBanner.jsp"/>
    
<table>
    <tr>
        <th>Email</th>
        <th>Program</th>
        <th>Year</th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${requestScope.members}">
        <tr>
            <td>
                ${item.emailAddress}
            </td>
            <td>
                ${item.programName}
            </td>
            <td>
                ${item.yearLevel}
            </td>
            <td>
                <a href="<c:url value='MVSPMemberAdmin?action=displayMember&amp;emailAddress=${item.emailAddress}'/>">Update</a>
                &nbsp;&nbsp;
                <a href="<c:url value='MVSPMemberAdmin?action=confirmDeleteMember&amp;emailAddress=${item.emailAddress}'/>">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<p>
    <form action="MVSPMemberAdmin">
        <input type="hidden" name="action" value="addMember">
        <input type="submit" value="Add Member">
    </form>
</p>

<jsp:include page="includes/MVSPFooter.jsp"/>
