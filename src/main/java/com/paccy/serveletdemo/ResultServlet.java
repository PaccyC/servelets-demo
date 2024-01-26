package com.paccy.serveletdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "ResultServlet", value = "/resultServlet")
public class ResultServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Retrieve the result attribute set by AddNumberServlet
        String sumResult = (String) request.getAttribute("sumResult");

        // Display the result
        response.getWriter().println("<h2>" + sumResult + "</h2>");
    }
}