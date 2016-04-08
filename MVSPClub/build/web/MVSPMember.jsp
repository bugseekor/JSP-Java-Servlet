<%-- 
    Document   : MVSPMember
    Created on : Apr 1, 2016, 2:50:24 PM
    Author     : spark1435
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <jsp:include page="includes/MVSPBanner.jsp"/>
    
    <section>
        <h2>New Member Registration Form</h2>
        
        <p><i>${errorMessage}</i></p>
        <form action="MVSPMemberAdmin?action=registerMember" method="post">
            <label class="pad_top">Full Name:</label>
            <input style="width: 200" type="text" name="fullName" 
                   value="${member.fullName}"><br>
            <label class="pad_top">Email:</label>
            <input type="email" style="width: 300" name="emailAddress" 
                   value="${member.emailAddress}"><br>
            <label class="pad_top">Phone:</label>
            <input type="tel" style="width: 100" name="phoneNumber" 
                   value="${member.phoneNumber}"><br>
            <label class="pad_top">IT Program:</label>
            <select name="programName" >
                <option value="CAD" ${member.programName == "CAD" ? 'selected="selected"' : ''}>
                    CAD</option>
                <option value="CP" ${member.programName == "CP" ? 'selected="selected"' : ''}>
                    CP</option>
                <option value="CPA" ${member.programName == "CPA" ? 'selected="selected"' : ''}>
                    CPA</option>
                <option value="ITID" ${member.programName == "ITID" ? 'selected="selected"' : ''}>
                    ITID</option>
                <option value="ITSS" ${member.programName == "ITSS" ? 'selected="selected"' : ''}>
                    ITSS</option>
                <option value="MSD" ${member.programName == "MSD" ? 'selected="selected"' : ''}>
                    MSD</option>
                <option value="Others" ${member.programName == "Others" ? 'selected="selected"' : ''}>
                    Others</option>
            </select>
            <br>
            <label class="pad_top">Year Level:</label>
            <select name="yearLevel">
                <option value="1" ${member.yearLevel == "1" ? 'selected="selected"' : ''}>1</option>
                <option value="2" ${member.yearLevel == "2" ? 'selected="selected"' : ''}>2</option>
                <option value="3" ${member.yearLevel == "3" ? 'selected="selected"' : ''}>3</option>
                <option value="4" ${member.yearLevel == "4" ? 'selected="selected"' : ''}>4</option>
            </select>
            <br>
            <input type="submit" value="Register Now" class="margin_left">
            <input type="reset" value="Reset" class="margin_left">
        </form>
    </section>
                
    <jsp:include page="includes/MVSPFooter.jsp"/>
    
</html>