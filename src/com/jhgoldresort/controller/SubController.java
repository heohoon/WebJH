package com.jhgoldresort.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.json")
public class SubController extends HttpServlet {


    private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("sub_actionDo");
        RequestDispatcher dispatcher = null;
        String uri = request.getRequestURI();
        System.out.println("sub_URI : " + uri);
        String conPath = request.getContextPath();
        System.out.println("sub_conPath: " + conPath);
        String command = uri.substring(conPath.length());
        System.out.println("sub_command :" + command);
        dispatcher = request.getRequestDispatcher("/dispatcher.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("sub_doGet");
        actionDo(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("sub_doPost");
        actionDo(request, response);

    }
}

