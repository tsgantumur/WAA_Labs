package mum.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController
{
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String welcomePage()
	{
		return "index";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String Login(HttpServletRequest request, HttpServletResponse response)  {
		ServletContext ctx = request.getServletContext();
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		String expectedPassword = userService.getPassword(password);

		if (expectedPassword == null || !expectedPassword.equals(password)) {
			request.setAttribute("status", "Login incorrect!");

			return "display";

		} else {
			request.setAttribute("ask", true);
			request.getSession().setAttribute("user", name.toUpperCase());

			return "display";
		}
	}

}
