package com.paccy.serveletdemo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/sum")

public class Sum  extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        int a = (int) request.getAttribute("num1");
//        int b= (int) request.getAttribute("num2");
//    int sum=a+b;
//        PrintWriter out= response.getWriter();
//        response.setContentType("text/html");
//        out.println("The answer is :"+sum);
//        System.out.println("The sum is "+sum);

        Cookie[] cookies = request.getCookies();
        int num1=0,num2=0;

        for (Cookie cookie: cookies){
            if (cookie.getName().equals("num1")){
                num1 = Integer.parseInt(cookie.getValue());
            } else if (cookie.getName().equals("num2")) {
                num2= Integer.parseInt(cookie.getValue());
            }
        }
        int sum= num1 +num2;
        PrintWriter out= response.getWriter();
      response.setContentType("text/html");
       out.println("The answer is :"+sum);
      System.out.println("The sum is "+sum);

    }
}
