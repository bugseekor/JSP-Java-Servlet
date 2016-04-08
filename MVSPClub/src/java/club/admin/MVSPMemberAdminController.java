/*
 * MVSPMemberAdminController.java
 * Created on : Apr 1, 2016
 * Author : spark1435
 */
package club.admin;

import club.business.Member;
import club.data.MemberDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author spark1435
 */
public class MVSPMemberAdminController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                

//        String url = "/index.jsp";
//        
//        // get current action
//        String action = request.getParameter("action");
//        if (action == null) {
//            action = "displayMembers";  // default action
//        }
//        
//        // perform action and set URL to appropriate page
//        if (action.equals("displayMembers")) {            
//            // get list of users
//            ArrayList<Member> members = MemberDB.selectMembers();
//
//            // set as a request attribute
//            request.setAttribute("members", members);
//            // forward to index.jsp
//            url = "/MVSPDisplayMembers.jsp";
//        } 
//        else if (action.equals("addMember")) {
//            
//            url = "/MVSPMember.jsp";
//        }
//        else if (action.equals("displayMember")) {
//            // update user in database
//            String emailAddress = (String)request.getParameter("emailAddress");
//            Member member = MemberDB.selectMember(emailAddress);
//            // get current user list and set as request attribute
//            request.setAttribute("member", member);
//            
//            // forward to index.jsp
//            url = "/MVSPMember.jsp";
//        }
//        else if (action.equals("registerMember")) {
//            
//            Member newMember = new Member();
//            newMember.setFullName(request.getParameter("fullName"));
//            newMember.setEmailAddress(request.getParameter("emailAddress"));
//            newMember.setPhoneNumber(request.getParameter("phoneNumber"));
//            newMember.setProgramName(request.getParameter("programName"));
//            newMember.setYearLevel(Integer.parseInt(request.getParameter("yearLevel")));
//            
//            String errorMessage = "";
//            if(!newMember.isValid()){
//                errorMessage = "Member information is not valid. " +
//                        "You must enter a valid name and email";
//                url = "/MVSPMember.jsp";
//                request.setAttribute("member", newMember);
//                request.setAttribute("errorMessage", errorMessage);
//            }
//            else{
//                Member oldMember = MemberDB.selectMember(newMember.getEmailAddress());
//                if(oldMember == null){
//                    MemberDB.insert(newMember);
//                    System.out.println("New member inserted");
//                }
//                else{
//                    MemberDB.update(newMember);
//                    System.out.println("New member inserted");
//                }
//                ArrayList<Member> members = MemberDB.selectMembers();
//                // set as a request attribute
//                request.setAttribute("members", members);
//                // forward to index.jsp
//                url = "/MVSPDisplayMembers.jsp";
//            }
//        }
//        else if (action.equals("deleteMember")) {
//
//            String emailAddress = (String)request.getParameter("emailAddress");
//            Member member = MemberDB.selectMember(emailAddress);
//            MemberDB.delete(member);
//
//            ArrayList<Member> members = MemberDB.selectMembers();
//            // set as a request attribute
//            request.setAttribute("members", members);
//            // forward to index.jsp
//            url = "/MVSPDisplayMembers.jsp";
//
//        }   
//
//        getServletContext()
//                .getRequestDispatcher(url)
//                .forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/index.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "displayMembers";  // default action
        }
        
        // perform action and set URL to appropriate page
        if (action.equals("displayMembers")) {            
            // get list of users
            ArrayList<Member> members = MemberDB.selectMembers();

            // set as a request attribute
            request.setAttribute("members", members);
            // forward to index.jsp
            url = "/MVSPDisplayMembers.jsp";
        } 
        else if (action.equals("addMember")) {
            
            url = "/MVSPMember.jsp";
        }
        else if (action.equals("displayMember")) {
            // update user in database
            String emailAddress = (String)request.getParameter("emailAddress");
            Member member = MemberDB.selectMember(emailAddress);
            // get current user list and set as request attribute
            request.setAttribute("member", member);
            
            // forward to index.jsp
            url = "/MVSPMember.jsp";
        }
        else if (action.equals("confirmDeleteMember")) {
            // update user in database
            String emailAddress = (String)request.getParameter("emailAddress");
            Member member = MemberDB.selectMember(emailAddress);
            // get current user list and set as request attribute
            request.setAttribute("member", member);
            
            // forward to index.jsp
            url = "/MVSPConfirmMemberDelete.jsp";
        }
        
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String url = "/index.jsp";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "displayMembers";  // default action
        }

        if (action.equals("registerMember")) {

            Member newMember = new Member();
            newMember.setFullName(request.getParameter("fullName"));
            newMember.setEmailAddress(request.getParameter("emailAddress"));
            newMember.setPhoneNumber(request.getParameter("phoneNumber"));
            newMember.setProgramName(request.getParameter("programName"));
            newMember.setYearLevel(Integer.parseInt(request.getParameter("yearLevel")));

            String errorMessage = "";
            if(!newMember.isValid()){
                errorMessage = "Member information is not valid. " +
                        "You must enter a valid name and email";
                url = "/MVSPMember.jsp";
                request.setAttribute("member", newMember);
                request.setAttribute("errorMessage", errorMessage);
            }
            else{
                Member oldMember = MemberDB.selectMember(newMember.getEmailAddress());
                if(oldMember == null){
                    MemberDB.insert(newMember);
                    System.out.println("New member inserted");
                }
                else{
                    MemberDB.update(newMember);
                    System.out.println("New member inserted");
                }
                ArrayList<Member> members = MemberDB.selectMembers();
                // set as a request attribute
                request.setAttribute("members", members);
                // forward to index.jsp
                url = "/MVSPDisplayMembers.jsp";
            }
        }
        else if (action.equals("deleteMember")) {

            String emailAddress = (String)request.getParameter("emailAddress");
            Member member = MemberDB.selectMember(emailAddress);
            MemberDB.delete(member);

            ArrayList<Member> members = MemberDB.selectMembers();
            // set as a request attribute
            request.setAttribute("members", members);
            // forward to index.jsp
            url = "/MVSPDisplayMembers.jsp";

        }   

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
