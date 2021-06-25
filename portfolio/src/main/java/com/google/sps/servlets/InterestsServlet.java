package com.google.sps.servlets;

import java.io.IOException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Handles requests sent to the /interests URL. Try running a server and navigating to /interests! */
@WebServlet("/interests")
public class InterestsServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> myInterests = new ArrayList<String>();
    myInterests.add("I am interested in AI and want to learn more about Natural Language Processing.");
    myInterests.add("My favorite color is Orange.");
    myInterests.add("I am from Minnesota, and my family is Somali.");

    Gson gson = new Gson();
    String json = gson.toJson(myInterests);
    response.setContentType("text/json;");
    response.getWriter().println(json);
  }
}
