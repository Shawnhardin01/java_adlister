package com.codeup.adlister.controllers;

import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Show the registration form
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Ensure the submitted information is valid
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        if (username == null || username.trim().isEmpty() || password == null || password.isEmpty() ||
                !password.equals(confirmPassword)) {
            // Invalid input, show error message and return to registration form
            request.setAttribute("errorMessage", "Invalid input");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
            return;
        }

        // TODO Create a new user based off of the submitted information
        // TODO If a user was successfully created, send them to their profile
        // TODO Failed to create user, show error message and return to registration form
    }
}
