package ru.user.project.web;

import ru.javavision.Application;
import ru.javavision.Insurance;
import ru.javavision.NewUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class BuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/buy.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String buyIns = request.getParameter("nameIns");
            Insurance insurance = new Insurance(buyIns);
            Application.buyIns(insurance);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
        catch(Exception ex) {
            getServletContext().getRequestDispatcher("/info.jsp").forward(request, response);
        }

    }
}
