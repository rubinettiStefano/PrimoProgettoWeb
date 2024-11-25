package com.generation.primoprogettoweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "gestorehobby",value = "/gestorehobby")
public class GestoreHobby extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String nomeHobby = req.getParameter("nome");
		String descrizione = req.getParameter("descrizione");
		int costo = Integer.parseInt(req.getParameter("costoAnnuo"));

		resp.getWriter().println("Hobby con nome="+nomeHobby+" descrizione="+descrizione+" costo="+costo);
	}
}
