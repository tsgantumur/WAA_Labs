package mum.edu.validator;

import mum.edu.domain.Calculation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalcValidatorImpl implements CalcValidator {
	
	public List<String> validate(Object  object ) {
		List<String> errors = new ArrayList<String>();
		
		Calculation calc = (Calculation) object;
		String add1 = calc.getAdd1();
		String add2 = calc.getAdd2();

		String mult1 = calc.getMult1();
		String mult2 = calc.getMult2();

		if(add1 == null || add1.isEmpty())
		{
			errors.add("Invalid input");
		}

		if(add2 == null || add2.isEmpty())
		{
			errors.add("Invalid input");
		}

		if(mult1 == null || mult1.isEmpty())
		{
			errors.add("Invalid input");
		}

		if(mult2 == null || mult2.isEmpty())
		{
			errors.add("Invalid input");
		}

		return errors;
	}
}
