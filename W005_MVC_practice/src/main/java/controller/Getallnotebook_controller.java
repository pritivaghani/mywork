package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Notebook_dao;
import model.Notebook;

@WebServlet("/display")
public class Getallnotebook_controller extends HttpServlet
{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        	Notebook_dao d = new Notebook_dao();
        	req.setAttribute("data", d.getallnotebook());
        	req.getRequestDispatcher("Index.jsp").forward(req, resp);
        }
}
