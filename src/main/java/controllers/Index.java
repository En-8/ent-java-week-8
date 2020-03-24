package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/"})
public class Index extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

    }
}
