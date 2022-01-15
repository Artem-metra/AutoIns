package ru.user.project.web;

import ru.javavision.Application;
import ru.javavision.Insurance;
import ru.javavision.User;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;


public class AutorizServlet extends HttpServlet {
    private static final String userr = "postgres";
    private static final String password = "admin";
    private static final String url = "jdbc:postgresql://localhost:5432/auto_insurance";
    private static final String sql = "SELECT * FROM Auto WHERE state_number =  ? AND driver_license = ?;";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gosNomer = request.getParameter("gosNomer");
        String seriaNomer = request.getParameter("seriaNomer");

        User user = new User();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(url, userr, password);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, gosNomer);
            preparedStatement.setString(2, seriaNomer);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user.setState_number(resultSet.getString("state_number"));
                user.setDriver_license(resultSet.getString("driver_license"));
                user.setId(resultSet.getInt("id"));
            }
            connection.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        request.getSession().setAttribute("user", user);
        if (gosNomer.equals(user.getState_number()) & seriaNomer.equals(user.getDriver_license())) {
            request.getRequestDispatcher("/main.jsp").forward(request, response);

        } else {
            request.setAttribute("errorMessage", "Login or password is not true");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }


}

