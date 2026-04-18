package com.company;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        String name = req.getParameter("name");
        String dept = req.getParameter("dept");

        res.getWriter().println("Employee Added: " + name + " - " + dept);
    }
}
