package com.generation.primoprogettoweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "prima",value = "/prima")
public class LaMiaPrimaServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		//resp.getWriter().print("MANNAGGINA MONDO!!!");
		//quando il metodo TERMINA, in automatico TOMCAT restituisce la response al chiamante
		//manda come response la jsp chiamata prima.jsp
		req.getRequestDispatcher("prima.jsp").forward(req,resp);
	}
}
