package ru.user.project.web;

import ru.javavision.AllInformation;
import ru.javavision.Application;
import ru.javavision.User;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/info.jsp").forward(request, response);


        AllInformation allInformation = Application.selectOne(2);
        request.setAttribute("allInformation", allInformation);
        getServletContext().getRequestDispatcher("/info.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
