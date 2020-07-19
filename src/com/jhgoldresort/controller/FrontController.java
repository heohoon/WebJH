package com.jhgoldresort.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.jh")
public class FrontController extends HttpServlet {


    private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("actionDo");
        RequestDispatcher dispatcher = null;
        String uri = request.getRequestURI();
        System.out.println("URI : " + uri);
        String conPath = request.getContextPath();
        System.out.println("conPath: " + conPath);
        String command = uri.substring(conPath.length());
        System.out.println("command :" + command);
        dispatcher = request.getRequestDispatcher("/dispatcher.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
        actionDo(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost");
        actionDo(request, response);

    }
}

