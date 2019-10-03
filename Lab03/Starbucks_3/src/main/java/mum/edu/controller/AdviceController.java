package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AdviceController
{
	private static final long serialVersionUID = 1L;

	@Autowired
	AdviceService adviceService;

	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public String showAdvice(HttpServletRequest request, HttpServletResponse response) {

		String roast = request.getParameter("roast");

		List<String> advice = adviceService.getAdvice(roast);
		request.setAttribute("ask", false);
		request.setAttribute("roast", roast);
		request.setAttribute("items", advice);

		return "display";

	}

}
