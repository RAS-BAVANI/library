package com.library;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/library")
public class LibraryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String action = req.getParameter("action");

        if ("add".equals(action)) {
            res.getWriter().println("Add Book clicked");
        } else if ("view".equals(action)) {
            res.getWriter().println("View Books clicked");
        } else if ("issue".equals(action)) {
            res.getWriter().println("Issue Book clicked");
        } else if ("return".equals(action)) {
            res.getWriter().println("Return Book clicked");
        }
    }
}