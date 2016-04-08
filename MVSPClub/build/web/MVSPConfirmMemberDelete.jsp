<%-- 
    Document   : MVSPConfirmMemberDelete
    Created on : Apr 3, 2016, 1:04:10 PM
    Author     : spark1435
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <jsp:include page="includes/MVSPBanner.jsp"/>
              
    <section>
        <h2>Do you want to delete this member?</h2>
        <form action="MVSPMemberAdmin" method="post">
            <label>Full Name:</label>
            <span>${member.fullName}</span><br>
            <label>Email:</label>
            <span>${member.emailAddress}</span><br>
            <label>Phone:</label>
            <span>${member.phoneNumber}</span><br>
            <label>IT Program:</label>
            <span>${member.programName}</span><br>
            <label>Year Level:</label>
            <span>${member.yearLevel}</span><br>
            <br>
            <input type="hidden" name="action" value="deleteMember">
            <input type="hidden" name="emailAddress" value="${member.emailAddress}">
            <input type="submit" value="Yes">
        </form>

    </section>
        
    <jsp:include page="includes/MVSPFooter.jsp"/>
        
</html>
