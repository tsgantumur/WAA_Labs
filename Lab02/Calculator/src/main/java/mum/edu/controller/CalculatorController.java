package mum.edu.controller;

import mum.edu.domain.Calculation;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.CalcValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class CalculatorController {
	private static final long serialVersionUID = 1L;

	@AutoWired
	CalcValidator productValidator;

	@RequestMapping(value = { "/", "/calculator.do" } )
	public String calculate(HttpServletRequest request, HttpServletResponse response) {

		return "/WEB-INF/calculator.jsp";
	}

	@RequestMapping(value = "/result.do")
	public String result(Calculation calc, HttpServletRequest request, HttpServletResponse response) {

		calc.setAdd1(request.getParameter("add1").trim());
		calc.setAdd2(request.getParameter("add2").trim());
		calc.setMult1(request.getParameter("mult1").trim());
		calc.setMult2(request.getParameter("mult2").trim());
		String sum = "";
		String mult = "";

		List<String> errors = productValidator.validate(calc);

		if(errors.isEmpty())
		{
			try {
				Integer a1 = Integer.parseInt(calc.getAdd1());
				Integer a2 = Integer.parseInt(calc.getAdd2());
				sum = "" + (a1+a2);
			} catch(NumberFormatException e) {
				//do nothing
			}

			try {
				Integer m1 = Integer.parseInt(calc.getMult1());
				Integer m2 = Integer.parseInt(calc.getMult2());
				mult = "" + (m1 * m2);
			} catch(NumberFormatException e) {
				//do nothing
			}

			request.setAttribute("add1", calc.getAdd1());
			request.setAttribute("add2", calc.getAdd2());
			request.setAttribute("mult1", calc.getMult1());
			request.setAttribute("mult2", calc.getMult2());
			request.setAttribute("sum", sum);
			request.setAttribute("mult", mult);

			return "/WEB-INF/result.jsp";
		} else {
			request.setAttribute("errors", errors);

			return "/WEB-INF/error.jsp";
		}


		}
 

}
