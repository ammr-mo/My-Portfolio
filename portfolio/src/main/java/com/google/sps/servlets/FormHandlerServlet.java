package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String fullName = request.getParameter("name");
    String email = request.getParameter("email");
    String subject = request.getParameter("subject");
    String textValue = request.getParameter("text-input");

    // Print the value so you can see it in the server logs.
    System.out.println("From: " + fullName);
    System.out.println("Email: " + email);
    System.out.println("Subject: " + subject);
    System.out.println("Message: " + textValue);

    // Return to main page
    response.sendRedirect("https://amohamed-sps-summer21.appspot.com/");
  }
}