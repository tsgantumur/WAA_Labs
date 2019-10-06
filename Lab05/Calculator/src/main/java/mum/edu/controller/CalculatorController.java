package mum.edu.controller;

import mum.edu.domain.Calculation;
import mum.edu.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
public class CalculatorController {
	private static final long serialVersionUID = 1L;

	@Autowired
	CalculatorService calculatorService;

	@RequestMapping(value = { "/", "/Calculator" }, method = RequestMethod.GET )
	public String calculate() throws Exception {

		return "CalculatorForm";
	}

	@RequestMapping(value= "/Calculator" , method = RequestMethod.POST)
	public String handleCalc(Calculation calculator, Model model, RedirectAttributes redirectAttributes ) throws Exception {

		if (calculator.getAdd1() != null &&
				calculator.getAdd2() != null)
			calculatorService.add(calculator);

		if (calculator.getMult1() != null &&
				calculator.getMult2() != null)
			calculatorService.mult(calculator);

		redirectAttributes.addFlashAttribute( "calculator", calculator);
		String heading = "Success!";
		redirectAttributes.addAttribute( "heading","Kemosabe!");

		return  "redirect:results" ;
	}

	@RequestMapping(value = "/results", method = RequestMethod.GET)
	public String result(Model model) throws IOException {
		Calculation calculator = (Calculation)( ((ModelMap) model).get("calculator") );

		if (calculator == null)
			throw new IOException("The calculation is Obsolete, Try Again!");

		return "CalculatorView";
	}
}
