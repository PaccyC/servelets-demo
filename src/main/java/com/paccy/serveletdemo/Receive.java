package com.paccy.serveletdemo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import  jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import  jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.*;

@WebServlet("/addNumbers")
public class Receive extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
   int operationType= Integer.parseInt(request.getParameter("operation"));
//   Using requestDispatcher


   /**
      RequestDispatcher rd;
      request.setAttribute("num1",num1);
       request.setAttribute("num2",num2);


        try {
            if(operationType == 1){
                rd=request.getRequestDispatcher("sum");

                rd.forward(request,response);
            }
            else{
                rd= request.getRequestDispatcher("subtract");
                rd.forward(request,response);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
     **/
//   Using sessions

Cookie num1Cookie= new Cookie("num1",String.valueOf(num1));
Cookie num2Cookie= new Cookie("num1",String.valueOf(num2));
Cookie operationCookie= new Cookie("operation",String.valueOf(operationType));


num1Cookie.setMaxAge(3600);
num2Cookie.setMaxAge(3600);
operationCookie.setMaxAge(3600);

response.addCookie(num1Cookie);
response.addCookie(num2Cookie);
response.addCookie(operationCookie);
        if(operationType == 1){
           response.sendRedirect("sum");


        }
        else{
     response.sendRedirect("subtract");

        }

    }
}