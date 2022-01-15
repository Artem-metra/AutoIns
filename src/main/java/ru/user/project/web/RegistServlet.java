package ru.user.project.web;

import ru.javavision.Application;
import ru.javavision.NewUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/regist.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String gosNomer = request.getParameter("stateNumber");
            String serNimer = request.getParameter("driver_license");
            String Fio = request.getParameter("owner");
            String marAuto = request.getParameter("auto");
            NewUser newUser = new NewUser(gosNomer, serNimer, Fio, marAuto);
            Application.insert(newUser);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
        catch(Exception ex) {
            getServletContext().getRequestDispatcher("/info.jsp").forward(request, response);
        }

    }
}
