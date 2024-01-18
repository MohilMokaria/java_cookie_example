/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddCookie")
public class AddCookie extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Name = request.getParameter("Name");
            String Age = request.getParameter("Age");
            Cookie ck1 = new Cookie("Username", Name);
            Cookie ck2 = new Cookie("Userage", Age);
            response.addCookie(ck1);
            response.addCookie(ck2);
            out.println("Cookie has been added");
            out.println("<a href=" + request.getContextPath() + "/ShowCookie>click here to go to next page</a>");
        }
    }

}
