package com.paccy.serveletdemo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import  jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import  jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.*;

@WebServlet("/addNumbers")
public class AddNumberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        int sum = num1 + num2;

        response.getWriter().println("Sum: " + sum);
    }
}