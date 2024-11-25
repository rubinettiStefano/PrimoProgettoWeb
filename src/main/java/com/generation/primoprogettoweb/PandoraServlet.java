package com.generation.primoprogettoweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "pandora",value = "/pandora")
public class PandoraServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		//daInsultare -> zoom,onedrive,scrum,macOs

		String aggeggioMalefico = req.getParameter("daInsultare");
		//localhost:8080/PrimoProgettoWeb_war_exploded/pandora?daInsultare=zoom
		//aggeggioMalefico = "zoom";
		//localhost:8080/PrimoProgettoWeb_war_exploded/pandora?daInsultare=scrum
		//aggeggioMalefico = "scrum";


		String nomeJsp;

		switch (aggeggioMalefico)
		{
			case "onedrive" -> nomeJsp = "onedrive.jsp";
			case "scrum" -> nomeJsp = "scrum.jsp";
			case "macOs" -> nomeJsp = "macOs.jsp";
			case "zoom" -> nomeJsp = "zoom.jsp";
			default -> nomeJsp = "notFound.jsp";
		}

		req.getRequestDispatcher(nomeJsp).forward(req,resp);
	}
}
