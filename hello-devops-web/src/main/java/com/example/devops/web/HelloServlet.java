
package com.example.devops.web;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/plain; charset=UTF-8");
        PrintWriter out = res.getWriter();
        String who = req.getParameter("name");
        if (who == null || who.isBlank()) {
            who = "DevOps Engineer";
        }
        out.println("Hello, " + who + " — welcome to hello-devops-web!");
    }
}
