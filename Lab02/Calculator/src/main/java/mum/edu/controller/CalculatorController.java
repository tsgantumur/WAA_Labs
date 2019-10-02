package mum.edu.controller;

import mum.edu.domain.Product;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.ProductValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class CalculatorController {
	private static final long serialVersionUID = 1L;

	@AutoWired
	ProductValidator productValidator;

	@RequestMapping(value = { "/", "calculator.do" } )
	public String calculate(HttpServletRequest request, HttpServletResponse response) {

		return "/WEB-INF/calculator.jsp";
	}

	@RequestMapping(value = "/result.do")
	public String result(Product product, HttpServletRequest request, HttpServletResponse response) {
		List<String> errors = productValidator.validate(product);

 		String add1 = request.getParameter("add1").trim();
		String add2 = request.getParameter("add2").trim();
		String mult1 = request.getParameter("mult1").trim();
		String mult2 = request.getParameter("mult2").trim();
		String sum = "";
		String mult = "";

		if(errors.isEmpty())
		{
			try {
				Integer a1 = Integer.parseInt(add1);
				Integer a2 = Integer.parseInt(add2);
				sum = "" + (a1+a2);
			} catch(NumberFormatException e) {
				//do nothing
			}

			try {
				Integer m1 = Integer.parseInt(mult1);
				Integer m2 = Integer.parseInt(mult2);
				mult = "" + (m1 * m2);
			} catch(NumberFormatException e) {
				//do nothing
			}

			request.setAttribute("add1", add1);
			request.setAttribute("add2", add2);
			request.setAttribute("mult1", mult1);
			request.setAttribute("mult2", mult2);
			request.setAttribute("sum", sum);
			request.setAttribute("product", mult);

			return "/WEB-INF/result.jsp";
		} else {
			request.setAttribute("errors", errors);
			request.setAttribute("form", product);

			return "/WEB-INF/error.jsp";
		}


		}
 

}
